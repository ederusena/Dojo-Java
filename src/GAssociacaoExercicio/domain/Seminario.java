package GAssociacaoExercicio.domain;

import java.util.List;

public class Seminario extends BaseEntity{
    private Aluno[] alunos;
    private Local local;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario(String nome, Local local) {
        super(nome);
        this.local = local;
    }

    public Seminario(String nome, Local local, Aluno[] alunos) {
        super(nome);
        this.alunos = alunos;
        this.local = local;
    }


    public Seminario(String nome) {
        super(nome);
    }


}
