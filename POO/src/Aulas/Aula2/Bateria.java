package Aulas.Aula2;
import java.util.Scanner;

public class Bateria {
    Scanner entrada = new Scanner(System.in);

    public String cor;
    protected String marca;
    private boolean montada;
    private int tempodeuso;

    public Bateria(String c, String m, boolean mont, int tduso) {
        this.cor = c;
        this.marca = m;
        this.montada = false;
        this.tempodeuso = tduso;
    }

    void status(){
        System.out.println("Uma bateria da cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Está montada? " + isMontada());
        System.out.println("Qual tempo de uso? " + getTempodeuso() + " hora");
        tocar();
    }

    void tocar(){
        if(montada == false){
            System.out.println("\nERRO! Bateria desmontada");
            System.out.println("Gostaria de montar? [S/N] ");
            String resposta = entrada.nextLine();
            resposta = resposta.toLowerCase();
            if(resposta.equals("s")){
                montar();
                tocar();
            }
            else if(resposta.equals("n")){
                System.out.println("Ok! Bateria continuará desmontada!");
            }
            else{
                System.out.println("Resposta inválida");
            }
        }
        else{
            System.out.println("\nO que gostaria de tocar?");
        }
    }

    void desmontar(){
        this.montada = false;
        System.out.println("Bateria desmontada com sucesso");
    }

    void montar(){
        this.montada = true;
        System.out.println("Bateria montada com sucesso");
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public boolean isMontada() {
        return montada;
    }

    public void setMontada(boolean montada) {
        this.montada = montada;
    }

    public int getTempodeuso() {
        return tempodeuso;
    }

    public void setTempodeuso(int tduso) {
        this.tempodeuso = tduso;
    }
}
