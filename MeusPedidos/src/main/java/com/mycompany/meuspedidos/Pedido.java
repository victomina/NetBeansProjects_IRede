package com.mycompany.meuspedidos;

import java.util.List;

public class Pedido {
    
    private Cliente cliente;
    private List<ItemPedido> itens;
    
    
    public Pedido(Cliente cliente, double total) {
        this.cliente = cliente;
      }

    Pedido(Cliente newCliente) {
        this.cliente = newCliente;
    }

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido itempedido = new ItemPedido(produto,quantidade);
        itempedido.add(itempedido);
    }
    
    public void exibirProdutos(){
        for(ItemPedido item : itens){
            System.out.println(item.getProduto().getNomme() + " " + item.getProduto().getPreco());
        }
    }
    
    public double calcularTotal(){
        if(itens.isEmpty()){
            return 0;
        }
       double total = 0;
       for(ItemPedido item : itens){
         total = total + item.calcularSubtotal();
       }
         return total;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

       
}
