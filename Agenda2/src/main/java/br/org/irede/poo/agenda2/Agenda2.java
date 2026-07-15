package br.org.irede.poo.agenda2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Agenda2 {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcao = JOptionPane.showInputDialog(null,
                    "===Agenda==="
                    + "1 - Cadastrar contato \n"
                    + "2 - Listar contatos \n"
                    + "6 - sair \n\n"
                    + "Escolha uma das opções acima:",
                    "Menu Principal",
                    JOptionPane.PLAIN_MESSAGE
            );
            if (opcao == null) {
                break;
            }
            switch (opcao.trim()) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Cadastro");
                case "2":
                    JOptionPane.showMessageDialog(null, "Consulta");
                case "6":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!! Escolha um numero:(1,2 ou 6)",
                            "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Até logo");
    }
}