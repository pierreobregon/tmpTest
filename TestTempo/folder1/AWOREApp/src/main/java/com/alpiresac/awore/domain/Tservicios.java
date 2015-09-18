package com.alpiresac.awore.domain;

import java.util.Date;

public class Tservicios {
    private Integer id;

    private Integer idAplic;

    private String nombServ;

    private String descCortaServ;

    private String descDetaServ;

    private Date fechRegi;

    private Integer orden;

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

    public String getNombServ() {
        return nombServ;
    }

    public void setNombServ(String nombServ) {
        this.nombServ = nombServ;
    }

    public String getDescCortaServ() {
        return descCortaServ;
    }

    public void setDescCortaServ(String descCortaServ) {
        this.descCortaServ = descCortaServ;
    }

    public String getDescDetaServ() {
        return descDetaServ;
    }

    public void setDescDetaServ(String descDetaServ) {
        this.descDetaServ = descDetaServ;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}