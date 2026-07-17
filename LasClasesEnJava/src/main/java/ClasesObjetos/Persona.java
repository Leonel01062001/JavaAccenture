package ClasesObjetos;

public class Persona {
    private  String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private int edad;

    public Persona(){

    }

    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.primerApellido = persona.primerApellido;
        this.segundoApellido = persona.segundoApellido;
        this.dni = persona.dni;
        this.edad = persona.edad;
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String dni, int edad){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
