package Aulas.Atividade5;
import java.util.Scanner;

public class ContaBanco {
    Scanner entrada = new Scanner(System.in);

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void retorne(){
        System.out.println("A Conta: " + getNumConta());
        System.out.println("É do tipo: " + getTipo());
        System.out.println("Do dono: " + getDono());
        System.out.println("Com o saldo de: R$" + getSaldo());
        System.out.println("Está aberta? " + getStatus());
        System.out.println();

            //testes:
        abrirConta();
        System.out.println(getSaldo());
        fecharConta();
        depositar();
        sacar();
        fecharConta();
        depositar();
        pagarMensal();
        abrirConta();

    }


    public void abrirConta() {
        if (this.status == true) {
            System.out.println("Sua conta já está aberta Sr." + getDono() + "!");
        } else {
            this.status = true;
            if (tipo.equals("cc")) {
                this.saldo += 50;
                System.out.println("Conta Corrente aberta com sucesso Sr." + getDono() + "!");

            } else if (tipo.equals("cp")) {
                this.saldo += 150;
                System.out.println("Conta poupança aberta com sucesso Sr." + getDono() + "!");
            }

        }
    }

    public void fecharConta(){
        if(this.status == false){
            System.out.println("Sua conta já está fechada Sr." + getDono() + "!");
        }
        else {
            if (saldo > 0 || saldo < 0) {
                System.out.println("Não é possível fechar a conta com saldo positivo ou negativo Sr." + getDono() + "!");
            } else {
                this.status = false;
                System.out.println("Conta fechada com sucesso Sr." + getDono() + "!");
            }

        }
    }

    public void depositar(){
        if (this.status == false){
            System.out.println("Não é possível depositar em um conta fechada Sr." + getDono() + "!");
        }
        else{
            System.out.println("Quanto deseja depositar?");
            int deposito = entrada.nextInt();
            if(deposito <= 0){
                System.out.println("Não é possível depositar esse valor Sr." + getDono());
            }
            else{
                saldo += deposito;
                System.out.println("Deposito efetuado com sucesso! seu saldo é de R$" + getSaldo());
            }
        }

    }

    public void sacar(){
        if (this.status == false){
            System.out.println("Não é possível sacar em um conta fechada Sr." + getDono() + "!");
        }
        else{
            System.out.println("Quando deseja sacar?");
            int saque = entrada.nextInt();
            if(saque > saldo){
                System.out.println("Não é possível sacar o valor de R$" + saque + ". Seu saldo é de R$" + this.saldo);
            }
            else{
                this.saldo -= saque;
                System.out.println("Saque realizado com sucesso Sr." + getDono() + "!");
            }

        }
    }

    public void pagarMensal() {
        if (this.status == false) {
            System.out.println("Não é possível pagar a mensalidade em um conta fechada Sr." + getDono() + "!");
        } else {
            if (this.tipo.equals("cc")) {
                saldo -= 12;
            } else if (this.tipo.equals("cp")) {
                saldo -= 20;
            }
            System.out.println("Pagamento efetuado com sucesso Sr." + getDono() + "!");
        }

    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
