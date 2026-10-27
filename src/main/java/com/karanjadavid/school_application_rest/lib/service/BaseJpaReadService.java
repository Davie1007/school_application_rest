package com.karanjadavid.school_application_rest.lib.service;

import com.karanjadavid.school_application_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.school_application_rest.lib.repository.BaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseJpaReadService<T extends BaseJpaEntity, R extends BaseJpaRepository<T>> {

    protected R repository;

    public T findByEntityId(String entityId){
        var optional = repository.findByEntityIdAndDeletedAtIsNull(entityId);
        return optional.get();
    }

    @Autowired
    public void setRepository(R repository){
        this.repository = repository;
    }

}
