package com.alpiresac.awore.domain;

import java.util.Date;

public class Taplicacion {
    private Integer ID;

    private String codiPlan;

    private Integer idUsua;

    private Integer idPlantilla;

    private String nombEmp;

    private String esloEmp;

    private String mailURLEntrante;

    private String mailURLSaliente;

    private String mailUsua;

    private String mailPass;

    private String estado;

    private String flagNoti;

    private Date fechRegiApli;

    private Date fechCaduURL;

    private String URLWeb;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCodiPlan() {
        return codiPlan;
    }

    public void setCodiPlan(String codiPlan) {
        this.codiPlan = codiPlan;
    }

    public Integer getIdUsua() {
        return idUsua;
    }

    public void setIdUsua(Integer idUsua) {
        this.idUsua = idUsua;
    }

    public Integer getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Integer idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getNombEmp() {
        return nombEmp;
    }

    public void setNombEmp(String nombEmp) {
        this.nombEmp = nombEmp;
    }

    public String getEsloEmp() {
        return esloEmp;
    }

    public void setEsloEmp(String esloEmp) {
        this.esloEmp = esloEmp;
    }

    public String getMailURLEntrante() {
        return mailURLEntrante;
    }

    public void setMailURLEntrante(String mailURLEntrante) {
        this.mailURLEntrante = mailURLEntrante;
    }

    public String getMailURLSaliente() {
        return mailURLSaliente;
    }

    public void setMailURLSaliente(String mailURLSaliente) {
        this.mailURLSaliente = mailURLSaliente;
    }

    public String getMailUsua() {
        return mailUsua;
    }

    public void setMailUsua(String mailUsua) {
        this.mailUsua = mailUsua;
    }

    public String getMailPass() {
        return mailPass;
    }

    public void setMailPass(String mailPass) {
        this.mailPass = mailPass;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFlagNoti() {
        return flagNoti;
    }

    public void setFlagNoti(String flagNoti) {
        this.flagNoti = flagNoti;
    }

    public Date getFechRegiApli() {
        return fechRegiApli;
    }

    public void setFechRegiApli(Date fechRegiApli) {
        this.fechRegiApli = fechRegiApli;
    }

    public Date getFechCaduURL() {
        return fechCaduURL;
    }

    public void setFechCaduURL(Date fechCaduURL) {
        this.fechCaduURL = fechCaduURL;
    }

    public String getURLWeb() {
        return URLWeb;
    }

    public void setURLWeb(String URLWeb) {
        this.URLWeb = URLWeb;
    }
}