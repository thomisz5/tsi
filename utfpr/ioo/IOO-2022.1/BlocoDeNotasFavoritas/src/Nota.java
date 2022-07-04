public class Nota {
    private String titulo;
    private String texto;
    private boolean favorito;

    public Nota() {
        this("", "", false);
    }

    public Nota(String titulo, String texto, boolean favorito) {
        this.titulo = titulo;
        this.texto = texto;
        this.favorito = favorito;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public boolean eFavorito() {
        return favorito;
    }
}