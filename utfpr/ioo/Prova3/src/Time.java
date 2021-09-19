//thomas sá capucho

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Time {

    private ArrayList<Jogador> jogadores;

    public Time() {
        jogadores = new ArrayList<>();
    }

    public boolean addGol(String nomeDoJogador) {
        Jogador jogadorEncontrado = null;
        nomeDoJogador = nomeDoJogador.toLowerCase();
        for (Jogador jogador : jogadores) {
            String nome = jogador.getNome().toLowerCase();
            if (nome.equals(nomeDoJogador)) {
                jogadorEncontrado = jogador;
                break;
            }
            return false;
        }
    }


    public List<Jogador> getJogadores() {
        return Collections.unmodifiableList(jogadores);
    }

    public Jogador getJogador(int indice) {
        return jogadores.get(indice);
    }

    public int getQuantidadeDeJogadores() {
        return jogadores.size();
    }

    public Jogador remover(int indice) {
        Jogador jogadorRemovido = jogadores.remove(indice);
        return jogadorRemovido;
    }

    public ArrayList<Jogador> retornarArtilheiro() {
        return jogadores;
    }

    public boolean registraGol(Jogador jogador) {
        if (jogador.eValido()) {
            jogadores.add(jogador);
        }
        return false;
    }


    public ArrayList<Jogador> pesquisar(String palavraChave) {
        ArrayList<Jogador> jogadoresEncontradas = new ArrayList<>();

        palavraChave = palavraChave.toLowerCase();

        for (Jogador jogador : jogadores) {
            String nome = jogador.getNome().toLowerCase();
            String sobrenome = jogador.getSobrenome().toLowerCase();

            if (nome.contains(palavraChave) || sobrenome.contains(palavraChave)) {
                jogadoresEncontradas.add(jogador);
            }
        }

        return jogadoresEncontradas;
    }
}