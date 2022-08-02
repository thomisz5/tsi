import java.util.List;
import java.util.Scanner;

public class InterfaceTexto {
    private static final String SAIR = "sair";

    private Scanner entrada;
    private String opcao;

    private Agenda agenda;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        agenda = new Agenda();
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
                listar();
                break;
            case "3":
                pesquisar();
                break;
            case "357":
                configuracoesSecretas();
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
        String nome = leia("Digite o nome do contato: ");
        String sobrenome = leia("Digite sobrenome do contato: ");

        Contato contato = new Contato(nome, sobrenome);

        if (agenda.adicionaContato(contato))
            sln("Contato adicionado com sucesso!");
        else {
            sln();
            sln("Contato não adicionado, os seguintes erros foram encontrados: ");
            for (String erro : contato.getErros()) {
                sln("  " + erro);
            }
        }
    }

    private void listar() {
        listarContatos(agenda.getContatos());
    }

    private void pesquisar() {
        String palavraChave = leia("Digite o termo de busca");

        listarContatos(agenda.pesquisar(palavraChave));
    }

    private void listarContatos(List<Contato> contatos) {
        sln("-----------------------------------------");
        sln("      Visualização dos Contatos          ");
        sln("-----------------------------------------");
        sln(contatos.size() + " encontrado(s)");
        sln("-----------------------------------------");

        for (Contato contato : contatos) {
            sln("Id: " + contato.getId());
            sln("Nome completo: " + contato.getNomeCompleto());
            sln("-----------------------------------------");
        }
    }

    private void menu() {
        sln("########################################");
        sln("#         Agenda de Contatos           #");
        sln("########################################");
        sln("#               Menu                   #");
        sln("########################################");
        sln("# 1 - Adicionar                        #");
        sln("# 2 - Listar                           #");
        sln("# 3 - Pesquisar                        #");
        sln("#                                      #");
        sln("# Digite sair para encerrar            #");
        sln("########################################");
        sln("");
    }

    /**************************************************************
     * Métodos para o menu secreto
     **************************************************************/
    private void menuSecreto() {
        sln("########################################");
        sln("#             Menu Secreto             #");
        sln("########################################");
        sln("# 1 - Marcar Contato como Secreto      #");
        sln("# 2 - Desmarcar Contato como Secreto   #");
        sln("#                                      #");
        sln("# Digite 0 para sair                   #");
        sln("########################################");
        sln("");
    }

    private void configuracoesSecretas() {
        do {
            limpar();
            menuSecreto();
            leiaVerifiqueOpcoesDoMenuSecretos();
        } while (!opcao.equals("0"));
    }

    private void leiaVerifiqueOpcoesDoMenuSecretos() {
        opcao = leia("Digite a opção escolhida");
        limpar();
        switch (opcao) {
            case "1":
                marcarContatoComoSecreto();
                break;
            case "2":
                desmarcarContatoSecreto();
                break;
            case "0":
                sln("Menu secreto encerrado!");
                return;
            default:
                sln("Opção inválida!!");
        }
        pause();
    }

    private void marcarContatoComoSecreto() {
        listarContatos(agenda.getTodosContatos());

        sln();
        String idS = leia("Digite o id do contato:");
        int id = Integer.parseInt(idS);
        Contato contato = agenda.getContatoPeloId(id);
        contato.marcarComoSecreto();
        sln("O contato '" + contato.getNomeCompleto() + "' foi escondido com sucesso!");
    }

    private void desmarcarContatoSecreto() {
        listarContatos(agenda.getTodosContatos());

        sln();
        String idS = leia("Digite o id do contato:");
        int id = Integer.parseInt(idS);
        Contato contato = agenda.getContatoPeloId(id);
        contato.desmarcarSecreto();
        sln("O contato '" + contato.getNomeCompleto() + "' foi desmarcado" + "com sucesso!");

    }

    /**************************************************************
     * Métodos para entrada e saída de dados
     **************************************************************/

    private void pause() {
        sln();
        sln("Pressione a tecla enter para continuar..");
        entrada.nextLine();
    }

    private String leia(String s) {
        sln(s);
        s("> ");
        return entrada.nextLine().trim();
    }

    private void limpar() {
        s("\f");                                 // Limpa terminal do Bluej
        s("\033[H\033[2J");
        System.out.flush();  // Limpa terminal do Linux
    }

    private void sln() {
        System.out.println();
    }

    private void sln(Object s) {
        System.out.println(s);
    }

    private void s(Object s) {
        System.out.print(s);
    }
}