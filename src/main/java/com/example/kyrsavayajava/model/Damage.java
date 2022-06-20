package com.example.kyrsavayajava.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="damages")
public class Damage {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="damage_category")
    private String category;
    @OneToMany(mappedBy = "damage")
    private List<DamageSubCategory> subCategories;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<DamageSubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<DamageSubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Damage)) return false;
        Damage damage = (Damage) o;
        return Objects.equals(category, damage.category) && Objects.equals(subCategories, damage.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, subCategories);
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
