package GAssociacaoExercicio.domain;

import java.util.List;

public class Professor extends BaseEntity{
    private Seminario[] seminarios;

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void imprime() {
        System.out.println("--------");
        System.out.println("Professor: " + super.getNome());
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getNome());
            System.out.println(seminario.getLocal().getNome());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno :" + aluno.getNome());
            }

        }
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, Seminario[] seminarios) {
        super(nome);
        this.seminarios = seminarios;
    }

}
