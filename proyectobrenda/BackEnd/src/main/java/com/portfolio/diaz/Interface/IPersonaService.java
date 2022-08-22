
package com.portfolio.diaz.Interface;
import com.portfolio.diaz.entity.Persona;
import java.util.List;

public interface IPersonaService {
   //Traer una lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    
    public Persona FindPersona(Long id);

    public Persona findPersona(long l);
}
