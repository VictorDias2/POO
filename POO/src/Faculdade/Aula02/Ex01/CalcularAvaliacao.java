package Faculdade.Aula02.Ex01;

import java.util.Scanner;

public class CalcularAvaliacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Avaliacao Mario = new Avaliacao();
        Avaliacao Ana = new Avaliacao(7 , 4, 10);

        Ana.MediaAritmetica();
        Ana.MediaPonderada();

        System.out.println("------------------------------");
        System.out.println("Digite a 1º nota: ");
        double entradaNota1 = entrada.nextDouble();
        System.out.println("Digite a 2º nota: ");
        double entradaNota2 = entrada.nextDouble();
        System.out.println("Digite a 3º nota: ");
        double entradaNota3 = entrada.nextDouble();

        Mario.n1 = entradaNota1;
        Mario.n2 = entradaNota2;
        Mario.n3 = entradaNota3;
        Mario.MediaAritmetica();
        Mario.MediaPonderada();




    }
}
