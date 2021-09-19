import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Salto salto;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        salto = new Salto();
    }

    public void executar() {
        salto.setN(scanner.nextInt());
        for (int i = 0; i < salto.getN(); i++) {
            String nome = scanner.next();
            double dificuldade = scanner.nextDouble();
            double[] notas = new double[7];
            for (int j = 0; j < notas.length; j++) {
                notas[j] = scanner.nextDouble();
            }
            salto.zerarNotaMaisBaixa(notas);
            salto.zerarNotaMaisAlta(notas);
            double notaFinal = salto.calcularNotaFinal(notas, dificuldade);
            System.out.println(String.format("%s %.2f", nome, notaFinal));
        }
    }

    class Salto {
        private int N;

        public void setN(int n) {
            N = n;
        }

        public int getN() {
            return N;
        }

        private void zerarNotaMaisBaixa(double[] notas) {
            int indice = 0;
            for (int i = 1; i < notas.length; i++) {
                if (notas[i] < notas[indice]) indice = i;
            }
            notas[indice] = 0.0;
        }

        private void zerarNotaMaisAlta(double[] notas) {
            int indice = 0;
            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > notas[indice]) indice = i;
            }
            notas[indice] = 0.0;
        }

        private double calcularNotaFinal(double[] notas, double dificuldade) {
            double soma = 0.0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            return (soma * dificuldade);
        }
    }
}