public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome,salario);
    }

    public double getBonificacao() {
        return 1.4;
    }
}