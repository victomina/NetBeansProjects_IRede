package br.org.irede.poo.agenda_v2;

/**
 *
 * @author Victor Veríssimo
 */
public class ContatoDuplicadoException extends Exception{   
    public ContatoDuplicadoException(Contato contato){
        super("O telefone  " + contato.getTelefone() + "está cadastrado para " + contato.getNome());
    }
    
}
