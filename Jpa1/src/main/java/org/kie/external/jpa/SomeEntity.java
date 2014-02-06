package org.kie.external.jpa;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class SomeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected SomeEntityPK someEntityPK;

    protected String name;
    protected String surname;

    public SomeEntityPK getSomeEntityPK() {
        return someEntityPK;
    }

    public void setSomeEntityPK(SomeEntityPK someEntityPK) {
        this.someEntityPK = someEntityPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
                "someEntityPK=" + someEntityPK +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
