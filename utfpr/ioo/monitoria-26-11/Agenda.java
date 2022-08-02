import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;
    private BancoDeDados bd;

    public Agenda() {
        bd = new BancoDeDados();        
        contatos = bd.getContatos();
    }

    public boolean adicionaContato(Contato contato) {
        if(contato.eValido()){
            contatos.add(contato);
            bd.salvar(contato);
            return true;
        }
        return false;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
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
    
    public int getQuantidadeDeContatosFavoritos(){
        int qtdFav = 0;
        
        for(Contato c : contatos){
            if(c.getFavorito() == true)
                qtdFav++;
        }
        
        return qtdFav;
    }
}
