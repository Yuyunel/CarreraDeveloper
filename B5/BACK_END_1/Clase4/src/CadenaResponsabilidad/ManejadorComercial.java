package CadenaResponsabilidad;

public class ManejadorComercial extends  Manejador{
    @Override
    public String comprobarEmail(Mail email){
        if (email.getDestino().equals("Comercial@colmena.com")&& email.getTema().equals())
            return "Enviado a comercial";
    }else{
        return this.getSiguienteManejador().comprobarEmail(email);
    }
}
