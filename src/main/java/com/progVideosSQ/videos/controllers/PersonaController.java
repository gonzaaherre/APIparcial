package com.progVideosSQ.videos.controllers;

import com.progVideosSQ.videos.entities.Persona;
import com.progVideosSQ.videos.services.PersonaService;
import com.progVideosSQ.videos.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")//brindar o permitir el acceso desde distintos origenes o clientes
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {



}
