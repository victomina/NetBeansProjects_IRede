package br.org.irede.poo.playgrounderros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaygroundErros {

    public static void main(String[] args) {
        System.out.println("==== Bem vindos ao show de horrores do Java ===== \n");
        Scanner ler = new Scanner(System.in);
        //Erros com operações matemáticas
        //exemploArithmeticException(ler);
        //esse acontece quando tenta acessa um valor que não existe
        // exemploIndexOfBoundsException(ler);
        //exemploIOException();
        exemploNullPointer();
        ler.close();
        System.out.println(" === Sobrevivemos ===");
    }

    private static void exemploArithmeticException(Scanner ler) {
        
        try{
            System.out.println("Informe o primeiro numero: ");
            int n1 = ler.nextInt();
            System.out.println("Informe o segundo numero: ");
            int n2 = ler.nextInt();
            int resultado = n1/n2;
        System.out.println(" Resultado: " + resultado);
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(" Um numero não pode ser dividido por zero!! ");
        }catch(InputMismatchException e){
            System.out.println("Dados Inválidos ... ");
        }catch(Exception e){
            System.out.println("Erro inesperado ...");
        }
    }

    private static void exemploIndexOfBoundsException(Scanner ler) {
        String [] nomes = {"Jose", "Maria", "Joao"};
        System.out.println("Informe a posicao do nome que deseja verificar: " );
        int indice = ler.nextInt();
        try{
            String nome = nomes [indice];
            System.out.println("Informe a posição do nome que deseja ver: "+ nome);
        }catch(IndexOutOfBoundsException e){
                System.out.println("A posição :" + indice + "nao existe " );
        }
        
    }

    private static void exemploIOException() {
        try(BufferedReader leitor = new BufferedReader(new FileReader("dados.txt"))){
            String linha = leitor.readLine();
            System.out.println("Linha do arquivo : " + linha);
        }catch(IOException e){
            System.out.println("Nao foi possivel ler o arquivo ..\n" + e.getMessage());
        }
    }

    private static void exemploNullPointer() {
        try{
            String texto = null;
            System.out.println("Tamanho do texto: " + texto.length());  
        }catch(NullPointerException e){
            System.out.println("Texto não existe");
        }
    }
}
