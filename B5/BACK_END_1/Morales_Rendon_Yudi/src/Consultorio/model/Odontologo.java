package Consultorio.model;

public class Odontologo {
    private int id;
    private int Matrícula;
    private String nombre;
    private String apellido;

    public Odontologo(int id, int Matrícula, String nombre, String apellido) {
        this.id=id;
        this.Matrícula = Matrícula;
        this.nombre = nombre;
        this.apellido = apellido;


    }

    public Odontologo(int matrícula, String nombre, String apellido) {
        Matrícula = matrícula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatrícula() {
        return Matrícula;
    }

    public void setMatrícula(int Matrícula) {
        this.Matrícula = Matrícula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
