import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private boolean favorito;

    private ArrayList<String> erros;

    public Contato() {
        this("", "", false);
    }

    public Contato(String nome, String sobrenome, boolean favorito) {
        erros = new ArrayList<>();

        setNome(nome);
        setSobrenome(sobrenome);
        this.favorito = favorito;
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
    
    public boolean getFavorito(){
        return favorito;
    }
    
    public String eFavorito(){
        if(favorito == true)
            return "sim";
        
        return "não";
    }

    public boolean eValido() {
        erros.clear();

        if (nome.isEmpty())
            erros.add("Nome não pode ser vazio");
            
        if(nome.length() < 3)
            erros.add("O nome deve possuir 3 ou mais caracteres");

        if (sobrenome.isEmpty())
            erros.add("Sobrenome não pode ser vazio");
            
        if(sobrenome.length() < 3)
            erros.add("O sobrenome deve possuir 3 ou mais caracteres");

        return erros.isEmpty();
    }
}
