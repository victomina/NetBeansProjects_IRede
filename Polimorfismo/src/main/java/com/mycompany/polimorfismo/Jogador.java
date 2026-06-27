package com.mycompany.polimorfismo;

/**
 *
 * @author Victomina
 */
public abstract class Jogador {
    protected String nome;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    // OVERRIDE: cada subclasse reescreve
    public abstract void finalizar();
    
    //OVERLOAD: mesmo nome, assinatura diferentes, mas participam da mesma classe.
    
    public void passe(){
        System.out.println("Toca curto para o lado.");
    }
    public void passe(int metros){
        System.out.println(nome + " lança a bola" + metros + " metros.");
    }
}
