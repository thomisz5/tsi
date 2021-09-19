
public class Secretario extends Funcionario {

    public Secretario(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonificacao() {
        return 1.15;
    }
}
