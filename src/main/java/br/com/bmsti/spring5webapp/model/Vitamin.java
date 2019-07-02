package br.com.bmsti.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author angelo santos
 * @version 1.0
 * @since 01/07/2019
 */
@Entity
public class Vitamin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String nameIUPAC;
    private String description;

    @ManyToMany
    @JoinTable(name = "fruit_vitamin", joinColumns = @JoinColumn(name = "vitamin_id"),
            inverseJoinColumns = @JoinColumn(name = "fruit_id"))
    private Set<Fruit> fruits = new HashSet<>();

    public Vitamin() {
    }

    public Vitamin(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Vitamin(String name, String nameIUPAC, String description) {
        this.name = name;
        this.nameIUPAC = nameIUPAC;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameIUPAC() {
        return nameIUPAC;
    }

    public void setNameIUPAC(String nameIUPAC) {
        this.nameIUPAC = nameIUPAC;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(Set<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vitamin vitamin = (Vitamin) o;
        return Objects.equals(id, vitamin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vitamin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameIUPAC='" + nameIUPAC + '\'' +
                ", description='" + description + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}
