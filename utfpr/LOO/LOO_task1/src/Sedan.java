public class Sedan extends Carro{

    @Override
    public String getModelo() {
        return "Sedan Cruze";
    }

    @Override
    public double getMotor() {
        return 1.6;
    }

    @Override
    public double getPreco() {
        return 60.000;
    }

    @Override
    public int getAno() {
        return 2018;
    }

    @Override
    public String getCor() {
        return "preto";
    }
}
