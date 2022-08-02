import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    /**************************************************************
     * Métodos que consideram todos contatos
     **************************************************************/
    public boolean adicionaContato(Contato contato) {
        if (contato.eValido()) {
            contatos.add(contato);
            return true;
        }
        return false;
    }

    public List<Contato> getTodosContatos() {
        return Collections.unmodifiableList(contatos);
    }

    public Contato getContatoPeloId(int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id)
                return contato;
        }

        return null;
    }

    /**************************************************************
     * Métodos que desconsideram os contatos secretos
     **************************************************************/
    public List<Contato> getContatos() {
        ArrayList<Contato> contatosPublicos = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.isSecreto())
                contatosPublicos.add(contato);
        }
        return contatos;
    }

    public ArrayList<Contato> pesquisar(String palavraChave) {
        ArrayList<Contato> contatosEncontradas = new ArrayList<>();

        palavraChave = palavraChave.toLowerCase();

        for (Contato contato : getContatos()) {
            String id = contato.getId() + "";
            String nome = contato.getNome().toLowerCase();
            String sobrenome = contato.getSobrenome().toLowerCase();

            if (id.equals(palavraChave) ||
                    nome.contains(palavraChave) ||
                    sobrenome.contains(palavraChave)
            ) {
                contatosEncontradas.add(contato);
            }
        }

        return contatosEncontradas;
    }
}