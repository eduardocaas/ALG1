package com.efc;

public abstract class Computador {

    protected String modelo;
    protected String cor;
    protected Double preco;

    protected void getInformacoes(){
        System.out.print("Modelo: " + this.modelo + " - Cor: " + this.cor + " - Preco: " + this.preco);
    }

    protected abstract void cadastrar(String mod, String cor, Double preco, Integer attr);
}
