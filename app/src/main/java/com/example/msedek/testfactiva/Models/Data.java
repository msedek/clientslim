package com.example.msedek.testfactiva.Models;

import java.util.ArrayList;

public class Data {

    private String tipoDocumento;
    private String serie;
    private Integer correlativo;
    private String estadoEmision;
    private ArrayList<Observa>observaciones;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public String getEstadoEmision() {
        return estadoEmision;
    }

    public void setEstadoEmision(String estadoEmision) {
        this.estadoEmision = estadoEmision;
    }

    public ArrayList<Observa> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(ArrayList<Observa> observaciones) {
        this.observaciones = observaciones;
    }
}
