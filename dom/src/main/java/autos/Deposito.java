package autos;

import java.io.Serializable;

import org.apache.isis.applib.annotation.Value;

@Value(semanticsProviderName="DepositoProveedorValueType.class")

public class Deposito implements Serializable {

	private static final long serialVersionUID = 1L;

	public Deposito(final String nombre){
		
		this.nombre=nombre;
	}
	
	private final String nombre;
	
	public String getNombre(){
		
		return nombre;
	}
	
}
