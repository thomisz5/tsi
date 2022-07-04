
//thomas sá capucho
public abstract class Veiculo {

    private int numeroDeEixos;
    private String placa;
    private String data;
    private String hora;

    public Veiculo(String placa, int numeroDeEixos,String data,String hora) {
        this.placa = placa;
        this.numeroDeEixos = numeroDeEixos;
        this.data=data;
        this.hora=hora;

    }

    public String getPlaca() {
        return placa;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }
    public String getData(){
        return data;
    }

    public  String getHora(){
        return hora;
    }

    public abstract double getTarifa();

    public abstract String getTipo();

    public abstract String getTipoDeTarifa();
}