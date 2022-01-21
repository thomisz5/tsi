import java.util.Scanner;

public class Espacos {
    public static void main(String[] args) {
        String texto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um texto: ");
        texto = scanner.nextLine();

        String replace = texto.replaceAll("\\s+", "&");
        //String [] palavras = texto.split("\\s+")
        texto= replace.replaceAll("&", " ");
        System.out.println(texto);


    }
}
