package Faculdade.Aula03.Ex03;

public class Curso {
    private String nomeC;
    private double mensalidade;

    public Curso(String nomeC, double mensalidade) {
        this.nomeC = nomeC;
        this.mensalidade = mensalidade;
    }

    public void descrever(){
        System.out.println("Cursando: " + getNomeC());
        System.out.println("Mensalidade: R$" + mensalidade);
    }


    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nome) {
        this.nomeC = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
