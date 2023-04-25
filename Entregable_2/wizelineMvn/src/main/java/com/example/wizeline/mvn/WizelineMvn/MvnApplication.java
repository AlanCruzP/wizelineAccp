package com.example.wizeline.mvn.WizelineMvn;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableFeignClients
@EnableKafka
public class MvnApplication extends Thread {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MvnApplication.class, args);
	}

}