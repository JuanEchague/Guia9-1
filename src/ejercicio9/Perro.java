package ejercicio9;

public class Perro {
////////////////////////////Atributes////////////////////////////////////////
    
    private String nombre;

    private String raza;

    private int edad;

    private double tamanio;
    
    private Persona persona; 
/////////////////////////////Constructors//////////////////////////////////////

    public Perro(String nombre, String raza, int edad, double tamanio, Persona persona) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.persona = persona;
    }

    
    public Perro() {
    }
 ////////////////////////////Getters and Setters///////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
///////////////////////////////Methods/////////////////////////////////////////
    @Override
    public String toString() {
        return  nombre + '\'' +
                ", Raza: '" + raza + '\'' +
                ", Edad: " + edad +
                ", Tamaño: " + tamanio +
                ", Dueño/a: "+ persona.getNombre()+"\n";
    }
    
}
