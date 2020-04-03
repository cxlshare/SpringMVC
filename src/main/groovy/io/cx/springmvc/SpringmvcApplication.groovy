package io.cx.springmvc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(["io.cx.dao"])
@SpringBootApplication
@ComponentScan(["io.cx.controllers", "io.cx.services"])
@Configuration
class SpringmvcApplication {

	static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication, args)
	}

}
