package mesas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelAPI  {
	private List<Hotel> hoteles;

	public HotelAPI(){
		hoteles=new ArrayList<>();
		//dada la complejidad vamos a agregar un hotel con fecha de entrada y salida
		// para nuestro test
		hoteles.add(new Hotel(LocalDate.of(2022,05,20),LocalDate.of(2022,05,25),"Buenos Aires"));
	}

	//   Busca hoteles de acuerdo a alguna manera ya programada
	public String buscarHotel(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad) {
		String respuesta="==============================\n";
		respuesta=respuesta+"Hoteles encontrados en "+ ciudad+"\n";
		for (Hotel hotel:hoteles) {
			if (hotel.getFechaEntrada().isEqual(fechaEntrada)
			&&hotel.getFechaSalida().isEqual(fechaSalida)
			&&hotel.getLugar().equals(ciudad)){
				respuesta=respuesta+hotel+"\n";
			}
		}
		return respuesta;
	}
}
