package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication { //classe principal do projeto

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);

		System.out.println("> Exemplo");
		Pizza myPizza = new PizzaBase();
		System.out.println("Pedido: " + myPizza.getDescription()); 
		System.out.println("Preço: R$" + myPizza.getCost());
		System.out.println("-------------------------------------------");
	}

		
}