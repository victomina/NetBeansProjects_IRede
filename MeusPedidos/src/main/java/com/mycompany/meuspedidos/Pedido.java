package com.mycompany.meuspedidos;

public class Pedido {
    
    private Cliente cliente;
    private double total;

//    public Pedido(Cliente cliente, double total) {
//        this.cliente = cliente;
//        this.total = total;
//    }

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
