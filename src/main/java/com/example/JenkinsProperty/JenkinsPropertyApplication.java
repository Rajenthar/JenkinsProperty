package com.example.JenkinsProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsPropertyApplication {

	@Value("${jenkins.property1.sub1}")
	private String sub1;

	@Value("${jenkins.property2}")
	private String property2;

	@Value("${environment.property1}")
	private String env1;

	@Value("${environment.property2}")
	private String env2;


	public static void main(String[] args) {
		SpringApplication.run(JenkinsPropertyApplication.class, args);
	}

	@PostConstruct
	public void printProperties() {
		System.out.println("Application property sub1: " + sub1);
		System.out.println("Application property2: " + property2);
		System.out.println("Environment property1: " + env1);
		System.out.println("Environment property2: " + env2);
	}
}
