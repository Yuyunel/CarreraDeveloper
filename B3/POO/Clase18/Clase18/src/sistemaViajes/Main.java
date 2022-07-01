package sistemaViajes;

public class Main {
    public static void main(String[] args) {
        // instancias
        SistemaReservas miSistema = new SistemaReservas();
        miSistema.getReservas().add(new Reserva(23333, 4, new Recorrido("Buenos Aires", "Bragado")));
        miSistema.getReservas().add(new Reserva(67777, 7, new Recorrido("Buenos Aires", "Luján")));

        // probando recaudaciónTotal()
        System.out.println("Recaudación total: " + miSistema.recaudacionTotal());

        // probando cantVecesRecorridas()
        try{
            System.out.println("Cantidad de personas que pasaron por la estación: " + miSistema.cantVecesRecorridas("Retiro"));
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }

        // probando si aplica descuento en la reserva
        System.out.println("Precio de viaje de cabecera a cabecera: " + miSistema.getReservas().get(0).precioReserva());
    }
}
