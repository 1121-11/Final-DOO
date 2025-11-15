package co.edu.uco.com.banco.model;

public class cliente {
	private String id;
	private boolean cuentaActiva;
	private double limiteMaximo;
	
	public cliente(String id, boolean cuentaActiva, double limiteMAaximo, double limiteMaximo) {
		this.id = id;
		this.cuentaActiva = cuentaActiva;
		this.limiteMaximo = limiteMaximo;
	}

}
