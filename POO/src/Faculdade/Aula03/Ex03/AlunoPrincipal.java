package Faculdade.Aula03.Ex03;

public class AlunoPrincipal {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Victor" , 110, 10.0, new Curso("Ciência da Computação", 868.00));

        a1.descrever();
        System.out.println();
        a1.pagamento();

    }
}
