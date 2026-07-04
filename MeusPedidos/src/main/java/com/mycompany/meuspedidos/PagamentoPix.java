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
    
}
