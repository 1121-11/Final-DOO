package co.edu.uco.com.banco.model;

public class cuenta {
	private String numero;
	private double saldo;
	private cliente propietario;
	
	public cuenta(String numero, double saldo, cliente propietario) {
		this.numero = numero;
		this.saldo = saldo;
		this.propietario = propietario;
	}
	
	

}
