package entidade;

/**
 * @author Mikael C. Barros
 *
 */
public class Poupanca extends Conta {
	
	private double juros;

	public Poupanca(String numero, Banco banco, Cliente cliente, double saldo) {
		super(numero, banco, cliente, saldo);
		this.juros = 0;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void render() {
		double novo = super.getSaldo() + super.getSaldo()/45;
		super.setSaldo(novo);	
	}
	
}
