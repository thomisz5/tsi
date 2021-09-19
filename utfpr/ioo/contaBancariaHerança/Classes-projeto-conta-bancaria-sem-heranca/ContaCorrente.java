public class ContaCorrente extends Conta{//usando a classe geral como base, puxando metodos e atributos

    private double taxaAdministrativa = 5;
    
    public ContaCorrente(Cliente cliente, int numero) {
    	super(cliente, numero);//puxando o construtor da SuperClasse
    }
public void processar(){ //o método que ta deixando paia, vira o abstract
        sacar(taxaAdministrativa);
}
    public String getTipo(){
        return "CC";
    }
/*
    public void cobrarTaxaAdministrativa() {
    	sacar(taxaAdministrativa);
    }
    */
}
