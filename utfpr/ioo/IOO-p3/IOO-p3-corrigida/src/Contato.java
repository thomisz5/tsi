import java.util.ArrayList;
import java.util.List;

public class Contato {
    private int id;
    private static int incrementadorDeId;

    private String nome;
    private String sobrenome;
    private boolean secreto;

    private ArrayList<String> erros;

    public Contato() {
        this("", "");
    }

    public Contato(String nome, String sobrenome) {
        erros = new ArrayList<>();
        id = ++incrementadorDeId;

        setNome(nome);
        setSobrenome(sobrenome);
    }

    public int getId() {
        return id;
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

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public List<String> getErros() {
        return erros;
    }

    public boolean eValido() {
        erros.clear();

        if (nome.isEmpty())
            erros.add("Nome não pode ser vazio.");

        if (sobrenome.isEmpty())
            erros.add("Sobrenome não pode ser vazio.");

        return erros.isEmpty();
    }

    public boolean isSecreto() {
        return secreto;
    }

    public void marcarComoSecreto() {
        secreto = true;
    }

    public void desmarcarSecreto() {
        secreto = false;
    }
}