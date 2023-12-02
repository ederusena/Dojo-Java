package GAssossiacao.dominio;

import java.util.List;

public class Time {
    private String nome;
    public Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogador) {
        this.nome = nome;
        this.jogadores = jogador;
    }

    public void imprimir() {
        System.out.println("Nome do time: " + this.nome);
        if (jogadores == null) return;
        System.out.println("Jogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
