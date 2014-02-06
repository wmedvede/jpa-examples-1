package org.kie.external.jpa;

import javax.persistence.*;

@Entity
@Table(name="COUNTRY")
@SequenceGenerator(name="countryIdSeq", sequenceName = "COUNTRY_ID_SEQ", allocationSize = 1)
public class Country  implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="countryIdSeq")
    @Column(name = "id")
    @org.kie.api.definition.type.Position(value = 0)
    @org.kie.api.definition.type.Key
    private java.lang.Long id;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String name;

    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String capital;

    public Country() {
    }

    public Country(java.lang.Long id, java.lang.String name, java.lang.String capital) {
        this.id = id;
        this.name = name;
        this.capital = capital;
    }

    public Country(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(  java.lang.Long id ) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(  java.lang.String name ) {
        this.name = name;
    }

    public java.lang.String getCapital() {
        return this.capital;
    }

    public void setCapital(  java.lang.String capital ) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.kie.external.jpa.Country that = (org.kie.external.jpa.Country)o;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
