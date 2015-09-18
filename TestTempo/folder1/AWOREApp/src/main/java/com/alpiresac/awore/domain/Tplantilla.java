package com.alpiresac.awore.domain;

public class Tplantilla {
    private Integer id;

    private String codiTipoPlantilla;

    private String nombPlantilla;

    private String descPlantilla;

    private String nombHTMLPlantilla;

    private String nombCSSPlantilla;

    private String nombJSPlantilla;

    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodiTipoPlantilla() {
        return codiTipoPlantilla;
    }

    public void setCodiTipoPlantilla(String codiTipoPlantilla) {
        this.codiTipoPlantilla = codiTipoPlantilla;
    }

    public String getNombPlantilla() {
        return nombPlantilla;
    }

    public void setNombPlantilla(String nombPlantilla) {
        this.nombPlantilla = nombPlantilla;
    }

    public String getDescPlantilla() {
        return descPlantilla;
    }

    public void setDescPlantilla(String descPlantilla) {
        this.descPlantilla = descPlantilla;
    }

    public String getNombHTMLPlantilla() {
        return nombHTMLPlantilla;
    }

    public void setNombHTMLPlantilla(String nombHTMLPlantilla) {
        this.nombHTMLPlantilla = nombHTMLPlantilla;
    }

    public String getNombCSSPlantilla() {
        return nombCSSPlantilla;
    }

    public void setNombCSSPlantilla(String nombCSSPlantilla) {
        this.nombCSSPlantilla = nombCSSPlantilla;
    }

    public String getNombJSPlantilla() {
        return nombJSPlantilla;
    }

    public void setNombJSPlantilla(String nombJSPlantilla) {
        this.nombJSPlantilla = nombJSPlantilla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}