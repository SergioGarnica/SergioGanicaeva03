package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {
private String tipoDeBicicleta;
	public Ciclista(int id, String nombre, String tipoDeBicicleta) {
		super(id,nombre);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}
	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}
	public void setTipoDeBicicleta(String tipoBicicleta) {
		this.tipoDeBicicleta = tipoBicicleta;
	}
	public Integer getNumeroDeSocio() {
		return this.getId();
	}
	

}
