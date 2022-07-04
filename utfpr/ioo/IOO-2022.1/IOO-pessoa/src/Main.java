public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("thomis");
        pessoa.setSobrenome("mili");

        System.out.println("nome completo : " + pessoa.getNomeCompleto());
    }

}
