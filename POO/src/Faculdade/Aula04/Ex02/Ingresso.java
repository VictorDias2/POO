package Faculdade.Aula04.Ex02;

public class Ingresso {
    public String nomeEvento;
    public double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.print("Nome do Evento: " + getNomeEvento());
        System.out.println(" >>> R$" + getValor());
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
