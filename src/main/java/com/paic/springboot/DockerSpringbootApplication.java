package com.paic.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}


	@RequestMapping("/hello")
	public String  hello(){
		return "hello docker springboot";
	}

	@RequestMapping("/test")
	public String  test(){
		return "springboot jenkins  git test";
	}
}
