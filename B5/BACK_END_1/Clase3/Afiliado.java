package inicial;

public class Afiliado extends Vendedor {

    public Afiliado(String nombre){
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 15;
    }

    @Override
    public int calcularPuntos() {
        //Desarrollar
        return 0;
    }
}
