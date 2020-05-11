package com.springbootpart1.springboot1katleho;

import Model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot1katlehoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1katlehoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {//arrow function or lamddas
			System.out.println("Lets inspect Beans");

			String[] beanNames = ctx.getBeanDefinitionNames();

			for(String beanName : beanNames){
				System.out.println(beanName);
			}
		};
	}
}
