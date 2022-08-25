
package com.portfolio.JorgeF.Interface;

import com.portfolio.JorgeF.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   //Traer una lista de persona

    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos poor id
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}
