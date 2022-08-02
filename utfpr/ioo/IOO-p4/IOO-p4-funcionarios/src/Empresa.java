
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void registraFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    public void calcularSalarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.processar();
        }
    }

    public double getTotalDeSalariosAPagar() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }
}