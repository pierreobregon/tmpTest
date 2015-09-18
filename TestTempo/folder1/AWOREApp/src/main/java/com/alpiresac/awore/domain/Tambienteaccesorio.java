package com.alpiresac.awore.domain;

import java.util.Date;

public class Tambienteaccesorio {
    private Integer id;

    private Integer idAmbi;

    private Integer idAcce;

    private Date fechRegi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAmbi() {
        return idAmbi;
    }

    public void setIdAmbi(Integer idAmbi) {
        this.idAmbi = idAmbi;
    }

    public Integer getIdAcce() {
        return idAcce;
    }

    public void setIdAcce(Integer idAcce) {
        this.idAcce = idAcce;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }
}