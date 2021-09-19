import java.util.Scanner;

public class Exponencial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de termos: ");
        int n = sc.nextInt();
        System.out.print("Valor de x: ");
        int x = sc.nextInt();

        double s = 0, t;
        for (int i = 0; i < n; i++) {
            t = Math.pow(x, i) /
                    factorial(i);
            s += t;
        }
        System.out.printf("f(%d)=%0.f\n ", x, s);
    }

    double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }
}