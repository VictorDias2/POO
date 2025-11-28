package Faculdade.Aula02;

public class Conta {
    String correntista;
    float saldo;
    float limiteSaque;

    void depositar(float valor){
        saldo += valor;
        System.out.println("Valor depositado com sucesso. Seu saldo atual é de R$" + saldo);
    }

    void sacar(float valor){
        if (saldo < valor){
            System.out.println("O saque de R$" + valor + " é insuficiente. Pois seu saldo é de R$" + saldo);
        } else if (valor > limiteSaque) {
            System.out.println("O saque de R$" + valor + " está indisponivel devido ao limite de R$" + limiteSaque);

        } else{
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso. Seu saldo atual é de R$" + saldo);
        }
    }

    void saldo(){
        System.out.println("Seu saldo atual é de R$" + saldo);
    }

}
