public class Contato {
    private String nome;
    private String sobrenome;

    public Contato() {
        this("", "");
    }
    public Contato(String nome, String sobrenome){
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome.trim() + sobrenome.trim();
    }
}
