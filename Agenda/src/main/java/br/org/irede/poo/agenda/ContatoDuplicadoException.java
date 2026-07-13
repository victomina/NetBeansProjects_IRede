package br.org.irede.poo.agenda;

/**
 *
 * @author Victor Veríssimo
 */
public class ContatoDuplicadoException extends Exception{   
    public ContatoDuplicadoException(Contato contato){
        super("O telefone  " + contato.getTelefone() + "está cadastrado para " + contato.getNome());
    }
    
}
