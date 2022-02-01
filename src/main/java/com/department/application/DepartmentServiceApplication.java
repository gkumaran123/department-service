package com.department.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.department.controller.DepartmentController;

@Configuration
@SpringBootApplication
@ComponentScan(basePackageClasses = DepartmentController.class)
@ComponentScan({ "com.department.application"})
@ComponentScan({ "com.department.*" })
//@Import({ SecurityConfiguration.class })
//@EnableJpaRepositories(basePackages = "com.department.repository")
//@ComponentScan({ "com.department.application", "com.department.controller" ,"com.department.service" ,"com.department.repository"})
public class DepartmentServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DepartmentServiceApplication.class);
	    }

}
