package entidade;

/**
 * @author Mikael C. Barros
 *
 */
public class Poupanca extends Conta {
	
	private double juros = super.getSaldo()/45;

	public Poupanca(String numero, Banco banco, Cliente cliente, double saldo) {
		super(numero, banco, cliente, saldo);
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
		
	}
	
	public void render() {
		double novo = this.juros;
		super.deposito(novo);
	}
	
}
