package com.example.project.models;

//COMPONENTE CONCRETO: Objeto a ser decorado
public class PizzaBase implements Pizza { //implementação dos métodos da interface

    @Override
    public String getDescricao() {
        return "Pizza Simples";
    }

    @Override
    public double getPreco() {
        return 40.0;
    }
}