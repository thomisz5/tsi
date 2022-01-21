//nao consegui fazer direito
import java.util.Scanner;

public class Extenso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        numerosExtensos extensos = new numerosExtensos(input.next());

        System.out.println(extensos.converterEscrita());
    }
}

class numerosExtensos {
    private String numeros;

    public numerosExtensos(String numeros) {
        this.numeros = numeros;
    }

    public String converter() {
        for (int i = 0; i < numeros.length(); i++) {
            converter(numeros.charAt(i));
        }
    }

    public String converterEscrita(char num) {
        String[] numero = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        int index = 0;

        switch (num) {
            case '0':
                index = 0;
                break;
            case '1':
                index = 1;
                break;
            case '2':
                index = 2;
                break;
            case '3':
                index = 3;
                break;
            case '4':
                index = 4;
                break;
            case '5':
                index = 5;
                break;
            case '6':
                index = 6;
                break;
            case '7':
                index = 7;
                break;
            case '8':
                index = 8;
                break;
            case '9':
                index = 9;
                break;
        }
        return numero[index];
    }
}
