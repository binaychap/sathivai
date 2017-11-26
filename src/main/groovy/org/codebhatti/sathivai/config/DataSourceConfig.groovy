package org.codebhatti.sathivai.config

import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoDbFactory

/**
 * Created by binayrai on 9/3/17.
 */
@Configuration
class DataSourceConfig{

    @Value('${spring.data.mongodb.host}')
    String host
    @Value('${spring.data.mongodb.database}')
    String database
    @Value('${spring.data.mongodb.port}')
    Integer port


    @Bean(name = 'mongoTemplate')
    @Profile("development")
    MongoTemplate development(){
        return getMongoTemplate()
    }

    @Bean(name = 'mongoTemplate')
    @Profile("production")
    MongoTemplate production(){
        return getMongoTemplate()
    }

    /*
     * Method that creates MongoDbFactory
     * Common to both of the MongoDb connections
     */
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(getMongoClient(), database)
    }

    /*
     * Method that creates MongoClient
     */
    private MongoClient getMongoClient() {
        return new MongoClient(host, port)
    }

    MongoTemplate getMongoTemplate() {
        return new MongoTemplate(mongoDbFactory())
    }
}
