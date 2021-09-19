import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}
class InterfaceTexto{
    private Scanner scanner;
    private Animal animal;

    public InterfaceTexto(){
        scanner = new Scanner(System.in);
        animal = new Animal();
    }
    public void executar(){
    animal.setA(scanner.next());
    animal.setB(scanner.next());
    animal.setC(scanner.next());

        System.out.println(animal.getVertebrado());
    }
}
class Animal {
    private String A, B, C;

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void setC(String c) {
        C = c;
    }

    public String getVertebrado() {
        if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
            return ("aguia\n");
        }
        if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
            return ("pomba\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
            return ("homem\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
            return ("vaca\n");
        }

        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
            return ("pulga\n");
        }
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
            return ("lagarta\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
            return ("sanguessuga\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
            return ("minhoca\n");
        }
        return "";
    }
}