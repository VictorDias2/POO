package Aulas;

public class Caneta {
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Uma caneta da cor " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Com a ponta " + this.ponta);
        System.out.println("Possui " + this.carga + "% de carga");
        escrever();

    }
    public void escrever(){
        if(this.tampada == true){
            System.out.println("\nERRO! Não posso escrever com a caneta tampada");
        }
        else{
            String escreva;
        }
    }

    protected void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada com sucesso!");
    }

    protected void destampar(){
        this.tampada = false;
        System.out.println("Caneta destampada com sucesso!");
    }

}
