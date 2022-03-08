
package ejercicio9;

/**
 *
 * @author dark_
 */
public class Main {

    public static void main(String[] args) {
          Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        perro1.setNombre("Oso");
        perro1.setRaza("Rotwilher");
        perro1.setEdad(2);
        perro1.setTamanio(3);
        perro1.setPersona(persona1);

        perro2.setNombre("Piter");
        perro2.setRaza("Terrier");
        perro2.setEdad(3);
        perro2.setTamanio(0.75);
        perro2.setPersona(persona2);

        persona1.setNombre("Juan");
        persona1.setApellido("Echagüe");
        persona1.setEdad(25);
        persona1.setDni(40152426);
        persona1.setPerro(perro1);

        persona2.setNombre("Nahuel");
        persona2.setApellido("Echagüe");
        persona2.setEdad(32);
        persona2.setDni(31556784);
        persona2.setPerro(perro2);

        persona1.visualizarPersona(persona1);
        persona2.visualizarPersona(persona2);
    }
    
}
