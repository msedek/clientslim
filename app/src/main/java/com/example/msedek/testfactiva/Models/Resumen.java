package com.example.msedek.testfactiva.Models;

public class Resumen {

    private Integer id;
    private String nombreEmisor;
    private String numDocEmisor;
    private String tipoDocEmisor;
    private String fechaReferente;
    private String tipoFormatoRepresentacionImpresa;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNumDocEmisor() {
        return numDocEmisor;
    }

    public void setNumDocEmisor(String numDocEmisor) {
        this.numDocEmisor = numDocEmisor;
    }

    public String getTipoDocEmisor() {
        return tipoDocEmisor;
    }

    public void setTipoDocEmisor(String tipoDocEmisor) {
        this.tipoDocEmisor = tipoDocEmisor;
    }

    public String getFechaReferente() {
        return fechaReferente;
    }

    public void setFechaReferente(String fechaReferente) {
        this.fechaReferente = fechaReferente;
    }

    public String getTipoFormatoRepresentacionImpresa() {
        return tipoFormatoRepresentacionImpresa;
    }

    public void setTipoFormatoRepresentacionImpresa(String tipoFormatoRepresentacionImpresa) {
        this.tipoFormatoRepresentacionImpresa = tipoFormatoRepresentacionImpresa;
    }
}
