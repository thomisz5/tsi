
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Tarefa {
    private int id;
    private static int incrementadorDeId;

    private String titulo;
    private String descricao;
    private boolean concluida;
    private DateTimeFormatter diaHora;



    private ArrayList<String> erros;

    public Tarefa() {
        this("", "");
    }
     public Tarefa(String titulo, String descricao, DateTimeFormatter dataHora) {
        erros = new ArrayList<>();
        id = ++incrementadorDeId;

        setTitulo(titulo);
        setDescricao(descricao);
        setDiaHora(diaHora);
    }

    public Tarefa(String titulo, String descricao) {
        erros = new ArrayList<>();
        id = ++incrementadorDeId;

        setTitulo(titulo);
        setDescricao(descricao);
    }

    public int getId() {
        return id;
    }

    public String getTarefaCompleta() {
        return titulo + " " + descricao + diaHora.format(LocalDate.now());
    }

    public boolean eValido() {
        erros.clear();

        if (titulo.isEmpty())
            erros.add("Nome não pode ser vazio.");

        if (descricao.isEmpty())
            erros.add("Sobrenome não pode ser vazio.");

        return erros.isEmpty();
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        concluida = true;
    }

    public void desmarcarComoConcluida() {
        concluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.trim();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim();
    }
    public List<String> getErros() {
        return erros;
    }

    public DateTimeFormatter getDiaHora() {
        return diaHora;
    }

    public void setDiaHora(DateTimeFormatter diaHora) {
        this.diaHora = DateTimeFormatter.ofPattern("dd/MM/aaaa HH:mm:ss");
    }
}