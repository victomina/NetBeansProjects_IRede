package com.mycompany.meuspedidos;

public class MeusPedidos {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose","352.704.280-67");
        //cliente.setCpf("352.704.280-67");
        
        Produto produto = new Produto();
        produto.setNomme("Carne vegana");
        produto.setPreco(34.00);
        
        
        Produto produto2 = new Produto("Refrigerante saudavel",12.09);
        
        
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setTotal(produto.getPreco() + produto2.getPreco());
        
        
    }
}
