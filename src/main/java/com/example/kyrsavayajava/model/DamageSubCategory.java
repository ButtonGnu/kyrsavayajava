package com.example.kyrsavayajava.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "damage_subcategories")
public class DamageSubCategory {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "damage_subcategory_type")
    private String type;
    @JoinTable(name = "damage_subcategory_subtypes")
    private List<String> subType;
    @ManyToOne
    @JoinColumn(name = "damage_id", nullable = false)
    private Damage damage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSubType() {
        return subType;
    }

    public void setSubType(List<String> subType) {
        this.subType = subType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
