package me.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "me.portfolio")
public class PortfolioApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	
}
