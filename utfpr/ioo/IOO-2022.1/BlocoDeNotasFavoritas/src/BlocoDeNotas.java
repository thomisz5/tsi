import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<Nota> notas;
    private ArrayList<Nota> favoritas;

    public BlocoDeNotas() {
        notas = new ArrayList<>();
        favoritas = new ArrayList<>();
    }

    public boolean adicionaNota(Nota nota) {
        return notas.add(nota);
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public int getQuantidadeDeNotas() {
        return notas.size();
    }

    public ArrayList<Nota> notasFavoritas() {
        ArrayList<Nota> favoritas = new ArrayList<>();

        for (Nota nota : notas) {
            if(nota.eFavorito() == true)
                favoritas.add(nota);
        }
        return favoritas;
    }
}