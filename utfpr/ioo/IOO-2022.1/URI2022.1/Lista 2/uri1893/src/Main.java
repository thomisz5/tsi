import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto{
    private Scanner scanner;
    private Lua lua;

    public InterfaceTexto(){
        scanner = new Scanner(System.in);
        lua = new Lua();
    }
    public void executar(){
        lua.setInicio(scanner.nextInt());
        lua.setFim(scanner.nextInt());

        System.out.println(lua.getFase());
    }
}

class Lua {
    private int inicio;
    private int fim;

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public String getFase() {
        if (inicio >= 0 && fim <= 2)
            return  "nova";

        if (fim > inicio && fim <= 96)
            return "crescente";

        if (inicio >= fim && fim <= 96)
            return "minguante";

        return "cheia";
    }
}

