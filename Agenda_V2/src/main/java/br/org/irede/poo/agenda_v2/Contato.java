package br.org.irede.poo.agenda_v2;

/**
 *
 * @author Victor Veríssimo
 */
public class Contato {
    private String nome;
    private String telefone;
    private int identificador;

//    public Contato(String nome, String telefone, int identificador) {
//        this.nome = nome;
//        this.telefone = telefone;
//        this.identificador = identificador;
//    }

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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
   
    @Override
    public String toString(){
        return identificador + " | " + nome + " | " + telefone;
    }
}
