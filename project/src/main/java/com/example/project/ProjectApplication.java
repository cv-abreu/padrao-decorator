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

		//Criando pedido de pizza base
		System.out.println("Pedido 1: Pizza Base");
		Pizza myPizza = new PizzaBase();
		System.out.println("Pedido: " + myPizza.getDescricao()); 
		System.out.println("Preço: R$" + myPizza.getPreco());
		System.out.println("-------------------------------------------");

		//Adicionando Azeitonas
		System.out.println("Pedido 2: Pizza Base + Azeitonas");
		myPizza = new DecoradorAzeitona(myPizza); //decorando a pizza base com azeitonas
		System.out.println("Pedido: " + myPizza.getDescricao());
		System.out.println("Preço: R$" + myPizza.getPreco());
		System.out.println("-------------------------------------------");

		//Adicionando Tomates
		System.out.println("Pedido 3: Pizza Base + Azeitonas + Tomates");
		myPizza = new DecoradorTomate(myPizza); //decorando a pizza base com tomates
		System.out.println("Pedido: " + myPizza.getDescricao());
		System.out.println("Preço: R$" + myPizza.getPreco());
		System.out.println("-------------------------------------------");

	}

		
}