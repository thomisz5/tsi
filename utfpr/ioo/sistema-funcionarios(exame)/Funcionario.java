//thomas sá capucho SI1B
public abstract class Funcionario {
    private String nome;
    private double salario;
    private double valorHora;
    private double quantidadeHora;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, double valorHora, double quantidadeHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }

    ;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }


    public abstract String getTipo();

    public abstract double processar();
}
