package com.octupus.pilot.service;

import com.octupus.pilot.core.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService <T extends BaseEntity, REQ, RES, ID> implements IGenericService<REQ, RES, ID>{
    protected abstract JpaRepository<T, ID> getRepo();
    protected abstract CrudMapper<T, REQ, RES> getMapper();
    protected abstract Class<T> getEntityClass();
    protected abstract Class<RES> getResponseClass();

    public RES salvar(REQ request){
        T entity = getMapper().toEntity(request);
        return getMapper().toResponse(getRepo().save(entity));
    }
}
