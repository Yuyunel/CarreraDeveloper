package mesas;

public class SpotifyService implements Spotify{
    @Override
    public String descargar(Usuario usuario) {
        System.out.println("Recibiendo al usuario: "+ usuario.getNombre());
        System.out.println("Verificando tipo de usuario");
        return "Su usuario es "+ usuario.getTipoDeUsuario() +". Procedemos con la descarga.";
    }
}
