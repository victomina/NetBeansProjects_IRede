package com.mycompany.meuspedidos;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Gerando chave Pix...");
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public double valorFinal() {
        double valorParcial = super.valorFinal();
        double valorDesconto = valor * 0.1;
        return valorParcial - valorDesconto;
    }
     
    
}
