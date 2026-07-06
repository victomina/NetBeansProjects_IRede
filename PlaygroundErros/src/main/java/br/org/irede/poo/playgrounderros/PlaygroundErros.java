package br.org.irede.poo.playgrounderros;

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
        System.out.println("Informe o primeiro numero: ");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo numero: ");
        int n2 = ler.nextInt();
        int resultado = n1/n2;
        System.out.println(" Resultado: " + resultado);
    }
}
