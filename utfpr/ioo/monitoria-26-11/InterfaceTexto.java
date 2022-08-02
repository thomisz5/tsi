import java.util.Scanner;
import java.util.ArrayList;

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
        } while(!opcao.equals(SAIR));
    }

    private void leiaVerifique() {
        opcao = leia("Digite a opção escolhida");
        limpar();
        switch(opcao) {
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
            case "5":
            listarFavoritos();
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

        String nome = leia("Digite o nome do contato: ");
        String sobrenome = leia("Digite sobrenome do contato: ");

        boolean favoritoResp = leiaBoleano("Marcar como favorito: ");

        if(favoritoResp == true)
            favorito = true;

        Contato contato = new Contato(nome, sobrenome, favorito);

        if (agenda.adicionaContato(contato))
            sln("Contato adicionado com sucesso!");
        else {
            sln();
            sln("Contato não adicionado, os seguintes erros foram encontrados: ");
            for(String erro : contato.getErros()) {//percorrendo a colecao
                sln("  " + erro);
            }
        }
    }

    private void listar() {
        listarContatos(agenda.getContatos());
    }

    private void listarFavoritos(){
        listarContatosFavoritos(agenda.getContatos());
    }

    private void remover() {
        listarContatosComIndice();

        if(agenda.getContatos().size() > 0){

            sln();
            String indiceS = leia("Digite o índice do contato que deseja remover");

            try{
                int indice = Integer.parseInt(indiceS);

                sln("Indice: " + indice + "\n" +
                    "Nome: " + agenda.getContato(indice).getNomeCompleto() + "\n" +
                    "Favorito: " + agenda.getContato(indice).eFavorito() + "\n");

                boolean resp = leiaBoleano("Tem certeza que deseja remover?");
                //s || sim

                if(resp == true){
                    Contato contatoRemovido = agenda.remover(indice);
                    sln();
                    sln("O contato '" + contatoRemovido.getNomeCompleto() + "' foi removido com sucesso!");
                }else{
                    sln();
                    sln("Ação cancelada pelo usuário!");
                }
            }catch(IndexOutOfBoundsException e){
                sln("Não existe uma nota com o índice " + indiceS);
            }catch(NumberFormatException e){
                sln("'" + indiceS + "' não é um número");
            }

        }else{
            sln("Não existem contatos cadastrados!");
        }
    }

    private void pesquisar() {
        String palavraChave = leia("Digite o termo de busca");

        listarContatos(agenda.pesquisar(palavraChave));
    }

    private void listarContatosComIndice() {
        sln("-----------------------------------------");
        sln("| Índice | Nome completo                 |");
        sln("-----------------------------------------");

        ArrayList<Contato> contatos = agenda.getContatos();

        for(int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);

            System.out.printf("  %4d   | %s", i, contato.getNomeCompleto() + "\n");
            sln("-----------------------------------------");
        }
    }

    private void listarContatos(ArrayList<Contato> contatos) {
        sln("-----------------------------------------");
        sln("|      Visualização dos Contatos         |");
        sln("-----------------------------------------");
        sln(contatos.size() + " encontrado(s)");
        sln("-----------------------------------------");

        int i = 0;
        for(Contato contato : contatos) {
            sln("Contato: " + ++i);
            sln("Nome completo: " + contato.getNomeCompleto());
            sln("Favorito: " + contato.eFavorito());
            sln("-----------------------------------------");
        } 
    }

    private void listarContatosFavoritos(ArrayList<Contato> contatos) {
        sln("-----------------------------------------");
        sln("|   Visualização dos Contatos Favorito   |");
        sln("-----------------------------------------");
        sln(agenda.getQuantidadeDeContatosFavoritos() + " encontrado(s)");
        sln("-----------------------------------------");

        int i = 1;
        for(Contato contato : contatos) {
            //contato.getFavorito() == true;
            if(contato.eFavorito().equals("sim")){
                sln("Contato: " + i);
                sln("Nome completo: " + contato.getNomeCompleto());
                sln("Favorito: " + contato.eFavorito());
                sln("-----------------------------------------");
            }
            i++;
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
        sln("# 5 - Listar Favoritos                 #");
        sln("#                                      #");
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
        return entrada.nextLine().trim();
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