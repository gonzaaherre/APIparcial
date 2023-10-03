package com.progVideosSQ.videos.controllers;

import com.progVideosSQ.videos.entities.Libro;
import com.progVideosSQ.videos.services.LibroService;
import com.progVideosSQ.videos.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}
