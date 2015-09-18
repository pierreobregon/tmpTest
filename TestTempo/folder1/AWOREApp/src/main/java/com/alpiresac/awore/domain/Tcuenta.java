package com.alpiresac.awore.domain;

public class Tcuenta {
    private Integer id;

    private Integer idAplic;

    private String descCta;

    private String nroCta;

    private String propCtaRef;

    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAplic() {
        return idAplic;
    }

    public void setIdAplic(Integer idAplic) {
        this.idAplic = idAplic;
    }

    public String getDescCta() {
        return descCta;
    }

    public void setDescCta(String descCta) {
        this.descCta = descCta;
    }

    public String getNroCta() {
        return nroCta;
    }

    public void setNroCta(String nroCta) {
        this.nroCta = nroCta;
    }

    public String getPropCtaRef() {
        return propCtaRef;
    }

    public void setPropCtaRef(String propCtaRef) {
        this.propCtaRef = propCtaRef;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}