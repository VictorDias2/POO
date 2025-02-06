package Aulas;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampada = true;
        c1.carga = 90;
        c1.status();

        c1.destampar();

        if(c1.tampada == false) {
            System.out.println("\nO que gostaria de escrever?");
            String escreva = entrada.nextLine();
        }

    }
}
