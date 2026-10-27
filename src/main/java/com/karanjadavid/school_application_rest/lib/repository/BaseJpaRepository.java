package com.karanjadavid.school_application_rest.lib.repository;

import com.karanjadavid.school_application_rest.lib.entity.BaseJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseJpaRepository<T extends BaseJpaEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

}
