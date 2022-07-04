import java.util.Scanner;
import java.util.ArrayList;

public class InterfaceTexto {
    private static final String SAIR = "sair";

    private Scanner entrada;
    private String opcao;

    private BlocoDeNotas bloco;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        bloco = new BlocoDeNotas();
    }

    public void renderizar() {
        do {
            limpar();
            menu();
            leiaVerifique();
        } while (!opcao.equals(SAIR));
    }

    private void leiaVerifique() {
        opcao = leia("Digite a opção escolhida");
        limpar();
        switch (opcao) {
            case "1":
                adicionar();
                break;
            case "2":
                listarNotas();
                break;
            case "3":
                listarNotasFavoritas();
                break;
            case SAIR:
                sln("Tchau!");
                return;
            default:
                sln("Opção inválida!!");
        }
        pause();
    }

    private void adicionar() {
        boolean favorito = false;
        String titulo = leia("Digite o título da nota: ");
        String texto = leia("Digite o texto da nota: ");
        boolean favoritarNota = leiaBoleano("Favoritar Nota");

        if (favoritarNota == true)
            favorito = true;

        Nota nota = new Nota(titulo, texto, favorito);
        bloco.adicionaNota(nota);
    }

    private void listarNotas() {
        listarNotas(bloco.getNotas());
    }

    private void listarNotasFavoritas() {
        listaFavoritos(bloco.getNotas());
    }

    private void listarNotas(ArrayList<Nota> notas) {
        sln("-----------------------------------------");
        sln("|        Visualização das Notas         |");
        sln("-----------------------------------------");
        sln(bloco.getQuantidadeDeNotas() + " nota(s) cadastrada(s)");
        sln("-----------------------------------------");

        int i = 0;
        for (Nota nota : notas) {
            sln("Nota: " + ++i);
            sln("Título: \n\t" + nota.getTitulo());
            sln("Texto: \n\t" + nota.getTexto());
            sln("-----------------------------------------");
        }
    }

    private void listaFavoritos(ArrayList<Nota> notas) {

        ArrayList<Nota> favoritosEncontrados = bloco.notasFavoritas();

        sln("-----------------------------------------");
        sln("|            Notas Favoritas            |");
        sln("-----------------------------------------");
        sln(favoritosEncontrados.size() + " nota(s) cadastrada(s)");
        sln("-----------------------------------------");

        int i = 0;
        for (Nota nota : favoritosEncontrados) {;
            sln("Título: \n\t" + nota.getTitulo());
            sln("Texto: \n\t" + nota.getTexto());
            sln("-----------------------------------------");
        }
    }

    private void menu() {
        sln("########################################");
        sln("#           Bloco de Notas             #");
        sln("########################################");
        sln("#               Menu                   #");
        sln("########################################");
        sln("# 1 - Adicionar                        #");
        sln("# 2 - Listar                           #");
        sln("# 3 - Listar Favoritos                 #");
        sln("#                                      #");
        sln("# Digite sair para encerrar            #");
        sln("########################################");
        sln("");
    }

    private void pause() {
        sln();
        sln("Pressione a tecla enter para continuar..");
        entrada.nextLine();
    }

    private String leia(String s) {
        sln(s);
        s("> ");
        return entrada.nextLine();
    }

    private boolean leiaBoleano(String s) {
        String ss = s + "\n[S]im, [N]ão";
        String entrada = leia(ss).toLowerCase();

        if (entrada.equals("s") || entrada.equals("sim"))
            return true;

        return false;
    }

    private void limpar() {
        s("\f");             // Limpa terminal do Bluej
        //s("\033[H\033[2J");  // Limpa terminal do Linux
        //System.out.flush();  // Limpa terminal linux
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }

    private void s(String s) {
        System.out.print(s);
    }
}