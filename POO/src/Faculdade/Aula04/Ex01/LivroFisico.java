package Faculdade.Aula04.Ex01;

public class LivroFisico extends Livro{
    private String tiragem;
    private double peso;

    public LivroFisico(String titulo, Autor autor, String gereno, int edicao, String tiragem, double peso) {
        super(titulo, autor, gereno, edicao);
        this.tiragem = tiragem;
        this.peso = peso;
    }

    @Override
    public void info(){
        System.out.println("Tiragem do Livro: " + getTiragem());
        System.out.println("Peso do livro: " + getPeso());
    }


    public String getTiragem() {
        return tiragem;
    }

    public void setTiragem(String tiragem) {
        this.tiragem = tiragem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
