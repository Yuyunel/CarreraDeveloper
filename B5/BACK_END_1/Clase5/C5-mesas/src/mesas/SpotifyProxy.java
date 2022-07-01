package mesas;

public class SpotifyProxy implements Spotify{
    private SpotifyService spotifyReal;

    @Override
    public String descargar(Usuario usuario) {
        String mensaje= "Debe ser usuario premium para descargar";
        if(usuario.getTipoDeUsuario().equals("Premium")){
            spotifyReal = new SpotifyService();
            mensaje=spotifyReal.descargar(usuario);
        }
        return mensaje;
    }
}
