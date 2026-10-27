package com.karanjadavid.school_application_rest.lib.service;

import com.karanjadavid.school_application_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.school_application_rest.lib.repository.BaseJpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public abstract class BaseJpaEditService<T extends BaseJpaEntity, R extends BaseJpaRepository<T>> extends BaseJpaReadService<T, R>{

    public T save(T model, String updatedBy){
        model.setCreatedAt(LocalDateTime.now());
        model.setCreatedByEntityId(updatedBy);
        model.setUpdatedAt(LocalDateTime.now());
        model.setUpdatedByEntityId(updatedBy);
        return repository.save(model);
    }

    public List<T> save(List<T> models, String updatedBy){
        for(var model: models){
            model.setCreatedAt(LocalDateTime.now());
            model.setCreatedByEntityId(updatedBy);
            model.setUpdatedAt(LocalDateTime.now());
            model.setUpdatedByEntityId(updatedBy);
        }
        return repository.saveAll(models);
    }

    public void delete(String entityId, String updatedBy){
        var entity = findByEntityId(entityId);
        entity.setDeletedAt(LocalDateTime.now());
        entity.setDeletedByEntityId(updatedBy);
    }

}
