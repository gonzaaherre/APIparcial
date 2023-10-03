package com.progVideosSQ.videos.repositories;

import com.progVideosSQ.videos.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {//esto se comunica con la db




}
