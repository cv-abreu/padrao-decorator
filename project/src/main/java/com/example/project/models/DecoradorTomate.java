package com.example.project.models;

public class DecoradorTomate extends DecoradoresPizza { //adiciona tomates ao decorator abstrato

    public DecoradorTomate(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", Tomate";
    }

    @Override
    public double getPreco() {
        return pizzaDecorada.getPreco() + 4.0;
    }
}