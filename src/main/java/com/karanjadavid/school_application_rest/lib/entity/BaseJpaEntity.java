package com.karanjadavid.school_application_rest.lib.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class BaseJpaEntity {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, updatable = false)
    private String entityId;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(updatable = false)
    private String createdByEntityId;

    private LocalDateTime updatedAt;

    private String updatedByEntityId;

    private LocalDateTime deletedAt;

    private String deletedByEntityId;

    public BaseJpaEntity(){
        generateEntityId();
    }

    private void generateEntityId() {
        if (getEntityId() == null) {
            ObjectId generatedId = ObjectId.get();
            setEntityId(String.format("%s-%s", this.getClass().getSimpleName().toLowerCase(), generatedId.toHexString()));
        }
    }


    public boolean isDeleted(){
        return getDeletedAt() == null && getDeletedByEntityId() == null;
    }

}
