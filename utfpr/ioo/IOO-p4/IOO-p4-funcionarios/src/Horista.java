public class Horista extends Funcionario {
    private double valorHora;
    private double quantidadeHora;

    public Horista(String nome, double valorHora, double quantidadeHora) {
        super(nome, valorHora, quantidadeHora);
    }
    public double getValorHora() {
        return valorHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    public String getTipo() {
        return "Horista";
    }

    public double processar() {
        return getValorHora() * getQuantidadeHora();
        //valor hora*quantidadehora
    }
}