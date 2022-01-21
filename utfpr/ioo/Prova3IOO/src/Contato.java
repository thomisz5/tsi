//thomas sá capucho
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    private ArrayList<String> erros;

    public Contato() {
        this("", "");
    }

    public Contato(String nome, String sobrenome) {
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

    public boolean eValido() {
        erros.clear();

        if (nome.isEmpty())
            erros.add("Nome não pode ser vazio.");

        if (sobrenome.isEmpty())
            erros.add("Sobrenome não pode ser vazio.");

        return erros.isEmpty();
    }
    public String getTelefone(){
        return telefone;
    }

    private boolean eValidoOFormatoDo(String telefone){
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)\\s\\d{1}\\s\\d{4}-\\d{4}$");
        Matcher matcher = pattern.matcher(telefone);

        return matcher.matches();
    }
}