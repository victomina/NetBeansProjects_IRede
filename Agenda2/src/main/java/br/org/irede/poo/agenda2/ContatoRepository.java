package br.org.irede.poo.agenda2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class ContatoRepository {
    private final String caminhoArquivo;

    public ContatoRepository(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        garantirArquivoExiste();
    }

    private void garantirArquivoExiste() {
        //classe que trabalha com arquivos
       File arquivo = new File(caminhoArquivo);
       //Verifica a existencia
       if(!arquivo.exists()){
           try{
               //cria o arquivo
               arquivo.createNewFile();
           }catch(IOException e){
               //caso nao tenha permissao
               throw new RuntimeException("Não foi possível crirar o arquivo de dados");
           }
       }
    }
    
    public Contato cadastrar(Contato contato){
        //criar a existencia
        //criar identificador
        List<Contato> contatos = new ArrayList<>();
        contatos.add(contato);
        salvarTodos(contatos);
        return contato;
    }

    private void salvarTodos(List<Contato> contatos){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, false))){
            for(Contato  c : contatos){
                bw.write(c.toString());
                bw.newLine();
            }
        }catch(IOException e){
            throw new RuntimeException("Erro ao salvar o arquivo de dados", e);
        }
    }
}
