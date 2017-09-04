package org.codebhatti.sathivai

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Created by binayrai on 9/2/17.
 */

@Component
@ConfigurationProperties(prefix = "myConfig")
class MyAppConfig {
    String appName
    String appDescription
    String adminFirstName
    String adminLastName
    String adminEmail


    @Override
     String toString() {
        return "MyAppConfig{" +
                "appName='" + appName + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
