package com.example.jpaDemo.controller;

import com.example.jpaDemo.model.Persona;
import com.example.jpaDemo.model.Response;
import com.example.jpaDemo.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersons() {
        return interPersona.getPersonas();
    }
    
    @GetMapping ("/personas/traer/{id}")
    public Persona getPerson(@PathVariable Long id) {
        return interPersona.findPersona(id);
    }

    @PostMapping ("/personas/crear")
    public Response createPerson(@RequestBody Persona Perso) {
        interPersona.savePersona(Perso);
        
        Response resp = new Response("200", "Persona creada correctamente");
        
        return resp;
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public Response deletePerson(@PathVariable Long id) {
        interPersona.deletePersona(id);
        
        Response resp = new Response("200", "Persona eliminada correctamente");
        
        return resp;
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editPerson(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("edad") int nuevaEdad ) {
        
        // Busco la persona en cuestion.
        Persona perso = interPersona.findPersona(id);
        
        // Esto tambien puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo.
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);
        
        interPersona.savePersona(perso);
        
        // Retorna la nueva persona.
        return perso;
    }
}
