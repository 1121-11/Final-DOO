package co.edu.uco.com.banco.service;

import co.edu.uco.com.banco.model.cliente;
import co.edu.uco.com.banco.model.cuenta;

public class TransferenciaService {
	public void trasferir(cuenta origen, cuenta destino, double monto) throws Exception {
		validarTransferencia(origen, destino, monto);
		origen.setsaldo(origen.getsaldo() - monto);
		destino.setsaldo(destino.getsaldo() + monto);
	}
	
	private void validarTransferencia(cuenta origen, cuenta destino, double monto) throws Exception {
		if (origen == null || destino == null) throw new Exception ("Las cuentas deben de existir. ");
		if (!origen.getPropietario().iscuentaActiva()) throw new Exception ("El cliente de origen debe tener activa la cuenta. ");
		if (monto > origen.getsaldo()) throw new Exception ("Fondos insuficientes. ");
		if (monto > origen.getpropietario().getlimitemaximo()) throw new Exception ("Monto excede el limite del cliente. ")
		if (!destino.getPropietario().iscuentaActiva()) throw new Exception ("El cliente de destino debe tener activa la cuenta. ");
	}
	
}
