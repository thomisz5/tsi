import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}
class InterfaceTexto{
    private Scanner scanner;
    private Ponto ponto;

    public InterfaceTexto(){
        scanner = new Scanner(System.in);
        ponto = new Ponto();
    }
    public void executar(){
        ponto.setX(scanner.nextDouble());
        ponto.setY(scanner.nextDouble());

        System.out.println(ponto.getCoordenada());
    }
}
class Ponto{
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String getCoordenada(){
        if (x == 0 && y == 0) {
            return ("Origem");
        } else if (x == 0) {
            return ("Eixo Y");
        } else if (y == 0) {
            return ("Eixo X");
        } else if (y > 0 && x > 0) {
            return("Q1");
        } else if (y > 0 && x < 0) {
            return ("Q2");
        } else if (y < 0 && x < 0) {
            return ("Q3");
        } else if (y < 0 && x > 0) {
            return ("Q4");
        }
        return "";
    }
}
