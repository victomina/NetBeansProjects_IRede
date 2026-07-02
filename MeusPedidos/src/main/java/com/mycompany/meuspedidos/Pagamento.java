package com.mycompany.meuspedidos;


public abstract class Pagamento {
    protected double valor;
    
    public Pagamento(double valor){
        this.valor = valor;
    }
    
    //contrato obrigatório
    
    //classe abstratas são classes que não são instanciadas
    public abstract void processar();
    public abstract  double calcularTaxa();
    
    public double valorFinal(){
        return valor +calcularTaxa();
    }
}
