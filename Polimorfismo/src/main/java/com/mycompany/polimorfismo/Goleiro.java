package com.mycompany.polimorfismo;

public class Goleiro extends Jogador{
    public Goleiro (String nome){
        super(nome);
    }
    
    @Override //sobreescrita de metodo
    public void finalizar(){
        System.out.println(this.nome + " somente chuta e reza");
    }
}
