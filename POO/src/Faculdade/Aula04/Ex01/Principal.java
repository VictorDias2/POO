package Faculdade.Aula04.Ex01;

public class Principal {
    public static void main(String[] args){
        LivroDigital ld1 = new LivroDigital("Senhor dos Anéis", new Autor( "Tolkien","TolkienOficial@gmail.com",
                "Britânico"), "Ação", 5, 326000, 259);
        ld1.info();



    }
}
