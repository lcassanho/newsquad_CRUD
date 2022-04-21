package br.com.fiap.newsquad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"br.com.fiap.newsquad.controllers, br.com.fiap.newsquad.config"})
public class NewsquadApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsquadApplication.class, args);
	}

}
