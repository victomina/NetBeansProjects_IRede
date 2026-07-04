package com.mycompany.meuspedidos;

public class PagamentoCartao extends Pagamento {

    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }
        
    @Override
    public void processar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularTaxa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
