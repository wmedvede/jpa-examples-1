package org.kie.external.jpa;

import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class SomeEntityPK implements Serializable {
   /* primary key fields */

    protected String countryCode;

    protected String passportNumber;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "SomeEntityPK{" +
                "countryCode='" + countryCode + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
