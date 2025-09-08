package com.example.project.models;
//DECORADOR CONCRETO: Adiciona o comportamento a partir do Decorador Abstrato
public class DecoradorAzeitona extends DecoradoresPizza { //adiciona azeitonas ao decorator abstrato

    public DecoradorAzeitona(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", Azeitona";
    }

    @Override
    public double getPreco() {
        return pizzaDecorada.getPreco() + 2.0;
    }
}