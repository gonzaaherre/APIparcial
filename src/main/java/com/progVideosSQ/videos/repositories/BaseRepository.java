package com.progVideosSQ.videos.repositories;

import com.progVideosSQ.videos.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import java.io.Serializable;

@NoRepositoryBean//para que no se cree una instancia
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E,ID>{

}
