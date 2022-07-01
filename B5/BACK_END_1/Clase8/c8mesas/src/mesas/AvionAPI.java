package mesas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AvionAPI {

	private List<Vuelo> vuelos;

	public AvionAPI(){
		//aqui vamos a crear los vuelos para el mes de mayo del 2022
		//entre Salta y Buenos Aires
		vuelos=new ArrayList<>();
		for (int i = 1; i <=31 ; i++) {
			vuelos.add(new Vuelo(LocalDate.of(2022,5,i),"Salta","Buenos Aires"));
			vuelos.add(new Vuelo(LocalDate.of(2022,5,i),"Buenos Aires","Salta"));
		}
	}
	//   Busca vuelos de acuerdo a alguna manera ya programada
	public String buscarVuelo(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino) {
		String respuesta="==============================\n";
		respuesta=respuesta+"Vuelos encontrados de " + origen + " a " + destino+"\n";
		for (Vuelo vuelo:vuelos) {
			if (vuelo.getFecha().isEqual(fechaIda)&&vuelo.getOrigen().equals(origen)
			&&vuelo.getDestino().equals(destino)){
				respuesta=respuesta+vuelo+"\n";
			}
		}
		respuesta=respuesta+"==============================\n";
		respuesta=respuesta+"Vuelos encontrados de " + destino + " a " + origen+"\n";
		for (Vuelo vuelo:vuelos) {
			if (vuelo.getFecha().isEqual(fechaVuelta)&&vuelo.getOrigen().equals(destino)
					&&vuelo.getDestino().equals(origen)){
				respuesta=respuesta+vuelo+"\n";
			}
		}
		return respuesta;
	}


}
