import java.util.List;
import java.util.Scanner;

public class InterfaceTexto {
    private static final String SAIR = "sair";

    private Scanner entrada;
    private String opcao;

    private SistemaDeTarefas sistTarefa;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        sistTarefa = new SistemaDeTarefas();
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
                cadastrar();
                break;
            case "2":
                editar();
                break;
            case "3":
                remover();
                break;
            case "4":
                marcarTarefaComoConcluida();
                break;
            case "5":
                desmarcarTarefaConcluida();
                break;
            case SAIR:
                sln("Tchau!");
                return;
            default:
                sln("Opção inválida!!");
        }
        pause();
    }

    private void menu() {
        sln("########################################");
        sln("#      Gerenciamento de Tarefas        #");
        sln("########################################");
        sln("#               Menu                   #");
        sln("########################################");
        sln("# 1 - Cadastrar Tarefa                 #");
        sln("# 2 - Editar                           #");
        sln("# 3 - Remover                          #");
        sln("# 4 - Marcar como concluída            #");
        sln("# 5 - Desmarcar como concluída         #");
        sln("#                                      #");
        sln("# Digite sair para encerrar            #");
        sln("########################################");
        sln("");
    }

    private void cadastrar() {
        String titulo = leia("Insira o título da tarefa: ");
        String descricao = leia("Insira a descrição da tarefa: ");

        Tarefa tarefa = new Tarefa(titulo, descricao);

        if (sistTarefa.adicionaTarefa(tarefa))
            sln("Tarefa adicionada com sucesso!");
        else {
            sln();
            sln("Tarefa não adicionada, os seguintes erros foram encontrados: ");
            for (String erro : tarefa.getErros()) {
                sln("  " + erro);
            }
        }
    }

    public void editar() {
        listar();
    }

    public void remover() {
        listar();
    }

    private void listar() {
        listarTarefas(sistTarefa.getTarefas());
    }


    private void listarTarefas(List<Tarefa> tarefas) {
        sln("-----------------------------------------");
        sln("      Visualização das Tarefas          ");
        sln("-----------------------------------------");
        sln(tarefas.size() + " tarefas encontrada(s)");
        sln("-----------------------------------------");

        for (Tarefa tarefa : tarefas) {
            sln("Id: " + tarefa.getId());
            sln("Tarefa completa: " + tarefa.getTarefaCompleta() + tarefa.isConcluida());
            sln("-----------------------------------------");
        }
    }



/*
    private void leiaVerifiqueOpcoesDoMenuSecretos() {
        opcao = leia("Digite a opção escolhida");
        limpar();
        switch (opcao) {
            case "1":
                marcarTarefaComoConcluida();
                break;
            case "2":
                desmarcarTarefaConcluida();
                break;
            default:
                sln("Opção inválida!!");
        }
        pause();
    }
*/

    private void marcarTarefaComoConcluida() {
        listarTarefas(sistTarefa.getTodasTarefas());


        sln();
        String idS = leia("Digite o id da tarefa:");
        int id = Integer.parseInt(idS);
        Tarefa tarefa = sistTarefa.getTarefaPeloID(id);
        tarefa.marcarComoConcluida();
        sln("A Tarefa " + tarefa.getTarefaCompleta() + "'foi marcada como concluída!'");
    }

    private void desmarcarTarefaConcluida() {
        listarTarefas(sistTarefa.getTodasTarefas());

        sln();
        String idS = leia("Digite o id da tarefa: ");
        int id = Integer.parseInt(idS);
        Tarefa tarefa = sistTarefa.getTarefaPeloID(id);
        tarefa.desmarcarComoConcluida();
        sln("A Tarefa " + tarefa.getTarefaCompleta() + "' foi desmarcada" + "com sucesso! '");

    }

    private void pause() {
        sln();
        sln("Pressione a tecla enter para continuar...");
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