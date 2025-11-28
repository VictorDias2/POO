package Faculdade.Aula02;

import java.util.Scanner;

public class ProjetoConta {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        Conta c1= new Conta();
        c1.correntista = "Victor";
        c1.saldo = 1000;
        c1.limiteSaque = 550;

        System.out.println("O que deseja fazer:\n" +
                "1. Depositar\n" +
                "2. Sacar\n" +
                "3. Saldo");
        int comando = entrada.nextInt();

        if (comando == 1){
            System.out.println("Sr." + c1.correntista + " quanto deseja depositar? ");
            float depos = entrada.nextFloat();
            c1.depositar(depos);
        } else if (comando == 2) {
            System.out.println("Sr." + c1.correntista + " quanto deseja sacar? ");
            float depos = entrada.nextFloat();
            c1.sacar(depos);
        } else if (comando == 3) {
            c1.saldo();
        }
        else{
            System.out.println("Valor inválido");
        }

    }
}
