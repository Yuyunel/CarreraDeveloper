package mesas;

import java.time.LocalDate;

public interface IBusqueda {
  String buscar(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino);
}
