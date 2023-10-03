package com.progVideosSQ.videos.controllers;

import com.progVideosSQ.videos.entities.Base;
import com.progVideosSQ.videos.entities.Persona;
import com.progVideosSQ.videos.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E,Long>> implements BaseController<E, Long> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")//esto deja usar el autowired
    @Autowired
    protected S servicio;


    @GetMapping("")
    public ResponseEntity<?> getAll(){//nos brinda la respuesta en formato json para la app
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
            //si se encuentra se va a devolver la lista de personas y status ok
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){//la variable path es una que esta dentro del path o URL por lo cual se accede al recurso
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
            //si se encuentra se va a devolver una persona
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        //se utiliza RequestBody para declara que esta dentro del body del request
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity ){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }
}
