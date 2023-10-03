package com.progVideosSQ.videos.services;

import com.progVideosSQ.videos.entities.Libro;
import com.progVideosSQ.videos.repositories.BaseRepository;
import com.progVideosSQ.videos.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements  LibroService{
    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
