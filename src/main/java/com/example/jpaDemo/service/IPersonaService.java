package com.example.jpaDemo.service;

import com.example.jpaDemo.model.Persona;
import java.util.List;

public interface IPersonaService {
    // Metodo para traer todas las personas.
    public List<Persona> getPersonas();
    
    // Metodo para dar de alta una persona.
    public void savePersona(Persona perso);
    
    // Metodo para borrar una persona.
    public void deletePersona(Long id);
    
    // Metodo para encontrar una persona.
    public Persona findPersona(Long id);
}
