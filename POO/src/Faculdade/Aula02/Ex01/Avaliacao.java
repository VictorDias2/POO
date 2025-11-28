package Faculdade.Aula02.Ex01;

import java.util.Scanner;

public class Avaliacao {
    double n1, n2, n3;

    Avaliacao(){

    }
    Avaliacao(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    void MediaAritmetica(){
        double MediaA = (n1 + n2 + n3) /3;
        System.out.println("\nA média Aritmética é de " + MediaA);
    }
    void MediaPonderada(){
        double MediaP = (n1*2 + n2*3 + n3*4) /9;
        System.out.println("A média Ponderada é de " + MediaP);
    }
}
