import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaDeTarefas {

    private ArrayList<Tarefa> tarefas;

    public SistemaDeTarefas() {
        tarefas= new ArrayList<>();
    }

    public boolean adicionaTarefa(Tarefa tarefa) {
        if (tarefa.eValido()) {
            tarefas.add(tarefa);
            return true;
        }
        return false;
    }

    public List<Tarefa> getTodasTarefas() {
        return Collections.unmodifiableList(tarefas);
    }

    public Tarefa getTarefaPeloID(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id)
                return tarefa;
        }

        return null;
    }

    public List<Tarefa> getTarefas() {
        ArrayList<Tarefa> todasTarefas = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida())
                todasTarefas.add(tarefa);
        }
        return tarefas;
    }

    /*public ArrayList<Contato> pesquisar(String palavraChave) {
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
    }*/
}