package Aulas.Aula07;

public class Ufc {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates ;

    public Ufc(String nom, String nac, int ida, float alt, float peso, int vit, int der, int emp) {
        nome = nom;
        nacionalidade = nac;
        idade = ida;
        altura = alt;
        setPeso(peso);
        vitorias = vit;
        derrotas = der;
        empates = emp;
    }

    public void apresentar(){
        if (getPeso() <= 52.2 || getAltura() <= 0) {
            System.out.println("Dado(s) inválido(s)");
        }
        else{
            if(getPeso() <= 65.8){
                setCategoria("Pena");
            } else if (getPeso() <= 70.3) {
                setCategoria("Leve");
            } else if (getPeso() <= 77.1) {
                setCategoria("Meio-médio");
            } else if (getPeso() <= 83.9) {
                setCategoria("Médio");
            } else if (getPeso() <= 93) {
                setCategoria("Meio-pesado");
            } else {
                setCategoria("Pesado");
            }

            System.out.println("Lutador: " + getNome());
            System.out.println("Nacionalidade: " + getNacionalidade());
            System.out.println("Idade: " + getIdade() + " anos");
            System.out.println("Altura: " + getAltura() + "m");
            System.out.println("Peso: " + getPeso() + "Kg");
            System.out.println("Categoria: Peso " + getCategoria());
        }
    }


    public void status() {
        if (getVitorias() <= 0 || getDerrotas() <= 0 || getEmpates() <= 0) {
            System.out.println("Dado(s) incorreto(s)");

        } else {
            System.out.println("O Lutador " + getNome() + " corresponde há:");
            System.out.println(getVitorias() + " Vitórias");
            System.out.println(getDerrotas() + " Derrotas");
            System.out.println(getEmpates() + " Empates");
        }
    }


    public void ganharLuta(){
        setVitorias(getVitorias() +1);
    }


    public void perderLuta(){
        setDerrotas(getDerrotas() +1);
    }


    public void empatarLuta(){
        setEmpates(getEmpates() +1);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
