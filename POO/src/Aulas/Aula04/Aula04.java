package Aulas.Aula04;

public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC", "Vermelha", 0.45f);
        c1.status();
        System.out.println("--------------");
        Caneta c2 = new Caneta("Bic", "Preta", 1.6f);
        c2.status();
    }
}
