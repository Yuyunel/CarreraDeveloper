package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    public void descargarOK(){
        Usuario usuario = new Usuario(1,"Pepe","Premium");
        Spotify spotify = new SpotifyProxy();
        String respuestaEsperada = "Su usuario es Premium. Procedemos con la descarga.";
        String respuestaActual = spotify.descargar(usuario);
        assertEquals(respuestaEsperada,respuestaActual);
    }
    @Test
    public void descargarNoOK(){
        Usuario usuario = new Usuario(1,"Luli","Free");
        Spotify spotify = new SpotifyProxy();
        String respuestaEsperada= "Debe ser usuario premium para descargar";
        String respuestaActual= spotify.descargar(usuario);
        assertEquals(respuestaEsperada,respuestaActual);
    }
}