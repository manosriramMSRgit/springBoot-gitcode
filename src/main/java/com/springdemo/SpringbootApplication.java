package com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("Total Beans are "+ app.getBeanDefinitionCount());
		/*String  beans[]= app.getBeanDefinitionNames();
		System.out.println("Bean names are ");
		for(String name:beans) {
			System.out.println(name);
		}*/
	}

}
