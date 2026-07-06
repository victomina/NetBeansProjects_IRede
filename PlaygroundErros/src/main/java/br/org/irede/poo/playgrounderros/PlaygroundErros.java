package br.org.irede.poo.playgrounderros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaygroundErros {

    public static void main(String[] args) {
        System.out.println("==== Bem vindos ao show de horrores do Java ===== \n");
        Scanner ler = new Scanner(System.in);
        
        exemploArithmeticException(ler);
        
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
}
