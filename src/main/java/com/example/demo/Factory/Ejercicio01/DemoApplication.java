package com.example.demo.Factory.Ejercicio01;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		CafeFactory cafeFactory = new CafeFactory();

		Cafe espresso = cafeFactory.prepararCafe("Espresso");
		Cafe latte = cafeFactory.prepararCafe("Latte");

		espresso.preparar();
		latte.preparar();		
	}

}
