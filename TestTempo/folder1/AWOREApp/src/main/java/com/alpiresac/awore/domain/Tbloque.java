package com.alpiresac.awore.domain;

public class Tbloque {
    private String codiBloque;

    private String codiTipoPlantilla;

    private String nombBloque;

    private Integer orden;

    public String getCodiBloque() {
        return codiBloque;
    }

    public void setCodiBloque(String codiBloque) {
        this.codiBloque = codiBloque;
    }

    public String getCodiTipoPlantilla() {
        return codiTipoPlantilla;
    }

    public void setCodiTipoPlantilla(String codiTipoPlantilla) {
        this.codiTipoPlantilla = codiTipoPlantilla;
    }

    public String getNombBloque() {
        return nombBloque;
    }

    public void setNombBloque(String nombBloque) {
        this.nombBloque = nombBloque;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}