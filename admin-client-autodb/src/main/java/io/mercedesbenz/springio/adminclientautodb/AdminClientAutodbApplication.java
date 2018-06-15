package io.mercedesbenz.springio.adminclientautodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AdminClientAutodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminClientAutodbApplication.class, args);
	}
}
