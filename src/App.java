import models.Persona;
import models.Direccion;
import controllers.PersonaController;
import views.ViewConsole;

public class App {

    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 89));

        ViewConsole cV = new ViewConsole();
        cV.printArray(personas);

        PersonaController pC = new PersonaController();
        pC.sortByDireccionCodigo(personas);
        cV.printArray(personas);

        Persona personaB = pC.findByCodigoDireccion(89);
        if (personaB == null) {
            System.out.println("NO HAY");
        } else {
            System.out.println("Persona encontrada: " + personaB);
        }
    }
}
