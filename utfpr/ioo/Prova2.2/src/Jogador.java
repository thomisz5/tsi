//thomas sá capucho
public class Jogador {
    private String nome;
    private String sinal;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao=0;
    }

    public void setNome(String nome) {
        if (nome!=nome)
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void incrementarPontuacao() {
        pontuacao++;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }

    public String getNome() {
        return nome;
    }
}
