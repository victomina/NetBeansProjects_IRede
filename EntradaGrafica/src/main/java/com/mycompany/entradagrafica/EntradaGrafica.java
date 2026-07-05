package com.mycompany.entradagrafica;

import javax.swing.JOptionPane;

public class EntradaGrafica {

    public static void main(String[] args) {
        //captura uma entrada
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade: ");
        //parse : conversao
        int idade = Integer.parseInt(idadeStr);
        String mensagem = "Nome : " + nome + "\n Idade" + idade;
        //mostra uma saída
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
