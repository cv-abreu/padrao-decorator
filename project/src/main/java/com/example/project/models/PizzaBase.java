package com.example.project.models;

public class PizzaBase implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza Simples"
    }

    @Override
    public double getPreco() {
        return 40.0;
    }
}
