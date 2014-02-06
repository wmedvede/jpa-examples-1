package org.kie.external.jpa;

import javax.persistence.*;


@Entity
@Table(name="INVOICE_LINE")
@SequenceGenerator(name="invoiceLineIdSeq", sequenceName = "INVOICE_LINE_ID_SEQ", allocationSize = 1)
public class InvoiceLine  implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="invoiceLineIdSeq")
    @Column(name = "id")
    @org.kie.api.definition.type.Position(value = 0)
    @org.kie.api.definition.type.Key
    private java.lang.Long id;

    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Double total;

    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String article;

    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Double unitPrice;

    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.Integer units;

    public InvoiceLine() {
    }

    public InvoiceLine(java.lang.Long id, java.lang.Double total, java.lang.String article, java.lang.Double unitPrice, java.lang.Integer units) {
        this.id = id;
        this.total = total;
        this.article = article;
        this.unitPrice = unitPrice;
        this.units = units;
    }

    public InvoiceLine(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(  java.lang.Long id ) {
        this.id = id;
    }

    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(  java.lang.Double total ) {
        this.total = total;
    }

    public java.lang.String getArticle() {
        return this.article;
    }

    public void setArticle(  java.lang.String article ) {
        this.article = article;
    }

    public java.lang.Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(  java.lang.Double unitPrice ) {
        this.unitPrice = unitPrice;
    }

    public java.lang.Integer getUnits() {
        return this.units;
    }

    public void setUnits(  java.lang.Integer units ) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.kie.external.jpa.InvoiceLine that = (org.kie.external.jpa.InvoiceLine)o;
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
