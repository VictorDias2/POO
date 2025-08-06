package Aulas.Aula07;

public class Lutadores {
    public static void main(String[] args){
        Ufc l1 = new Ufc("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2 , 1);
        Ufc l2 = new Ufc("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Ufc l3 = new Ufc("Snapshadow", "Estados Unidos", 35, 1.68f, 80.9f, 12, 2, 1);
        Ufc l4 = new Ufc("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        Ufc l5 = new Ufc("Ufocobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
        Ufc l6 = new Ufc("Nerdaard", "Estados Unidos", 30, 1.81f, 105.7f, 12, 2, 4);

        Luta Ufc01 = new Luta();
        Ufc01.marcarLuta(l1, l2);
        Ufc01.lutar();
        l1.status();
        l2.status();
    }
}