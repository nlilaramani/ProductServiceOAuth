package com.productservice.ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class ProductServiceApplication {
       	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
