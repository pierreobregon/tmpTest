package com.alpiresac.awore.domain;

import java.util.Date;

public class Tcontenido {
    private Integer idAplic;

    private String codiBloque;

    private String nombCabeBloque;

    private String textBloque;

    private Integer orden;

    private Date fechRegi;

    public Integer getIdAplic() {
        return idAplic;
    }

    public void setIdAplic(Integer idAplic) {
        this.idAplic = idAplic;
    }

    public String getCodiBloque() {
        return codiBloque;
    }

    public void setCodiBloque(String codiBloque) {
        this.codiBloque = codiBloque;
    }

    public String getNombCabeBloque() {
        return nombCabeBloque;
    }

    public void setNombCabeBloque(String nombCabeBloque) {
        this.nombCabeBloque = nombCabeBloque;
    }

    public String getTextBloque() {
        return textBloque;
    }

    public void setTextBloque(String textBloque) {
        this.textBloque = textBloque;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }
}