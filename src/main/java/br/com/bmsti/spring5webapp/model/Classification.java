package br.com.bmsti.spring5webapp.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author angelo santos
 * @version 1.0
 * @since 05/07/2019
 */
@Entity
public class Classification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realm;
    private String section;
    private String kind;
    private String subclass;
    private String range;
    private String family;
    private String subfamily;
    private String gender;

    public Classification() {
    }

    public Classification(String realm, String section, String kind, String subclass, String range, String family, String subfamily, String gender) {
        this.realm = realm;
        this.section = section;
        this.kind = kind;
        this.subclass = subclass;
        this.range = range;
        this.family = family;
        this.subfamily = subfamily;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSubfamily() {
        return subfamily;
    }

    public void setSubfamily(String subfamily) {
        this.subfamily = subfamily;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classification that = (Classification) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ScientificClassification{" +
                "id=" + id +
                ", realm='" + realm + '\'' +
                ", section='" + section + '\'' +
                ", kind='" + kind + '\'' +
                ", subclass='" + subclass + '\'' +
                ", range='" + range + '\'' +
                ", family='" + family + '\'' +
                ", subfamily='" + subfamily + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
