package com.mycompany.meuspedidos;

import java.util.List;

public class Pedido {
    
    private Cliente cliente;
    private List<ItemPedido> itens;
    private double total;
    
    public Pedido(Cliente cliente, double total) {
        this.cliente = cliente;
        this.total = total;
    }

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido itempedido = new ItemPedido(produto,quantidade);
        itempedido.add(itempedido);
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
