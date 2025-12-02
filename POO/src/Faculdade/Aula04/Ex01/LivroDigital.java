package Faculdade.Aula04.Ex01;

public class LivroDigital extends Livro {
    private int download;
    private double tamanho;

    public LivroDigital(String titulo, Autor autor, String genero, int edicao, int download, double tamanho) {
        super(titulo, autor, genero, edicao);
        this.download = download;
        this.tamanho = tamanho;
    }

    @Override
    public void info() {
        System.out.println("Download Livro: " + this.download);
        System.out.println("Download Tamanho: " + this.tamanho);
    }


    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
