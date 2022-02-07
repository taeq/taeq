package com.qtae.businfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BusinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinfoApplication.class, args);
	}

}
