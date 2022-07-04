import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private ParesImpares paresImpares;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        paresImpares = new ParesImpares();
    }

    public void executar() {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            paresImpares.getLista().add(scanner.nextInt());
            paresImpares.getParImpar();
        }
        for (Integer y : paresImpares.getPar())
            System.out.println(y);
        for (Integer z : paresImpares.getImpar())
            System.out.println(z);
    }
}

class ParesImpares {
    private List<Integer> lista = new ArrayList<>();
    private List<Integer> par = new ArrayList<>();
    private List<Integer> impar = new ArrayList<>();

    public List<Integer> getImpar() {
        return impar;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public List<Integer> getPar() {
        return par;
    }

    public void getParImpar() {
        for (Integer x : lista) {
            if (x % 2 == 0)
                par.add(x);
            else
                impar.add(x);
        }
        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);
    }
}