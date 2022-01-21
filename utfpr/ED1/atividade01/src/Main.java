import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Palavra palavra = new Palavra(input.next());

        System.out.println(palavra.tamanho());
        System.out.println(palavra.minusculas());
        System.out.println(palavra.maiusculas());
        System.out.println(palavra.comecaComUTF());
        System.out.println(palavra.terminaComPR());
        System.out.println(palavra.vogais());
        System.out.println(palavra.palindromo());
    }
}


class Palavra {
    private String word;

    public Palavra(String word) {
        this.word = word;
    }

    public int tamanho() {
        return word.length();
    }

    public String minusculas() {
        return word.toLowerCase();
    }

    public String maiusculas() {
        return word.toUpperCase();
    }

    public String comecaComUTF() {

        if (word.startsWith("UTF"))
            return "" + word;
        else
            return "Não começa com UTF";
    }

    public String terminaComPR() {
        if (word.endsWith("PR"))
            return "" + word;
        else
            return "não termina com PR";
    }

    public int vogais() {
        int quantidade = 0;
        word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    quantidade++;
                    break;
                default:
            }
        }
        return quantidade;
    }

    public String palindromo(){
        String palindromo ="";
        for (int i=(word.length()-1); i>=0;i--){
            palindromo=palindromo+word.charAt(i);
        }
        if (palindromo.toLowerCase().equals(word.toLowerCase())){
            return "esta palavra é um palíndromo";
        }else {
            return "esta palavra não é palíndromo";
        }
    }
}