//thomas sá capucho
public class Automovel extends Veiculo {

	private double tarifa = 23.30;
	
	public Automovel(String placa,String hora,String data) {
		super(placa, 2,hora,data);
	}



	@Override
	public double getTarifa() {
		return tarifa;
	}

	@Override
	public String getTipo() {
		return "Automóvel";
	}
	
	@Override
	public String getTipoDeTarifa() {
		return "Fixa";
	}
}
