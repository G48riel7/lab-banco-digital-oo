
public class Main {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		
		Conta cc = new ContaCorrente(gabriel);
		Conta poupanca = new ContaPoupanca(gabriel);

		cc.depositar(10000);
		cc.transferir(10000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
