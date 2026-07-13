package br.org.irede.poo.agenda;

/**
 *
 * @author Victor Veríssimo
 */
public class Contato {
    private String nome;
    private String telefone;
    private String identificador;

    public Contato(String nome, String telefone, String identificador) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
   
    @Override
    public String toString(){
        return identificador + " | " + nome + " | " + telefone;
    }
}
