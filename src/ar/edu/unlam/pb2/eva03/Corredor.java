package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
private Integer kilometroRecorrido;
private Integer kilometrosEntrenados;

	public Corredor(int id, String nombre, int kmRecorridos) {
	
		super(id, nombre);
		this.kilometroRecorrido=kmRecorridos;
	}

	public Integer getKilometroRecorrido() {
		return kilometroRecorrido;
	}

	public void setKilometroRecorrido(Integer kilometroRecorrido) {
		this.kilometroRecorrido = kilometroRecorrido;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return this.getKilometroRecorrido();
	}

	public Integer getNumeroDeSocio() {
		return this.getId();
	}
	

}
