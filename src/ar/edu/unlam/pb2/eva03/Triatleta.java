package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista {
private String distanciaPreferida;
private TipoDeBicicleta tipoBici;
	public Triatleta(int id, String Nombre, String distanciaPreferida, TipoDeBicicleta ruta) {
		super(id, Nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoBici = ruta;
		
	}
	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}
	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoBici;
	}
	public Integer getNumeroDeSocio() {
		return this.getId();
	}
	
	

}
