package com.rcoem.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DevopsApplication.class, args);
//	}

		public static void main(String[] args) {
			String[] fortunes = {"You will pass this lab!", "Success is in your Jenkinsfile.", "Error 404: Fortune not found."};
			int random = (int) (Math.random() * fortunes.length);
			System.out.println("THE ORACLE SAYS: " + fortunes[random]);
		}
	}

