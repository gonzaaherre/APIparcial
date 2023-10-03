package com.progVideosSQ.videos.services;

import com.progVideosSQ.videos.entities.Localidad;
import com.progVideosSQ.videos.repositories.BaseRepository;
import com.progVideosSQ.videos.repositories.LocalidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepositorio localidadRepositorio;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepositorio localidadRepositorio) {
        super(baseRepository);
        this.localidadRepositorio = localidadRepositorio;
    }
}
