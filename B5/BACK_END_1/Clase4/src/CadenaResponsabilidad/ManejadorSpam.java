package CadenaResponsabilidad;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarEmail(Mail email) {
        return "marcado como span";
    }
}
