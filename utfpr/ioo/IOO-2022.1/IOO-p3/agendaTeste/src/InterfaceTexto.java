//thomas sá capucho
import java.util.List;
import java.util.Scanner;

public class InterfaceTexto {
    private static final String SAIR = "sair";

    private Scanner entrada;
    private String opcao;

    private Agenda agenda;
    private Contato telefone;

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
                remover();
                break;
            case "4":
                pesquisar();
                break;
            case"5":
                registrarTelefone();
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
        String telefone = leia("insira o telefone do contato: ");

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

    private void remover() {
        listarContatosComIndice();

        sln();
        String indiceS = leia("Digite o índice do contato que deseja remover");

        int indice = Integer.parseInt(indiceS);

        Contato contatoRemovido = agenda.remover(indice);

        sln("O contato '" + contatoRemovido.getNomeCompleto() + "' foi removido com sucesso!");
    }

    private void registrarTelefone() {
        String telefone = leia("insira o telefone no formato (##) # ####-####");
        Contato fone = new Contato(telefone);

        if (agenda.registraTelefone(fone))
            sln("Telefone registrado com sucesso!");
        else {
            sln();
            sln("O telefone deve seguir o formato  (##) # ####-####");
        }

    }


    private void pesquisar() {
        String palavraChave = leia("Digite o termo de busca");

        listarContatos(agenda.pesquisar(palavraChave));
    }

    private void listarContatosComIndice() {
        sln("-----------------------------------------");
        sln("| Índice | Nome completo                |");
        sln("-----------------------------------------");

        List<Contato> contatos = agenda.getContatos();

        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);

            sf("| %-6d | %-28s |%n", i, contato.getNomeCompleto());
            sln("-----------------------------------------");
        }
    }

    private void listarContatos(List<Contato> contatos) {
        sln("-----------------------------------------");
        sln("      Visualização dos Contatos          ");
        sln("-----------------------------------------");
        sln(contatos.size() + " encontrado(s)");
        sln("-----------------------------------------");

        int i = 0;
        for (Contato contato : contatos) {
            sln("Contato: " + ++i);
            sln("Nome completo: " + contato.getNomeCompleto());
            sln("Telefone: "+ contato.getTelefone());
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
        sln("# 3 - Remover                          #");
        sln("# 4 - Pesquisar                        #");
        sln("# 5 - Registrar Telefone               #");
        sln("#                                      #");
        sln("#                                      #");
        sln("# Digite sair para encerrar            #");
        sln("########################################");
        sln("");
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

    private void sf(Object s, Object... args) {
        System.out.printf(s.toString(), args);
    }

    private boolean leiaBoleano(String s) {
        String ss = s + "\n[S]im, [N]ão";
        String entrada = leia(ss).toLowerCase();

        if (entrada.equals("s") || entrada.equals("sim"))
            return true;

        return false;
    }

    /**************************************************************
     * Métodos úteis
     **************************************************************/

    private String centralizar(String s, int espacoDisponivel) {
        int tamanho = s.length();
        int qntDeEspacos = (espacoDisponivel - tamanho) / 2;
        String espacos = " ".repeat(qntDeEspacos);

        s = espacos + s + espacos;

        if ((espacoDisponivel - tamanho) % 2 == 0)
            return s;

        return s + " ";
    }

    private String centralizar(int numero, int espacoDisponivel) {
        return centralizar(numero + "", espacoDisponivel);
    }
}