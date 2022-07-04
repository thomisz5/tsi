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
    private Scanner leitor;
    private MaiorValor maiorValor;

    public InterfaceTexto()
    {
        leitor = new Scanner (System.in);
        maiorValor = new MaiorValor();
    }

    public void executar() {
        while (maiorValor.getQuantidade() <= 100)
        {
            maiorValor.setValor(leitor.nextInt());
            maiorValor.calculoMaiorValor();
            maiorValor.incrementarQuantidade(1);
        }

        System.out.println(maiorValor.getMaiorValor() + "\n" + maiorValor.getPosicao());
    }
}

class MaiorValor
{
    private int quantidade, valor, maiorValor, posicao;

    public MaiorValor()
    {
        quantidade = 1;
        valor = 0;
        maiorValor = 0;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public int getValor()
    {
        return valor;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void incrementarQuantidade(int incremento)
    {
        quantidade = quantidade + incremento;
    }

    public void calculoMaiorValor()
    {
        if (valor > maiorValor)
        {
            maiorValor = valor;
            posicao = quantidade;
        }
    }

    public int getMaiorValor()
    {
        return maiorValor;
    }

    public int getPosicao()
    {
        return posicao;
    }
}