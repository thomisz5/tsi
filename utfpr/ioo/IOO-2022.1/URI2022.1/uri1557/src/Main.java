import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto
{
    private Scanner scanner;
    private MatrizDeInteiros matrizDeInteiros;

    public InterfaceTexto()
    {
        scanner = new Scanner (System.in);
        matrizDeInteiros = new MatrizDeInteiros();
    }

    public void executar()
    {
int N =scanner.nextInt();
while (N!=0){
    int [][] M = new int[N][N];
    matrizDeInteiros.getX();

    for (int i =1;i<=N;i++){
        matrizDeInteiros.getY() = matrizDeInteiros.getX();
        for (int j=1;j<=N,j++){
            Masdjaiodjqopwdqpopajsdiopafodsae
        }
    }
}
    }
}

class MatrizDeInteiros
{
    private int X,T,Y;


    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getX() {
        return 1;
    }

    public void setX(int x) {
        X = x;
    }

}