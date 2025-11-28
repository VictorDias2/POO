package Faculdade.Aula02;

public class ProjetoAluno {

    public static void main(String[] args){
        //Scanner entrada = new Scanner(System.in);

        System.out.println("Olá\n");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.matricula = 1001;
        a1.nome = "Victor Ramalho";
        a1.cpf = 1112223330;

        a2.matricula = 1002;
        a2.nome = "Giovanni Guimarães";
        a2.cpf = 1231231230;


        a1.info();
        a1.nome = "Roberto Silva";

        a1.info();
        a2.info();

    }

}
