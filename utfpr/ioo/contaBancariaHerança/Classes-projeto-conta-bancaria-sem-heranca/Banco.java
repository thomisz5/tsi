import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	private static int numeroSequencial = 1;
	
    private ArrayList<Conta> contas;//tornamo as coleçoes das superconta somente
    //private ArrayList<ContaPoupanca> contasPoupanca;

    public Banco() {
    	contas = new ArrayList<>();
    }

    public void registrarContaCorrente(Cliente cliente) {
        contas.add(new ContaCorrente(cliente, numeroSequencial++));//add o contas(novo) mas passa ainda a conta corrente de instancia
    }
    
    public void registrarContaPoupanca(Cliente cliente) {
    	contas.add(new ContaPoupanca(cliente, numeroSequencial++));//contaPoup tbm é do tipo conta
    }

    public void processarContas() {
        for(Conta conta: contas){//percorrimento CAST,//pode referenciar tanto a conta corrente quanto a poupança
            conta.processar();

           /* if(conta instanceof ContaCorrente){
                ContaCorrente cc=(ContaCorrente)conta;
                cc.cobrarTaxaAdministrativa();
            }else {
                ContaPoupanca cp=(ContaPoupanca)conta;
                cp.pagarJuros();
            }*/
        }
        /*for (ContaCorrente contaCorrente : contasCorrente) {
        	contaCorrente.cobrarTaxaAdministrativa();
		}

        for (ContaPoupanca contaPoupanca : contasPoupanca) {
			contaPoupanca.pagarJuros();
		}*/
    }//criação dos gets
    public List<Conta> getContas(){
        return Collections.unmodifiableList(contas);
    }

    /*public List<ContaCorrente> getContasCorrente() {
    	return Collections.unmodifiableList(contasCorrente);
    }
    
    public List<ContaPoupanca> getContasPoupanca() {
    	return Collections.unmodifiableList(contasPoupanca);
    }*/

    public Conta getConta(int numero){
        for (Conta conta:contas){
            if(conta.getNumero()==numero)
                return conta;
        }
        return null;
    }
    /*public ContaCorrente getContaCorrente(int numero) {
    	for (ContaCorrente contaCorrente : contasCorrente) {
			if (contaCorrente.getNumero() == numero)
				return contaCorrente;
		}
    	return null;
    }

    public ContaPoupanca getContaPoupanca(int numero) {
    	for (ContaPoupanca contaPoupanca : contasPoupanca) {
			if (contaPoupanca.getNumero() == numero)
				return contaPoupanca;
		}
    	return null;
    }*/
}
