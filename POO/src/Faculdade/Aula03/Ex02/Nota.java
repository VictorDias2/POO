package Faculdade.Aula03.Ex02;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;

    public Nota() {
    }

    public Nota(double nota1, double nota2, int faltas) {
        setNota1(nota1);
        setNota2(nota2);
        setFaltas(faltas);
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void resultado(){
        if(getFaltas() >= 7){
            System.out.println("Aluno reprovado por faltas (" + getFaltas() + ")");
        }
        else if((getNota1() + getNota2()) / 2 >= 7){
            System.out.println("Aluno aprovado com a nota = " + (getNota1() + getNota2()) / 2);
        } else if ((getNota1() + getNota2()) / 2 > 5) {
            System.out.println("Aluno em recuperação faltando " + (7 - (getNota1() + getNota2()) / 2) + " pontos para ser aprovado com 7 na média final!");
        }
        else{
            System.out.println("Aluno Reprovado com a nota = " + (getNota1() + getNota2()) / 2);
        }

    }
}
