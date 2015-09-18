package com.alpiresac.awore.domain;

import java.util.Date;

public class Taccesorio {
    private Integer id;

    private String nombAcce;

    private String descAcce;

    private Date fechRegi;

    private Integer idAplic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombAcce() {
        return nombAcce;
    }

    public void setNombAcce(String nombAcce) {
        this.nombAcce = nombAcce;
    }

    public String getDescAcce() {
        return descAcce;
    }

    public void setDescAcce(String descAcce) {
        this.descAcce = descAcce;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }

    public Integer getIdAplic() {
        return idAplic;
    }

    public void setIdAplic(Integer idAplic) {
        this.idAplic = idAplic;
    }
}