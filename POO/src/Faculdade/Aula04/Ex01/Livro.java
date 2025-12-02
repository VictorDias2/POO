package Faculdade.Aula04.Ex01;

public class Livro {
    private String titulo;
    private Autor autor;
    private String gereno;
    private int edicao;

    public Livro(String titulo, Autor autor, String gereno, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.gereno = gereno;
        this.edicao = edicao;
    }

    public void info(){
        System.out.println("Título do Livro: " + getTitulo());
        System.out.println("Gênero: " + getGereno());
        System.out.println("Edição: " + getEdicao());
        autor.info();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGereno() {
        return gereno;
    }

    public void setGereno(String gereno) {
        this.gereno = gereno;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
