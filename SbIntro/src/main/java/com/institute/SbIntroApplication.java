package com.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication application holds @ComponentScan which is responsible
for creating objects of spring classes, scanning them and storing them in container;
holds @Configuration which declares configuration class; holds EnableAutoConfiguration.
*/

@SpringBootApplication
public class SbIntroApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbIntroApplication.class, args);
		
	}


}
