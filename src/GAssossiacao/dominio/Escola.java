package GAssossiacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professores = professor;
    }


    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if(professores == null) return;

        for(Professor professor: professores) {
            System.out.println("Professor: " + professor.getNome());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }


}