//thomas sá capucho

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {

    private ArrayList<Contato> contatos;
    private ArrayList<Contato> telefone;

    public Agenda() {
        contatos = new ArrayList<>();
        telefone = new ArrayList<>();

    }

    public boolean adicionaContato(Contato contato) {
        if (contato.eValido()) {
            contatos.add(contato);
            return true;
        }
        return false;
        //if (telefone.eValidoOFormatoDo()){
         //   contato.add(telefone);
          //  return true;
       // }
        //return false;
    }


    public boolean registraTelefone(Contato telefone) {
        if (telefone.eValidoOFormatoDo(telefone)) {
            contatos.add(telefone);
            return true;
        }
        return false;
    }

    public List<Contato> getContatos() {
        return Collections.unmodifiableList(contatos);
    }

    public Contato getContato(int indice) {
        return contatos.get(indice);
    }

    public int getQuantidadeDeContatos() {
        return contatos.size();
    }

    public Contato remover(int indice) {
        Contato contatoRemovido = contatos.remove(indice);
        return contatoRemovido;
    }

    public ArrayList<Contato> pesquisar(String palavraChave) {
        ArrayList<Contato> contatosEncontradas = new ArrayList<>();

        palavraChave = palavraChave.toLowerCase();

        for (Contato contato : contatos) {
            String nome = contato.getNome().toLowerCase();
            String sobrenome = contato.getSobrenome().toLowerCase();

            if (nome.contains(palavraChave) || sobrenome.contains(palavraChave)) {
                contatosEncontradas.add(contato);
            }
        }

        return contatosEncontradas;
    }
}