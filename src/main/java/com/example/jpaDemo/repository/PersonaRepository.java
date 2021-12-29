package com.example.jpaDemo.repository;

import com.example.jpaDemo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Mapeamos como repositorio
// la interface extiende de JpaRepository (que maneja repositorios JPA)
// en los parametros <> deben ir: <la clase a persistir, tipo de dato de su ID>
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
