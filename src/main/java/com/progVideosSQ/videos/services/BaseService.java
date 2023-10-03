package com.progVideosSQ.videos.services;

import com.progVideosSQ.videos.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable>{//esto se implementa dentro de servicio persona
    public List<E> findAll() throws Exception;//lista de todas las entidades

    public E findById(ID id)throws Exception;//devuelve una entidad de acuerdo a id

    public E save(E entity) throws Exception;//crea una nueva entidad

    public E update(ID id, E entity) throws Exception;//actualiza una entidad

    public boolean delete(ID id) throws Exception;//elimina un registro de la db
}
