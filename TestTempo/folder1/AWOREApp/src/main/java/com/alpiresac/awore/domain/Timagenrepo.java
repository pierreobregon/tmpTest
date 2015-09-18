package com.alpiresac.awore.domain;

import java.util.Date;

public class Timagenrepo {
    private Integer id;

    private String rutaImag;

    private String estado;

    private Date fechRegi;

    private Integer idServ;

    private Integer idLocal;

    private Integer idAccesorio;

    private Integer idAmbiente;

    private Integer idAplicLogo;

    private Integer idAplicImgPortal;

    private Integer idPagos;

    private byte[] archImag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRutaImag() {
        return rutaImag;
    }

    public void setRutaImag(String rutaImag) {
        this.rutaImag = rutaImag;
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

    public Integer getIdServ() {
        return idServ;
    }

    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdAccesorio() {
        return idAccesorio;
    }

    public void setIdAccesorio(Integer idAccesorio) {
        this.idAccesorio = idAccesorio;
    }

    public Integer getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(Integer idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    public Integer getIdAplicLogo() {
        return idAplicLogo;
    }

    public void setIdAplicLogo(Integer idAplicLogo) {
        this.idAplicLogo = idAplicLogo;
    }

    public Integer getIdAplicImgPortal() {
        return idAplicImgPortal;
    }

    public void setIdAplicImgPortal(Integer idAplicImgPortal) {
        this.idAplicImgPortal = idAplicImgPortal;
    }

    public Integer getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(Integer idPagos) {
        this.idPagos = idPagos;
    }

    public byte[] getArchImag() {
        return archImag;
    }

    public void setArchImag(byte[] archImag) {
        this.archImag = archImag;
    }
}