import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

public class InterfaceTexto {
    private Scanner leitor;
    private Experiencias experiencias;

    public InterfaceTexto() {
        leitor = new Scanner(System.in);
        experiencias = new Experiencias();
    }

        public void executar() {
            experiencias.setLimite(leitor.nextInt());

            do {
                experiencias.setQuantidade(leitor.nextInt());
                experiencias.setTipo(leitor.next().charAt(0));

                experiencias.incrementarContagem(1);

                experiencias.calcularQuantidade();
                experiencias.calcularPorcentagem();
            } while (experiencias.getContagem() != experiencias.getLimite());

            System.out.println("Total: " + experiencias.getTotal() + " cobaias" + "\n" +
                    "Total de coelhos: " + experiencias.getCoelho() + "\n" +
                    "Total de ratos: " + experiencias.getRato() + "\n" +
                    "Total de sapos: " + experiencias.getSapo());

            System.out.printf("Percentual de coelhos: %.2f" + " %%" + "\n" +
                    "Percentual de ratos: %.2f" + " %%" + "\n" +
                    "Percentual de sapos: %.2f" + " %%" + "\n", experiencias.getCoelhoPorcento(), experiencias.getRatoPorcento(), experiencias.getSapoPorcento());
        }
    }
class Experiencias{
private String sapo,rato,coelho;
private int limite, quantidade;

    public String getSapo() {
        return sapo;
    }

    public void setSapo(String sapo) {
        this.sapo = sapo;
    }

    public String getRato() {
        return rato;
    }

    public void setRato(String rato) {
        this.rato = rato;
    }

    public String getCoelho() {
        return coelho;
    }

    public void setCoelho(String coelho) {
        this.coelho = coelho;
    }
    public int getTotal(){
        return 0;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }
}
