package br.org.irede.poo.agenda;

/**
 *
 * @author Victor Veríssimo
 */
public class Contato {
    private String Nome;
    private String Telefone;

    public Contato(String Nome, String Telefone) {
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    
}
