package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ThangamAlgorithmService;

@SpringBootApplication
public class PolygonalApproximationApplication {

	public static void main(String[] args) {
		ThangamAlgorithmService rdp = new ThangamAlgorithmService();
		SpringApplication.run(PolygonalApproximationApplication.class, args);
	}

}
