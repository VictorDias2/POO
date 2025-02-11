package Aulas.Aula06;

public class ControleRemoto {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }


    public void ligar(){
        if (this.ligado == false){
            setLigado(true);
            System.out.println("Controle ligado com sucesso!");
        }
        else{
            System.out.println("Controle já se encontra ligado");
        }
    }


    public void desligar(){
        if (this.ligado == true){
            setLigado(false);
            System.out.println("Controle desligado com sucesso!");
        }
        else{
            System.out.println("Controle já se encontra desligado!");
        }
    }


    public void abrirMenu(){
        System.out.println("Menu:");

        if (this.ligado){
            System.out.println("O controle está ligado");
        }
        else {
            System.out.println("O controle está desligado");
        }

        System.out.print("Volume: ");
        for (int v = 10; v <= getVolume(); v += 10) {
            System.out.print("| ");
        }

        if (this.tocando == true){
            System.out.println("Está tocando!");
        }
        else{
            System.out.println("Está pausado!");
        }
    }


    public void fecharMenu(){
        System.out.println("\nFechando Menu...");
        System.out.println("Menu Fechado!");
    }


    public void aumentar(){
        if (this.ligado == true && getVolume() < 100){
            setVolume(getVolume() + 5);
        }
    }

    public void abaixar(){
        if (this.ligado == true && getVolume() > 0){
            setVolume(getVolume() - 5);
        }
    }


    public void ligarMudo(){
        if (this.ligado == true && getVolume() != 0){
            setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.ligado == true && getVolume() == 0){
            setVolume(50);
        }
    }


    public void play(){
        if (this.ligado == true && this.tocando == false){
            setTocando(true);
        }
    }


    public void pause(){
        if (this.ligado == true && this.tocando == true){
            setTocando(false);
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int vol) {
        this.volume = vol;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean toc) {
        this.tocando = toc;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean lig) {
        this.ligado = lig;
    }

}
