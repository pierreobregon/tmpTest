package com.alpiresac.awore.domain;

import java.util.Date;

public class Treserva {
    private Integer id;

    private Integer idAplic;

    private Date fechIniRese;

    private Date fechFinRese;

    private String nombRese;

    private Integer idUsuaRegi;

    private String mailUsuaRegi;

    private Integer idUsuaApro;

    private Date fechRegi;

    private Date fechApro;

    private Integer idCuenta;

    private Long mntoAdelRese;

    private Long mntoTotalRese;

    private Long nroOperAbono;

    private String cmntRese;

    private String estaRese;

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

    public Date getFechIniRese() {
        return fechIniRese;
    }

    public void setFechIniRese(Date fechIniRese) {
        this.fechIniRese = fechIniRese;
    }

    public Date getFechFinRese() {
        return fechFinRese;
    }

    public void setFechFinRese(Date fechFinRese) {
        this.fechFinRese = fechFinRese;
    }

    public String getNombRese() {
        return nombRese;
    }

    public void setNombRese(String nombRese) {
        this.nombRese = nombRese;
    }

    public Integer getIdUsuaRegi() {
        return idUsuaRegi;
    }

    public void setIdUsuaRegi(Integer idUsuaRegi) {
        this.idUsuaRegi = idUsuaRegi;
    }

    public String getMailUsuaRegi() {
        return mailUsuaRegi;
    }

    public void setMailUsuaRegi(String mailUsuaRegi) {
        this.mailUsuaRegi = mailUsuaRegi;
    }

    public Integer getIdUsuaApro() {
        return idUsuaApro;
    }

    public void setIdUsuaApro(Integer idUsuaApro) {
        this.idUsuaApro = idUsuaApro;
    }

    public Date getFechRegi() {
        return fechRegi;
    }

    public void setFechRegi(Date fechRegi) {
        this.fechRegi = fechRegi;
    }

    public Date getFechApro() {
        return fechApro;
    }

    public void setFechApro(Date fechApro) {
        this.fechApro = fechApro;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Long getMntoAdelRese() {
        return mntoAdelRese;
    }

    public void setMntoAdelRese(Long mntoAdelRese) {
        this.mntoAdelRese = mntoAdelRese;
    }

    public Long getMntoTotalRese() {
        return mntoTotalRese;
    }

    public void setMntoTotalRese(Long mntoTotalRese) {
        this.mntoTotalRese = mntoTotalRese;
    }

    public Long getNroOperAbono() {
        return nroOperAbono;
    }

    public void setNroOperAbono(Long nroOperAbono) {
        this.nroOperAbono = nroOperAbono;
    }

    public String getCmntRese() {
        return cmntRese;
    }

    public void setCmntRese(String cmntRese) {
        this.cmntRese = cmntRese;
    }

    public String getEstaRese() {
        return estaRese;
    }

    public void setEstaRese(String estaRese) {
        this.estaRese = estaRese;
    }
}