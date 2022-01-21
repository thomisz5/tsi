import java.util.Scanner;

public class Iniciais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int palavra =0;
        String s = " ", frase;

        System.out.println("insira uma frase: ");
        Scanner dado = new Scanner(System.in);
        s=dado.nextLine();
        frase=s;

        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==' '){
                palavra+=1;
            }if (frase.charAt(i)=='.'){
                palavra+= 1;
                break;
            }
            else {
                continue;
            }
        }
        System.out.println("numero de palavras "+ palavra);
    }
}

