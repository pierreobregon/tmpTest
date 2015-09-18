package com.alpiresac.awore.domain;

import java.util.Date;

public class Tpagos {
    private Integer id;

    private Integer idAplic;

    private Date fechEmisComp;

    private Date fechVctoComp;

    private Date fechRegiPagoComp;

    private Date fechIniPeri;

    private Date fechFinPeri;

    private String nroOper;

    private Long mntoPago;

    private String tipoMone;

    private String estado;

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

    public Date getFechEmisComp() {
        return fechEmisComp;
    }

    public void setFechEmisComp(Date fechEmisComp) {
        this.fechEmisComp = fechEmisComp;
    }

    public Date getFechVctoComp() {
        return fechVctoComp;
    }

    public void setFechVctoComp(Date fechVctoComp) {
        this.fechVctoComp = fechVctoComp;
    }

    public Date getFechRegiPagoComp() {
        return fechRegiPagoComp;
    }

    public void setFechRegiPagoComp(Date fechRegiPagoComp) {
        this.fechRegiPagoComp = fechRegiPagoComp;
    }

    public Date getFechIniPeri() {
        return fechIniPeri;
    }

    public void setFechIniPeri(Date fechIniPeri) {
        this.fechIniPeri = fechIniPeri;
    }

    public Date getFechFinPeri() {
        return fechFinPeri;
    }

    public void setFechFinPeri(Date fechFinPeri) {
        this.fechFinPeri = fechFinPeri;
    }

    public String getNroOper() {
        return nroOper;
    }

    public void setNroOper(String nroOper) {
        this.nroOper = nroOper;
    }

    public Long getMntoPago() {
        return mntoPago;
    }

    public void setMntoPago(Long mntoPago) {
        this.mntoPago = mntoPago;
    }

    public String getTipoMone() {
        return tipoMone;
    }

    public void setTipoMone(String tipoMone) {
        this.tipoMone = tipoMone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}