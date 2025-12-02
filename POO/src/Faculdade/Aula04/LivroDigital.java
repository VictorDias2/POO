package Faculdade.Aula04;

public class LivroDigital extends Livro{
    public String linkDownload;
    public int tamanhoMb;

    public LivroDigital(String titulo, String autor, String linkDownload){
        super(titulo, autor);
    }

    public float imposto() {
        return 0.15f * lucro();
    }

    public float tamanhoPorPagina(){
        return tamanhoMb/ (float) paginas;

    }
}
