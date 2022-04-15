package com.WGQuintrix.helloworld.config;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class HelloWorldConfig implements RepositoryRestConfigurer {
	
	
	private EntityManager entityManager;
	
	@Autowired
	public HelloWorldConfig(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

}
