package com.mycompany.meuspedidos;

public class ItemPedido {
   private Produto produto;
   private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
   public double calcularSubtotal(){
       return produto.getPreco() * quantidade;
   }

    void add(ItemPedido itempedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
}
