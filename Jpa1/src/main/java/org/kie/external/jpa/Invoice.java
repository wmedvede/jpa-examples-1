package org.kie.external.jpa;

import javax.persistence.*;


@Entity
@Table(name="INVOICE")
@SequenceGenerator(name="invoiceIdSeq", sequenceName = "INVOICE_ID_SEQ", allocationSize = 1)
public class Invoice  implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="invoiceIdSeq")
    @Column(name = "id")
    @org.kie.api.definition.type.Position(value = 0)
    @org.kie.api.definition.type.Key
    private java.lang.Long id;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String client;

    @OneToMany ( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<org.kie.external.jpa.InvoiceLine> lines;

    public Invoice() {
    }

    public Invoice(java.lang.Long id, java.lang.String client, java.util.List<org.kie.external.jpa.InvoiceLine> lines) {
        this.id = id;
        this.client = client;
        this.lines = lines;
    }

    public Invoice(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(  java.lang.Long id ) {
        this.id = id;
    }

    public java.lang.String getClient() {
        return this.client;
    }

    public void setClient(  java.lang.String client ) {
        this.client = client;
    }

    public java.util.List<org.kie.external.jpa.InvoiceLine> getLines() {
        return this.lines;
    }

    public void setLines(  java.util.List<org.kie.external.jpa.InvoiceLine> lines ) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.kie.external.jpa.Invoice that = (org.kie.external.jpa.Invoice)o;
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
