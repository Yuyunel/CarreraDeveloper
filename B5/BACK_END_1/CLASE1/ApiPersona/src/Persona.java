public class Persona {
    private String nombre;
    private  String apellido;
    private  String Email;
    private int edad;

    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        Email = email;
        this.edad = edad;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean nombreCompleto(String apellido, String nombre){
        this.apellido = apellido;
        this.nombre = nombre;
       // Scanner teclado = new Scanner(System.in);
       // System.out.println("ingrese su nombre: ");
       // nombre=teclado.nextLine();

        //System.out.println("ingrese su Apellido");
       // apellido=teclado.nextLine();
        return true;
    }
    public boolean esMayorEdad (){
        return this.edad > 18;
    }
}
