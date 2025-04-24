import models.Persona;
import models.Direccion;

public class App {

    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[5];
        
        personas[0] = new Persona("Juan", 25, new Direccion("Avenida 123", 1));
        personas[1] = new Persona("Maria", 30, new Direccion("Avenida 456", 2));
        personas[2] = new Persona("Pedro", 22, new Direccion("Calle 789", 3));
        personas[3] = new Persona("Ana", 28, new Direccion("Calle 101", 4));
        personas[4] = new Persona("Juan", 35, new Direccion("Avenida 202", 5));

        ConsoleView cV = new ConsoleView();
        cV.printPersonas(personas);

        PersonaController pC = new PersonaController();
        pC.sortByDireccionCodigo(personas);
        cV.printPersonas(personas);
        Persona personaB = pC.findByCodigoDireccion(89);
        if (personaB == null) {
            System.out.println("NO HAY");
        } else {
            System.out.println("Persona encontrada: " + personaB);
            
        }
    }
}
