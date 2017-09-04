package org.codebhatti.sathivai


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
@EnableConfigurationProperties
class SathivaiApplication {

	static void main(String[] args) {
		SpringApplication.run SathivaiApplication, args
	}

}
