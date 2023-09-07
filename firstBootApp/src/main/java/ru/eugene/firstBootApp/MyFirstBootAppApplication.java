package ru.eugene.firstBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MyFirstBootAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyFirstBootAppApplication.class, args);
	}
}
