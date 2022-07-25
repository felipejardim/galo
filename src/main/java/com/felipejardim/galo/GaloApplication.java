package com.felipejardim.galo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ScheduledExecutorService;

@SpringBootApplication
public class GaloApplication {

	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		Thread nucleo = new Thread(relogio);
		nucleo.start();
		SpringApplication.run(GaloApplication.class, args);
	}
}
