package GAssociacaoExercicio.domain;

abstract class BaseEntity {
    private String nome;

    public BaseEntity(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
