import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Fabiola da Silva", 10000));
        funcionarios.add(new Secretario("João Silva", 1000));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("O salário de " + funcionario.getNome() + " é R$" + funcionario.getSalario());
        }
    }
}