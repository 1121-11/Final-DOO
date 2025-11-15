package co.edu.uco.com.banco.controller;

import co.edu.uco.com.banco.model.cuenta;
import co.edu.uco.com.banco.service.TransferenciaService;

public class TransferenciaController {
	private TransferenciaService service;
	
	public TransferenciaController() {
		service = new TransferenciaService();
	}
	public void realizarTransferencia(cuenta origen, cuenta destino, double monto) {
		try {
			service.trasferir(origen, destino, monto);
			System.out.println("transferencia existosa. ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
