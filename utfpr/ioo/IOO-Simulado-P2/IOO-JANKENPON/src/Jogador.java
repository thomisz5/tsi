public class Jogador {
    private String nome;
    private int pontuacao;
    private String sinal;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        //if (nome.isEmpty()) {
        if (nome == null)
            this.nome = nome;
        //}
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int incrementarPontuacao() {
        return pontuacao += 1;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }
}
