package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.hcl.beans.Employee;

@SpringBootApplication
@Configuration
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//Employee e = context.getBean(Employee.class);
		//e.setId(1);
		//e.setName("rupak");
		//System.out.println(e);
	}

}
