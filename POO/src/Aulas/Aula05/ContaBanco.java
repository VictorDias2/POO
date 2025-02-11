package Aulas.Aula05;
import java.util.Scanner;

public class ContaBanco {
    Scanner entrada = new Scanner(System.in);

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.setNumConta(numConta);
        this.setTipo(tipo);
        this.setDono(dono);
        this.setSaldo(0);
        this.setStatus(false);
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
            setStatus(true);
            if (tipo.equals("cc")) {
                setSaldo(+50);
                System.out.println("Conta Corrente aberta com sucesso Sr." + getDono() + "!");

            } else if (tipo.equals("cp")) {
                setSaldo(+150);
                System.out.println("Conta poupança aberta com sucesso Sr." + getDono() + "!");
            }

        }
    }

    public void fecharConta() {
        if (this.status == false) {
            System.out.println("Sua conta já está fechada Sr." + getDono() + "!");
        } else {
            if (getSaldo() > 0 || getSaldo() < 0) {
                System.out.println("Sr." + getDono() + " você ainda tem um saldo total de " + getSaldo() + " reais. Portanto, Não é possível fechar a conta com saldo positivo ou negativo.");
            } else {
                setStatus(false);
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
            if(saque > getSaldo()){
                System.out.println("Não é possível sacar o valor de R$" + saque + ". Seu saldo é de R$" + getSaldo());
            }
            else{
                saldo -= saque;
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
            if(getSaldo() < 0){
                System.out.println("Devido ao pegamento da mensalidade sua conta ficou negativada, com o saldo total de " + getSaldo() + " reais");
            }
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
