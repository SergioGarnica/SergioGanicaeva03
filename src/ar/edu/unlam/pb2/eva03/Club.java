package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios= new HashSet<Deportista>() ;
	private Map<String, Evento> competencias = new HashMap<String, Evento>();
	
	public Club(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String nombre) {
		competencias.put(nombre,new Evento(carreraNatacionEnAguasAbiertas));
	}

	public Integer inscribirEnEvento(String nombre, Deportista deportista) throws NoEstaPreparado {
		for(Entry<String, Evento> evento : this.competencias.entrySet()) {
			if(evento.equals(nombre)) {
				socios.add(deportista);
			}
			else {
				throw new NoEstaPreparado();
			}
		}
		return 1;
	}
		
	
}
