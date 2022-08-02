
import java.util.Scanner;

public class URI 1192 {

public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
        String linha = leitor.next();
        int x = Character.getNumericValue(linha.charAt(0));
        char z = linha.charAt(1);
        int y = Character.getNumericValue(linha.charAt(2));
        if (x == y) {
        System.out.println(x * y);
        } else if (Character.isUpperCase(z)) {
        System.out.println(y - x);
        } else {
        System.out.println(x + y);
        }
        }
        }

        }