package mesas;

import java.time.LocalDate;

public class CheckFacade implements IBusqueda {

	// guarda en las variables una instancia de cada otra
	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;	

	// constructor que crea las instancias
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}

	//  simplifica las busquedas de vuelo y hoteles

	@Override
	public String buscar(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino) {
		return avionAPI.buscarVuelo(fechaIda, fechaVuelta, origen, destino)+
		hotelAPI.buscarHotel(fechaIda, fechaVuelta, destino);
	}
}
