import java.util.Random;

public class Dado {
    private int faceVoltadaParaCima =1;

    public int lancar() {
        Random r = new Random();
        faceVoltadaParaCima = 1 + r.nextInt(6);//limite(5) + 1 = seis lados
        return faceVoltadaParaCima;
    }

    public int getFaceVoltadaParaCIma() {
        return faceVoltadaParaCima;
    }
}
