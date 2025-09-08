package com.example.project.models;

//DECORADOR CONCRETO: Adiciona o comportamento a partir do Decorador Abstrato
public class DecoradorTomate extends DecoradoresPizza { //EX: adiciona tomates ao decorator abstrato

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