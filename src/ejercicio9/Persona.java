package ejercicio9;

public class Persona {
///////////////////////////////Atributes////////////////////////////////////
    private String nombre;

    private String apellido;

    private int edad;

    private long dni;

    private Perro perro;
/////////////////////////////////Constructors////////////////////////////////

    public Persona(String nombre, String apellido, int edad, long dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }
    
    public Persona() {
    }
/////////////////////////////////Getters and Setters////////////////////////////

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
////////////////////////////Methods//////////////////////////////////////////
     @Override
    public String toString() {
        return "Persona: " +
                "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Edad: " + edad +
                ", DNI: " + dni +
                "\nSu perro es: '" + perro;
    }

    public void visualizarPersona(Persona persona){
        System.out.println(persona);
    }

}
