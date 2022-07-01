package Presencial;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;


    public boolean esMayorEdad(){
        // return this.edad
        return edad >=18;
    }

    public boolean siNombreMayorIgual5Lrtras(){
        return cantidadLetrasNombre()>=5;
    }
    private int cantidadLetrasNombre(){
        return nombre.length();
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
