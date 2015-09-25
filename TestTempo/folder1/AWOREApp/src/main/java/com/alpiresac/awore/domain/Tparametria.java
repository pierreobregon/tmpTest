package com.alpiresac.awore.domain;

public class Tparametria {
    private String codi_para;

    private String codi_para_padre;

    private String valo_para;

    private String nomb_para;

    private String desc_para;

    private Integer orden;

    private String estado;

    public String getCodi_para() {
        return codi_para;
    }

    public void setCodi_para(String codi_para) {
        this.codi_para = codi_para;
    }

    public String getCodi_para_padre() {
        return codi_para_padre;
    }

    public void setCodi_para_padre(String codi_para_padre) {
        this.codi_para_padre = codi_para_padre;
    }

    public String getValo_para() {
        return valo_para;
    }

    public void setValo_para(String valo_para) {
        this.valo_para = valo_para;
    }

    public String getNomb_para() {
        return nomb_para;
    }

    public void setNomb_para(String nomb_para) {
        this.nomb_para = nomb_para;
    }

    public String getDesc_para() {
        return desc_para;
    }

    public void setDesc_para(String desc_para) {
        this.desc_para = desc_para;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}