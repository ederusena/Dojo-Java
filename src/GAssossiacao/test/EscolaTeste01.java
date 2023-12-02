package GAssossiacao.test;

import GAssossiacao.dominio.Escola;
import GAssossiacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Eder Sensei");
        Professor professor2 = new Professor("Jyraya Sensei");

        Professor[] professores = {professor1, professor2};

        Escola escola1 = new Escola("Bolivar", professores);

        escola1.imprime();
    }
}
