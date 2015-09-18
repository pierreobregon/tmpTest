package com.alpiresac.awore.domain;

public class Ttipoambiente {
    private Integer id;

    private Integer idAplic;

    private String nombTipo;

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

    public String getNombTipo() {
        return nombTipo;
    }

    public void setNombTipo(String nombTipo) {
        this.nombTipo = nombTipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}