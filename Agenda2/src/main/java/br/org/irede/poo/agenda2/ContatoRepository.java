package br.org.irede.poo.agenda2;

import java.io.File;

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
       File arquivo = new File(caminhoArquivo);
    }
    
    
}
