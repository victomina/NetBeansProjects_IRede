package br.org.irede.poo.agenda_v2;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Veríssimo
 */
public class Agenda_v2 {
    
    static int contador = 0;
    static Contato[] contatos = new Contato[3];

    public static void main(String[] args) {
        for (int i = 0; i < contatos.length; i ++){
            contatos[i] = criarContato();
        }
        exibeDados(contatos);
    }
    
    public static Contato criarContato(){
       try{
           Contato contato = new Contato();
           contato.setNome(capturaTexto("Informe o nome"));
           contato.setTelefone(capturaTexto("Informe o telefone"));
           validarContato(contato.getTelefone());
           contador = contador +1;
           contato.setIdentificador(contador);
           return contato;
       }catch(ContatoDuplicadoException e){
           JOptionPane.showMessageDialog(null, e.getMessage(), ".:Sistema de Agenda:.", JOptionPane.ERROR_MESSAGE );
       } 
       return null;
    }
    
    public static void validarContato(String telefone) throws ContatoDuplicadoException{
        for (Contato contato : contatos){
            if(contato != null && contato.getTelefone().equals(telefone)){
                throw new ContatoDuplicadoException(contato);
            }
        }
    }
    
    public static String capturaTexto(String texto){
        return JOptionPane.showInputDialog(null, texto, ".:Sistema Agenda:.", JOptionPane.QUESTION_MESSAGE);
    }
    
    public static void exibeDados(Contato[] contatos){
        String mensagem = "";
        for (Contato contato : contatos){
            mensagem = mensagem + contato + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagem, "Contato", JOptionPane.INFORMATION_MESSAGE);
    }
}
