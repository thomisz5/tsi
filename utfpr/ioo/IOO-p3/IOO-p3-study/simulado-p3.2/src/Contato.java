import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private String favorito;

    private ArrayList<String> erros;

    public Contato() {
        this("", "", "");
    }

    public Contato(String nome, String sobrenome, String favorito) {
        erros = new ArrayList<>();

        setNome(nome);
        setSobrenome(sobrenome);
        setFavorito(favorito);
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome.trim();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito.trim();
    }

    public String getFavorito() {
        return this.favorito;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public ArrayList<String> getErros() {
        return erros;
    }

    public boolean eValido() {
        erros.clear();

        if (nome.isEmpty())
            erros.add("Nome não pode ser vazio");

        if (sobrenome.isEmpty())
            erros.add("Sobrenome não pode ser vazio");

        return erros.isEmpty();
    }
}