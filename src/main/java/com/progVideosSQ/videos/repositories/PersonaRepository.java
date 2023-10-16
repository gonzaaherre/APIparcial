package com.progVideosSQ.videos.repositories;

import com.progVideosSQ.videos.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {//esto se comunica con la db


    //metodo query

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //si existe una persona
    boolean existsById(int dni);


    //jpql parametros indexados
    //en el like se pone un parametro indexado LIKE '%?1%'" en el signo de pregunta va el dato, y el
    //1 es la cantidad de parametros que hay
    //@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    //List<Persona> search(@Param("filtro")String filtro);


    //jpql parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    List<Persona> search(@Param("filtro")String filtro);


    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    Page<Persona> search(@Param("filtro")String filtro, Pageable pageable);



    //anotacion query nativo
    @Query(
            value = "SELECT * FROM Persona WHERE Persona.nombre LIKE '%:filtro%' OR Persona.apellido LIKE '%:filtro%'",
            nativeQuery = true
    )
    List<Persona> serachNativo(@Param("filtro")String filtro);


    @Query(
            value = "SELECT * FROM Persona WHERE Persona.nombre LIKE '%:filtro%' OR Persona.apellido LIKE '%:filtro%'",
            countQuery = "SELECT count (*) FROM PERSONA",
            nativeQuery = true
    )
    Page<Persona> serachNativo(@Param("filtro")String filtro, Pageable pageable);
}
