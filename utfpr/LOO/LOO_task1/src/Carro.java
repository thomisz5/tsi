public class Carro {
    public String modelo;
    public double motor;
    public String cor;
    public int ano;
    public double preco;

    public String getModelo(){
        return modelo;
    }

    public double getMotor() {
        return motor;
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getSpecs() {
        return motor + ano + preco + modelo + cor;
    }
}
