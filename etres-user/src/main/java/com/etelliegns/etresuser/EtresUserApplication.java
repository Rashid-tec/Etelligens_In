package com.etelliegns.etresuser;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class EtresUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtresUserApplication.class);
	}
	@Bean
	ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
