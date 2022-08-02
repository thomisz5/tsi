import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BancoDeDados {

    private File arquivo;
    private static final String NOME_DO_ARQUIVO = "agenda.txt";
    private static final String DIVISOR = "¡";

    public BancoDeDados() {
        arquivo = new File(NOME_DO_ARQUIVO);
        crieOArquivoSeNãoExistir();
    }

    public void salvar(Contato contato) {
        try {
            FileWriter escritor = new FileWriter(arquivo, true);
            String linha = contato.getNome() + DIVISOR + contato.getSobrenome() + DIVISOR + contato.getFavorito();
            escritor.write(linha + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void salvar(ArrayList<Contato> contatos) {
        try {
            FileWriter escritor = new FileWriter(arquivo);

            for(Contato contato : contatos) {
                String linha = contato.getNome() + DIVISOR + contato.getSobrenome() + DIVISOR + contato.getFavorito();
                escritor.write(linha + "\n");
            }

            escritor.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Contato> getContatos(boolean fav) {
        ArrayList<Contato> contatos = new ArrayList<>();

        try {
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            String linha = buffer.readLine();

            while(linha != null) {
                String[] dados = linha.split(DIVISOR);
                String nome = dados[0];
                String sobrenome = dados[1];
                String favorito = dados[2];

                if(fav) {
                    boolean isFavorito = favorito.toUpperCase().equals("SIM") || favorito.toUpperCase().equals("S");

                    if(isFavorito) {
                        contatos.add(new Contato(nome, sobrenome, favorito));
                    }
                }
                else {
                    contatos.add(new Contato(nome, sobrenome, favorito));
                }

                linha = buffer.readLine();
            }

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return contatos;
    }

    private void crieOArquivoSeNãoExistir() {
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}