public class Horista extends Funcionario {

    public Horista(String nome, double valorHora, double quantidadeHora) {
        super(nome, valorHora, quantidadeHora);
    }

    public String getTipo() {
        return "Horista";
    }

    public double processar() {
        return getValorHora() * getQuantidadeHora();
        //valor hora*quantidadehora
    }
}