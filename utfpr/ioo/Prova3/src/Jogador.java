//thomas sá capucho
import java.util.ArrayList;

public class Jogador {
    private String nome;
    private String sobrenome;
    private int gol;

    private ArrayList<String> erros;

    public Jogador(String novoGol) {
        this("", "");
    }

    public Jogador(String nome, String sobrenome) {
        erros = new ArrayList<>();

        setNome(nome);
        setSobrenome(sobrenome);
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

    public ArrayList<String> getErros() {
        return erros;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }
    public int getGol(){
        return gol;
    }
    public void incrementaGol(){
        gol++;
    }


    public boolean eValido() {
        erros.clear();

        if (nome.isEmpty())
            erros.add("Nome não pode ser vazio.");

        if (sobrenome.isEmpty())
            erros.add("Sobrenome não pode ser vazio.");

        return erros.isEmpty();
    }
}