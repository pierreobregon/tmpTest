package com.alpiresac.awore.domain;

import java.util.Date;

public class Tambiente {
    private Integer id;

    private Integer idLocal;

    private Integer idTipoAmbi;

    private String nombAmbi;

    private String descAmbi;

    private String estado;

    private Date fechRegi;

    private String orden;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdTipoAmbi() {
        return idTipoAmbi;
    }

    public void setIdTipoAmbi(Integer idTipoAmbi) {
        this.idTipoAmbi = idTipoAmbi;
    }

    public String getNombAmbi() {
        return nombAmbi;
    }

    public void setNombAmbi(String nombAmbi) {
        this.nombAmbi = nombAmbi;
    }

    public String getDescAmbi() {
        return descAmbi;
    }

    public void setDescAmbi(String descAmbi) {
        this.descAmbi = descAmbi;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }
}