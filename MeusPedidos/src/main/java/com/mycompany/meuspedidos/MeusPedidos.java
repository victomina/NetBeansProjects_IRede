package com.mycompany.meuspedidos;

public class MeusPedidos {

    public static void main(String[] args) {
        Cliente newCliente = new Cliente("Jose","352.704.280-67");
        //cliente.setCpf("352.704.280-67");
        
        Produto produto1 = new Produto();
        produto1.setNomme("Carne vegana");
        produto1.setPreco(34.00);
        
        
        Produto produto2 = new Produto("Refrigerante saudavel",12.09);
        
        //Adicionando itens do cliente no carriho de pedidos
        Pedido pedido = new Pedido(newCliente);
        pedido.adicionarItem(produto1, 3);
        
        
        System.out.println("Pedido  ");
        System.out.println("Cliente: " + pedido.getCliente().getCpf()+ "," 
         + pedido.getCliente().getNome());
        pedido.exibirProdutos();
        System.out.println("Total : " + pedido.calcularTotal());
        
//        PagamentoCartao pagamentoCartao = new PagamentoCartao(pedido.calcularTotal(), 3);
//        pagamentoCartao.processar();
//        System.out.println("Valor Final " + pagamentoCartao.valorFinal());

        PagamentoPix pagamentoPix = new PagamentoPix(pedido.calcularTotal());
        pagamentoPix.processar();
        System.out.println("Valor final: " + pagamentoPix.valorFinal());
    }
}
