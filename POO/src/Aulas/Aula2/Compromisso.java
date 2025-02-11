package Aulas.Aula2;
import java.util.Date;

public class Compromisso {
    public int Date;
    Date dia;
    int horas;
    String lugar;
    String descricao;
    boolean internet;

    boolean desmarcado;

    void status(){
        System.out.println("No dia " + this.Date);
        System.out.println("às: " + this.horas + "hs");
        System.out.println("no(a) " + this.lugar + ":");
        System.out.println(this.descricao);
        System.out.println("Terei internet? " + this.internet);
    }

    void desmarcar(){
        if (this.horas >= 24 || this.horas < 0){
            desmarcado = true;
            System.out.println("\nHorário inválido, evento desmarcado");
        }
        if(desmarcado == false){
            adiar();
        }
    }

    void adiar(){
        if (this.internet == false || this.horas > 22 || this.horas < 7){
            System.out.println("\nDevido problemas técnicos, o evento foi adiado não poderá ocorrer, tente remarcar!");
        }
    }
}
