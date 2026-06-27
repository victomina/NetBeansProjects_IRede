package com.mycompany.polimorfismo;

public class Atacante extends Jogador{
    
    public Atacante(String nome){
        super(nome);
    }

    @Override
    public void finalizar() {
        System.out.println(nome + " chuta de primeira para o gol!!");
    }
}
