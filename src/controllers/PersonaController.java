package controllers;

import models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int index =i;
            for (int j = 0; j < personas.length; j++) {
            if (personas[j].equalsByCodigoDireccion(personas[index])) {
                        index = j;
                }
                if(index!=i){
                    Persona temp = personas[index];
                    personas[index] = personas[i];
                    personas[i] = temp;
                }
                   
            }
        }
       
    
    
    }

    public Persona findByCodigoDireccion(int codigo personas) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            if (personas[medio].getCodigoDireccion() == codigo) {
                return personas[medio];
            } else if (personas[medio].getCodigoDireccion() < codigo) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
            
        }
        

    }

    
}
    

