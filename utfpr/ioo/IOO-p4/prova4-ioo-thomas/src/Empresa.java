//thomas sá capucho a2256576

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

    public double getTotalDeSalariosAPagar() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }

    public void calcularSalarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.calculaSalario();
        }
    }
}