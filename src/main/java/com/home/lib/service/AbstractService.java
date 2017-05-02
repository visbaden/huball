package com.home.lib.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public abstract class AbstractService<T, PK extends Serializable> {

    private CrudRepository<T, PK> repository;

    public AbstractService(CrudRepository<T, PK> repository) {
        this.repository = repository;
    }

    public T create(T entity){
        return repository.save(entity);
    }

    public T get(PK id){
        return repository.findOne(id);
    }

    public void delete(PK id){
        repository.delete(id);
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public List<T> getAll (){
        List<T> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }
}
