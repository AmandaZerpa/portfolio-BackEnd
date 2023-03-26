package com.PortfolioAmandaZerpa.SpringBoot.Interface;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona por ID
    public void deletePersona(Long Id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long Id);
    
}
