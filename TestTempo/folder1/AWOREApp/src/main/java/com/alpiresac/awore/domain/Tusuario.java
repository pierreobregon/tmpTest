package com.alpiresac.awore.domain;

import java.util.Date;

public class Tusuario {
    private Integer id;

    private String codTipoDocu;

    private String nroDocu;

    private String nombUsu;

    private String apeUsu;

    private String mailUsu;

    private String passUsu;

    private Date fechActivo;

    private String nroTele;

    private String estado;

    private String codiAcceMail;

    private Integer idAplic;

    private String codPerfil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodTipoDocu() {
        return codTipoDocu;
    }

    public void setCodTipoDocu(String codTipoDocu) {
        this.codTipoDocu = codTipoDocu;
    }

    public String getNroDocu() {
        return nroDocu;
    }

    public void setNroDocu(String nroDocu) {
        this.nroDocu = nroDocu;
    }

    public String getNombUsu() {
        return nombUsu;
    }

    public void setNombUsu(String nombUsu) {
        this.nombUsu = nombUsu;
    }

    public String getApeUsu() {
        return apeUsu;
    }

    public void setApeUsu(String apeUsu) {
        this.apeUsu = apeUsu;
    }

    public String getMailUsu() {
        return mailUsu;
    }

    public void setMailUsu(String mailUsu) {
        this.mailUsu = mailUsu;
    }

    public String getPassUsu() {
        return passUsu;
    }

    public void setPassUsu(String passUsu) {
        this.passUsu = passUsu;
    }

    public Date getFechActivo() {
        return fechActivo;
    }

    public void setFechActivo(Date fechActivo) {
        this.fechActivo = fechActivo;
    }

    public String getNroTele() {
        return nroTele;
    }

    public void setNroTele(String nroTele) {
        this.nroTele = nroTele;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodiAcceMail() {
        return codiAcceMail;
    }

    public void setCodiAcceMail(String codiAcceMail) {
        this.codiAcceMail = codiAcceMail;
    }

    public Integer getIdAplic() {
        return idAplic;
    }

    public void setIdAplic(Integer idAplic) {
        this.idAplic = idAplic;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }
}