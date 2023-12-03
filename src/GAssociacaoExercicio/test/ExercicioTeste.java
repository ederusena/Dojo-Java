package GAssociacaoExercicio.test;

import GAssociacaoExercicio.domain.Aluno;
import GAssociacaoExercicio.domain.Local;
import GAssociacaoExercicio.domain.Professor;
import GAssociacaoExercicio.domain.Seminario;

public class ExercicioTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Enderson");
        Aluno aluno2 = new Aluno("Damarison");
        Aluno aluno3 = new Aluno("Ediosmar");
        Aluno[] alunos = {aluno1, aluno2};

        Local local = new Local("Carapicuiba");
        Local local2 = new Local("Alphaville");

        Seminario vueSeminario = new Seminario("Vue Conference", local, alunos);
        Seminario reactSeminario = new Seminario("React Conference", local2);
        Seminario[] seminarios = {vueSeminario, reactSeminario};

        Professor ederSensei = new Professor("Eder Sensei", seminarios);
        Professor damarisSensei = new Professor("Damaris Sensei", seminarios);

        ederSensei.imprime();

    }
}
