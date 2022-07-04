/*
public class Jogador {
    private String nome;
    private int pontuacao;
    private String sinal;

    public Jogador(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        //if (nome.isEmpty()) {
        if (!nome.isBlank())
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
}*/
public class Jogador {
private String nome;
private int pontuacao;
private String sinal;
    public Jogador(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setNome(String nome) {
        if (!nome.isBlank())
        this.nome = nome;
    }

    public int incrementarPontuacao() {
        return pontuacao+=1;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }
}