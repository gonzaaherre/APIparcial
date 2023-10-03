package com.progVideosSQ.videos.controllers;

import com.progVideosSQ.videos.entities.Domicilio;
import com.progVideosSQ.videos.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")//brindar o permitir el acceso desde distintos origenes o clientes
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioControllers extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
