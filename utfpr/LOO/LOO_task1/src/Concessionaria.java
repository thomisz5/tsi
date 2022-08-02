//arrumar a vizualização final
import java.util.ArrayList;

public class Concessionaria {


    ArrayList<Carro> carros = new ArrayList<>();

    public void novoCarro(Carro carro){
        carros.add(carro);
    }

    public void listaCarros(){
        for (int i =0;i<carros.size();i++){
            System.out.println(carros.get(i).getSpecs());
        }
    }
}
