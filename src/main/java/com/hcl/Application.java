package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


import com.hcl.beans.Employee;

@SpringBootApplication
@Configuration
public class Application extends SpringBootServletInitializer
 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		}
		 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(Application.class);
    }

	

}
