package pl.marcindev.workapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"pl.marcindev.util",
		"pl.marcindev.workapp"}
)
public class WorkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkappApplication.class, args);
	}

}
