package entidade;

/**
 * @author Mikael C. Barros
 *
 */
public class Banco {
	
	private String numeroAgencia;
	private String nomeAgencia;
	
	public Banco(String numeroAgencia, String nomeAgencia) {
		this.numeroAgencia = numeroAgencia;
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	
	

}
