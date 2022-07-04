public class Cliente {
private String nome, cpf;
    public Cliente(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public void setNome(String nome) {
        nome = nome.trim();

        if (nome.contains(" "))
            this.nome=nome;

    }

    public void setCpf(String cpf) {
        cpf = cpf.trim();

        if (cpf.length()==14)
            this.cpf=cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
