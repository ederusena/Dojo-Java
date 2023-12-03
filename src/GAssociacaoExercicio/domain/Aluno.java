package GAssociacaoExercicio.domain;

public class Aluno extends BaseEntity{
    private Seminario seminario;

    public Aluno(String nome, Seminario seminario) {
        super(nome);
        this.seminario = seminario;
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }


}
