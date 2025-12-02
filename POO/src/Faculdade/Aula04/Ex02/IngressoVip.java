package Faculdade.Aula04.Ex02;

public class IngressoVip extends Ingresso{
    public double ValorAdicional;

    public IngressoVip(String nomeEvento, double valor, double valorAdicional) {
        super(nomeEvento, valor);
        ValorAdicional = valorAdicional;
    }

    @Override
    public void imprimir(){
        System.out.print("Nome do Evento: " + getNomeEvento());
        System.out.printf(" >>> R$%.2f (VIP)\n", (getValorAdicional() + getValor()));
    }


    public double getValorAdicional() {
        return ValorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        ValorAdicional = valorAdicional;
    }
}
