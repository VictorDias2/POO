package Faculdade.Aula03.Ex02;

import java.util.Scanner;

public class NotaPrincipal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a primeira nota? ");
        double n1 = entrada.nextDouble();

        while(n1 < 0 || n1 > 10){
            System.out.println("Dado inválido, por favor digite uma nota entre 0 e 10 para calcular a nota: ");
            n1 = entrada.nextDouble();
        }


        System.out.println("Qual a segunda nota? ");
        double n2 = entrada.nextDouble();

        while(n2 < 0 || n2 > 10){
            System.out.println("Dado inválido, por favor digite uma nota entre 0 e 10 para calcular a nota: ");
            n2 = entrada.nextDouble();
        }

        System.out.println("Quantas faltas? ");
        int fal = entrada.nextInt();


        Nota alun1 = new Nota(n1, n2, fal);
        alun1.resultado();

    }
}
