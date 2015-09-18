package com.alpiresac.awore.domain;

public class Tlocalparametria {
    private Integer id;

    private Integer idLocal;

    private Integer horaAtenInic;

    private Integer horaAtenFin;

    private String diasDispLocal;

    private String fracHora;

    private Integer limiDiasMaxiRese;

    private Integer limiHoraMaxiModiRese;

    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getHoraAtenInic() {
        return horaAtenInic;
    }

    public void setHoraAtenInic(Integer horaAtenInic) {
        this.horaAtenInic = horaAtenInic;
    }

    public Integer getHoraAtenFin() {
        return horaAtenFin;
    }

    public void setHoraAtenFin(Integer horaAtenFin) {
        this.horaAtenFin = horaAtenFin;
    }

    public String getDiasDispLocal() {
        return diasDispLocal;
    }

    public void setDiasDispLocal(String diasDispLocal) {
        this.diasDispLocal = diasDispLocal;
    }

    public String getFracHora() {
        return fracHora;
    }

    public void setFracHora(String fracHora) {
        this.fracHora = fracHora;
    }

    public Integer getLimiDiasMaxiRese() {
        return limiDiasMaxiRese;
    }

    public void setLimiDiasMaxiRese(Integer limiDiasMaxiRese) {
        this.limiDiasMaxiRese = limiDiasMaxiRese;
    }

    public Integer getLimiHoraMaxiModiRese() {
        return limiHoraMaxiModiRese;
    }

    public void setLimiHoraMaxiModiRese(Integer limiHoraMaxiModiRese) {
        this.limiHoraMaxiModiRese = limiHoraMaxiModiRese;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}