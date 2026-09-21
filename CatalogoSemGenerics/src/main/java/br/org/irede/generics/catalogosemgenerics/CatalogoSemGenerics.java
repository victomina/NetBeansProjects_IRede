package br.org.irede.generics.catalogosemgenerics;

import java.util.ArrayList;

/**
 *
 * @author Victor Verissimo
 */
public class CatalogoSemGenerics {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>(); //sem generics
        lista.add("NOtebook");
        lista.add(2100); //a lista tá aceitando dados do tipo object
        // mas é precis fazer o casting dos dados
        String nome = (String) lista.get(0);
        System.out.println(nome);
        
        String preco = (String) lista.get(0);
        System.out.println(preco);
    }
}

