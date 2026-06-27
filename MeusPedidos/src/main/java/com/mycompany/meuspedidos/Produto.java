package com.mycompany.meuspedidos;

public class Produto {
     private String Nomme;
     private double preco;
     
     //mandando pelo método construtor. 
    public Produto(){} 
     
    public Produto(String Nomme, double preco) {
        this.Nomme = Nomme;
        this.preco = preco;
    } 
     
    public String getNomme() {
        return Nomme;
    }

    public void setNomme(String Nomme) {
        this.Nomme = Nomme;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
     
     
}
