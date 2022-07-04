public class Craps {
    private Dado dado1;
    private Dado dado2;
    private String status;
    private int pontuacao;
    private static final String NAO_INICIADO = "não iniciado";
    private static final String GANHOU = "Ganhou";
    private static final String PERDEU = "Perdeu";
    private static final String CONTINUE = "Continue";

    public Craps() {
        dado1 = new Dado();
        dado2 = new Dado();
        status = NAO_INICIADO;
    }

    public void jogar() {
        if (status.equals(NAO_INICIADO)) {
            pontuacao = lancarDados();
            verificaPrimeiroLance();
        } else if (status.equals(CONTINUE)) {
            int somaDosPontos = lancarDados();

            if (somaDosPontos == pontuacao) {
                status = GANHOU;
            } else if (somaDosPontos == 7) {
                status = PERDEU;
            }
        }
    }

    private int lancarDados() {
        return dado1.lancar() + dado2.lancar();
    }

    private void verificaPrimeiroLance() {
        switch (pontuacao) {
            case 7:
            case 11:
                status = GANHOU;
                break;
            case 2:
            case 3:
            case 12:
                status = PERDEU;
                break;
            default:
                status = CONTINUE;
        }
    }

    private void verificaApartirDoSegundoLance()


    public String getStatus() {
        return status;
    }

    public int getProntuacao() {
        return pontuacao;
    }

    public int getFaceVoltadaParaCimaDadoUm() {
        return dado1.getFaceVoltadaParaCIma();
    }

    public int getFaceVoltadaParaCimaDadoDois() {
        return dado2.getFaceVoltadaParaCIma();
    }

    public int getPontuacaoDoUltimoLance() {
        return dado1.getFaceVoltadaParaCIma() + dado2.getFaceVoltadaParaCIma();
    }
}
