package com.mycompany.polimorfismo;

import java.util.ArrayList;

public class Polimorfismo {

    public static void main(String[] args) {
        Jogador goleiro = new Goleiro("Alisson");
        Jogador atacante = new Atacante("Endrick");
        
        ArrayList<Jogador> jogadores;
        jogadores = new ArrayList<>();
        jogadores.add(goleiro);
        jogadores.add(atacante);
        
        for(Jogador jogador :jogadores){
            if(jogador instanceof Goleiro){
                System.out.println("É um goleiro");
            } else if (jogador instanceof Atacante){
                System.out.println("É um atacante");
            }
            goleiro.passe();
            goleiro.passe(45);
        }
    }
}
