package com.karanjadavid.school_application_rest.learningspace.entity;

import com.karanjadavid.school_application_rest.lib.entity.BaseJpaEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LearningSpace extends BaseJpaEntity {

    private String name;

}
