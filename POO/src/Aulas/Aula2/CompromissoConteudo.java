package Aulas.Aula2;

public class CompromissoConteudo {
    public static void main (String[] args) {

        Compromisso cm1 = new Compromisso();
        cm1.Date = 29012025;
        cm1.horas = 20;
        cm1.lugar = "minha casa";
        cm1.descricao = "Atividades de POO";
        cm1.internet = true;
        cm1.status();

        cm1.desmarcado = false;
        cm1.desmarcar();

    }
}
