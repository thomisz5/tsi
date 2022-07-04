import java.util.Scanner;

public class InterfaceTexto {
    private static final String SAIR = "sair";

    private Scanner entrada;
    private String opcao;

    private Pedagio pedagio;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        pedagio = new Pedagio();
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
                registrarCarro();
                break;
            case "2":
                registrarCaminhao();
                break;
            case "3":
                registrarVeiculoOficial();
                break;
            case "4":
                relatorios();
                break;
            case SAIR:
                sln("Tchau!");
                return;
            default:
                sln("Opção inválida!!");
        }
        pause();
    }

    public void registrarCarro() {
        String placa = leia("Digite a placa do carro");
        pedagio.registraVeiculos(new Carro(placa, 10));
    }

    public void registrarCaminhao() {
        String placa = leia("Digite a placa do caminhão");
        String nde = leia("Digite a quantidade de eixos");
        int numeroDeEixos = Integer.parseInt(nde);

        pedagio.registraVeiculos(new Caminhao(placa, 20, numeroDeEixos));
    }

    public void registrarVeiculoOficial() {
        String placa = leia("Digite a placa do caminhão");
        pedagio.registraVeiculos(new VeiculoOficial(placa));
    }

    private void relatorios() {
        sln("Quantidade de Veiculos: " + pedagio.getTotalDeVeiculos());
        sln("Total arrecadado: " + pedagio.getTotalArrecadado());
    }

    private void menu() {
        sln("########################################");
        sln("#            Pedágio de IOO            #");
        sln("########################################");
        sln("#   Registro de Passagem de Veículo    #");
        sln("########################################");
        sln("# 1 - Registrar Carro                  #");
        sln("# 2 - Registrar Caminhao               #");
        sln("# 3 - Registrar Veiculo Oficial        #");
        sln("# 4 - Relatórios                       #");
        sln("#                                      #");
        sln("########################################");
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

    private void limpar() {
        s("\f");               // Limpa terminal do Bluej
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