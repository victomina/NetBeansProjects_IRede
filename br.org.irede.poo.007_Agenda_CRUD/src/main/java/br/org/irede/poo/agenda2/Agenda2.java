package br.org.irede.poo.agenda2;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Agenda2 {
    //Versão de backUp-- localizado nos projetos do NetBeans
    private static final String ARQUIVO_DADOS = "contatos.txt";
    private static final ContatoRepository repository = new ContatoRepository(ARQUIVO_DADOS);
    
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcao = JOptionPane.showInputDialog(null,
                    ".::Agenda::.\n"
                    + "1 - Cadastrar contato \n"
                    + "2 - Listar contatos \n"
                    + "3 - BuscarContato \n"
                    + "4 - Atualizar contato \n"
                    + "5 - Excluir contato \n"
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
                    cadastrarContato();
                    break;
                case "2":
                    listarContatos();
                    JOptionPane.showMessageDialog(null, "Consulta");
                    break;
                case "3":
                    buscarContato();
                    break;
                case "4":
                    atualizarContato();
                    break;
                case "5":
                    excluirContato();
                    break;
                case "6":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!! "
                            + "Escolha um numero:(1,2 ou 6)",
                            "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Até logo");
    }

    private static void cadastrarContato() {
        try{
        Contato contato = new Contato();
        contato.setNome(capturaTexto("Informe o nome"));
        contato.setTelefone(capturaTexto("Informe o telefone"));
        repository.cadastrar(contato); 
        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!!\n" + contato,
                "Secesso !!",
                JOptionPane.INFORMATION_MESSAGE);
        }catch(RuntimeException e){
        JOptionPane.showMessageDialog(null, e.getMessage() + "Erro",
                "Secesso !!",
                JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    private static void listarContatos(){
        List<Contato> contatos = repository.listar();
        StringBuilder sb = new StringBuilder();
        for(Contato c : contatos){
           sb.append(c);
           sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    private static void buscarContato(){
        String texto = capturaTexto("Informe o ID");
        int id = Integer.parseInt(texto);
        Contato contato = repository.buscar(id);
        if(contato == null){
            JOptionPane.showMessageDialog(null,"Contato não encontrado.");
        }
        JOptionPane.showMessageDialog(null, contato);
    }
    
    private static void atualizarContato(){
          int id = Integer.parseInt(capturaTexto("Informe o ID"));
          Contato contato = repository.buscar(id);
          String nome = capturaTexto("Novo nome");
          contato.setNome(nome);
          repository.atualizar(contato);
    }
    
    private static void excluirContato(){
        int id = Integer.parseInt(capturaTexto("Informe o ID"));
        repository.excluir(id);
        JOptionPane.showMessageDialog(null,"Contato excluído.");
    }
    
     public static String capturaTexto(String texto){
         return JOptionPane.showInputDialog(null, texto, ".: Sistema Agenda:.",
                JOptionPane.QUESTION_MESSAGE);
         
    }
}