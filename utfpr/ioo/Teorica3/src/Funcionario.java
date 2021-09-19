public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return this.salario * getBonificacao();
    }

    public double getBonificacao() {
        return 1.1;
    }
}