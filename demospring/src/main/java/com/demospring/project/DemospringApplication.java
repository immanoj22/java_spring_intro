package com.demospring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DemospringApplication.class, args);

		Car car=applicationContext.getBean(Car.class);
		car.start();
	}

}
