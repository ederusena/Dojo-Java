package GAssossiacao.test;

import GAssossiacao.dominio.Jogador;
import GAssossiacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafú");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time palmeiras = new Time("Palmeiras", jogadores);

        palmeiras.imprimir();
    }
}
