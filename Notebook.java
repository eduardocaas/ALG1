package com.efc;

public class Notebook extends Computador {

    private Integer tempoDeBateria;

    @Override
    protected void getInformacoes() {
        super.getInformacoes();
        System.out.println(" - tempo de bateria: " + this.tempoDeBateria);
    }

    @Override
    protected void cadastrar(String mod, String cor, Double preco, Integer tempoDeBateria) {
        super.modelo = mod;
        super.cor = cor;
        super.preco = preco;
        this.tempoDeBateria = tempoDeBateria;
    }


}
