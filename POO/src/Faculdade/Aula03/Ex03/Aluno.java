package Faculdade.Aula03.Ex03;

public class Aluno {
    private String nome;
    private int matricula;
    private double desconto;
    Curso curso;

        public Aluno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    public void descrever(){
        System.out.println("Nome: " + getNome());
        System.out.println("Nº Matrícula: " + getMatricula());
        System.out.println("Desconto de " + getDesconto() + "%");
        curso.descrever();
    }

    public void pagamento(){
        double totalAPagar = curso.getMensalidade() - (getDesconto() / 100 * curso.getMensalidade());
        System.out.printf("O valor do curso R$%.2f com o desconto de %.0f%%. Total à Pagar: R$%.2f%n", curso.getMensalidade(), getDesconto(), totalAPagar);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
