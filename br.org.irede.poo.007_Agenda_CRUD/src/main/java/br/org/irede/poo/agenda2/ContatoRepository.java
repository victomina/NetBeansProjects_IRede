package br.org.irede.poo.agenda2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
        List<Contato> contatos = lerTodos();

        int maior = 0;

        for(Contato c : contatos){

            if(c.getTelefone().equals(contato.getTelefone())){

                throw new RuntimeException("Telefone já cadastrado.");
            }
            if(c.getIdentificador() > maior){

                maior = c.getIdentificador();
            }
        }
        contato.setIdentificador(maior + 1);

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
    
    //Ler todos os contatos
    private List<Contato> lerTodos(){
    List<Contato> contatos = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){

        String linha;

        while((linha = br.readLine()) != null){
            String dados[] = linha.split("\\|");
            if(dados.length == 3){
                Contato c = new Contato();

                c.setIdentificador(Integer.parseInt(dados[0].trim()));
                c.setNome(dados[1].trim());
                c.setTelefone(dados[2].trim());

                contatos.add(c);
            }
        }
    }catch(IOException e){
        throw new RuntimeException(e);
    }
    return contatos;
    }
    
    //Método para listar contatos
    public List<Contato> listar(){
        return lerTodos();

    }
    
    
    // irá buscar o contato por ID
    public Contato buscar(int id){
        for(Contato c : lerTodos()){
            if(c.getIdentificador() == id){
                return c;
            }
        }
        return null;
    }
    
    //Criando o método Aualizar
    public void atualizar(Contato contato){
    List<Contato> contatos = lerTodos();
    for(int i=0;i<contatos.size();i++){
        if(contatos.get(i).getIdentificador()==contato.getIdentificador()){
            contatos.set(i, contato);
            salvarTodos(contatos);
            return;
        }
    }
    }
    
    //Criando o método de excluir
    public void excluir(int id){
        List<Contato> contatos = lerTodos();
        contatos.removeIf(c -> c.getIdentificador()==id);
        salvarTodos(contatos);

    }
}
