package com.alpiresac.awore.domain;

import java.util.Date;

public class Tlocal {
    private Integer id;

    private String nombLocal;

    private Integer idAplic;

    private String direLocal;

    private String ubigeo;

    private String linkMaps;

    private Date fechRegi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombLocal() {
        return nombLocal;
    }

    public void setNombLocal(String nombLocal) {
        this.nombLocal = nombLocal;
    }

    public Integer getIdAplic() {
        return idAplic;
    }

    public void setIdAplic(Integer idAplic) {
        this.idAplic = idAplic;
    }

    public String getDireLocal() {
        return direLocal;
    }

    public void setDireLocal(String direLocal) {
        this.direLocal = direLocal;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getLinkMaps() {
        return linkMaps;
    }

    public void setLinkMaps(String linkMaps) {
        this.linkMaps = linkMaps;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }
}