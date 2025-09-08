package com.example.project.models;

public abstract class DecoradoresPizza implements Pizza {
    protected Pizza pizzaDecorada;

    public DecoradoresPizza(Pizza pizzaDecorada) {
        this.pizzaDecorada = pizzaDecorada;
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao();
    }

    @Override
    public double getPreco() {
        return pizzaDecorada.getPreco();
    }
}
