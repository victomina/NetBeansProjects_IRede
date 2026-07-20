package br.org.irede.poo.agenda2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Agenda2 {
    
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
//                    JOptionPane.showMessageDialog(null, "Cadastro");
                    break;
                case "2":
                    listarContatos();
                    JOptionPane.showMessageDialog(null, "Consulta");
                    break;
                case "3":
                    buscarContato();
//                    JOptionPane.showMessageDialog(null, "Cadastro");
                    break;
                case "4":
                    atualizarContato();
//                    JOptionPane.showMessageDialog(null, "Cadastro");
                    break;
                case "5":
                    excluirContato();
//                    JOptionPane.showMessageDialog(null, "Cadastro");
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
    
    }
    
    private static void buscarContato(){
        int id = 0;
        repository.buscar(id);
    }
    
    private static void atualizarContato(){
        Contato contato = null;
        repository.atualizar(contato);
    }
    
    private static void excluirContato(){
        int id = 0;
        repository.excluir(id);
    }
    
     public static String capturaTexto(String texto){
         return JOptionPane.showInputDialog(null, texto, ".: Sistema Agenda:.",
                JOptionPane.QUESTION_MESSAGE);
         
    }
}