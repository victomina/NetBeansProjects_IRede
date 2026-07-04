package com.mycompany.meuspedidos;

public class PagamentoCartao extends Pagamento {

    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }
            
    @Override
    public void processar() {
        System.out.println("Processando cartao em: " + parcelas + " vezes");
    }

    @Override
    public double calcularTaxa() {
        // condicao ? resultado positivo : resultado_ negativo
        return parcelas > 1 ? valor * 0.02 : 0;
    }
    
}
