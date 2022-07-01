package mesas;

public class Usuario {
    private int identificador;
    private String nombre;
    private String tipoDeUsuario;

    public Usuario(int identificador, String nombre, String tipoDeUsuario) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
