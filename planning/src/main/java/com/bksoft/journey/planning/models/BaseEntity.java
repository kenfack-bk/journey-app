package com.bksoft.journey.planning.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version", nullable = false, columnDefinition = "int default 0")
    @Version()
    @JsonIgnore
    private Integer version;

    @JsonIgnore
    public boolean isNew() {
        return (this.id == null);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other;
        other = (BaseEntity) object;

        if ((this.getId() == null) || (other.getId() == null)) {
            return false;
        }
        return this.getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }
}

