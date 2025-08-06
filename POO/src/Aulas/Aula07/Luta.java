package Aulas.Aula07;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Ufc desafiado;
    private Ufc desafiante;
    private int rounds;
    private boolean aprovado;


    public void marcarLuta(Ufc l1, Ufc l2){
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2){
            this.aprovado = true;
            System.out.println("Luta Marcada entre " + l1.getNome() + " e " + l2.getNome());
            this.desafiante = l1;
            this.desafiado = l2;

        }
        else {
            System.out.println("Um lutadore não pode lutar contra ele mesmo ou com outro em outro categoria. Por favor define outro!");
            this.aprovado = false;
            setDesafiado(null);
            setDesafiante(null);
        }

    }

    public void lutar(){
        if(this.aprovado == false){
            System.out.println("Essa luta não foi aprovada");
        }
        else{
                System.out.println("--------------------");
            System.out.println("Desafiante: ");
            this.desafiante.apresentar();
                System.out.println("--------------------");
            System.out.println("Desafiado: ");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("Luta empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(desafiante.getNome() + " Venceu a luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                case 2:
                    System.out.println(desafiado.getNome() + " Venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }

        }
    }

    public Ufc getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Ufc desafiante) {
        this.desafiante = desafiante;
    }

    public Ufc getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Ufc desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
