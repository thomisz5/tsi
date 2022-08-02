import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;
    private ArrayList<Contato> contatosFav;
    private BancoDeDados bd;

    public Agenda() {
        bd = new BancoDeDados();
        contatos = bd.getContatos(false);
        contatosFav = bd.getContatos(true);
    }

    public boolean adicionaContato(Contato contato, String fav) {
        if(contato.eValido()){
            boolean isFavorito = fav.toUpperCase().equals("SIM") || fav.toUpperCase().equals("S");
            if(isFavorito) contatosFav.add(contato);

            contatos.add(contato);
            bd.salvar(contato);
            return true;
        }
        return false;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public ArrayList<Contato> getContatosFav() {
        return contatosFav;
    }

    public Contato getContato(int indice) {
        return contatos.get(indice);
    }

    public int getQuantidadeDeContatos() {
        return contatos.size();
    }

    public Contato remover(int indice) {
        Contato contatoRemovido = contatos.remove(indice);
        bd.salvar(contatos);
        return contatoRemovido;
    }

    public ArrayList<Contato> pesquisar(String palavraChave) {
        ArrayList<Contato> contatosEncontradas = new ArrayList<>();

        palavraChave = palavraChave.toLowerCase();

        for(Contato contato : contatos) {
            String nome = contato.getNome().toLowerCase();
            String sobrenome = contato.getSobrenome().toLowerCase();

            if (nome.contains(palavraChave) || sobrenome.contains(palavraChave)) {
                contatosEncontradas.add(contato);
            }
        }

        return contatosEncontradas;
    }
}