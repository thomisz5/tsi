//thomas sá capucho a2256576
public class Horista extends Funcionario {
    private double valorHora;
    private double quantidadeHora;
    public Horista(String nome) {
        super(nome);
    }

    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public String getTipo() {
        return "Horista";
    }

    public double calculaSalario() {
        return   getValorHora() * getQuantidadeHora();
    }

}
