package com.mycompany.meuspedidos;

public class MeusPedidos {

    public static void main(String[] args) {
        Cliente newCliente = new Cliente("Jose","352.704.280-67");
        //cliente.setCpf("352.704.280-67");
        
        Produto produto = new Produto();
        produto.setNomme("Carne vegana");
        produto.setPreco(34.00);
        
        
        Produto produto2 = new Produto("Refrigerante saudavel",12.09);
        
        
        Pedido pedido = new Pedido(newCliente);
        pedido.adicionarItem(produto, 3);
        
        
        System.out.println("Pedido  ");
        System.out.println("Cliente: " + pedido.getCliente().getCpf()+ "," 
         + pedido.getCliente().getNome());
        
        System.out.println("Total : " + pedido.calcularTotal());
        
        PagamentoCartao pagamentoCartao = new PagamentoCartao(pedido.calcularTotal(), 3);
        pagamentoCartao.processar();
        System.out.println("Valor Final " + pagamentoCartao.valorFinal());
    }
}
