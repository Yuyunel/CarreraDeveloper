package mesas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CheckFacadeTest {
    @Test
    public void busqueda20MayoAl25MayoTest() {

        // crea el cliente del facade
        CheckFacade facade = new CheckFacade();
        // pide una busqueda
        LocalDate fechaIda = LocalDate.of(2022, 05, 20);
        LocalDate fechaVuelta = LocalDate.of(2022, 05, 25);
        String origen = "Salta";
        String destino = "Buenos Aires";
        String busqueda = facade.buscar(fechaIda, fechaVuelta, origen, destino);
        System.out.println(busqueda);
        assertTrue(!busqueda.isEmpty());
    }

}