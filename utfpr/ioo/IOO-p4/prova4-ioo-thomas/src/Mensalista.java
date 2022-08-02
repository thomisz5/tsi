//thomas sá capucho a2256576
public class Mensalista extends Funcionario {

    public Mensalista(String nome, double salario) {
        super(nome, salario);
    }

    public String getTipo() {
        return "Mensalista";
    }

    public double calculaSalario() {
        return getSalario();
    }
}