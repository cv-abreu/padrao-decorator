package com.example.project;
import com.example.project.models.Pizza;
import com.example.project.models.PizzaBase;
import com.example.project.models.DecoradoresPizza;
import com.example.project.models.DecoradorAzeitona;
import com.example.project.models.DecoradorTomate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication { //classe principal do projeto

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);

		System.out.println("> Exemplo");
		Pizza myPizza = new PizzaBase();
		System.out.println("Pedido: " + myPizza.getDescricao()); 
		System.out.println("Preço: R$" + myPizza.getPreco());
		System.out.println("-------------------------------------------");
	}

		
}