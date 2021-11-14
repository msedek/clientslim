package com.example.msedek.testfactiva.Models;

import java.util.ArrayList;

public class Documento_de_baja {

    private Detbaja detbaja;
    private Resumen resumen;
    private String tipoResumen;
    private String idTransaccion;
    private String fechaGeneracion;

    public Detbaja getDetbaja() {
        return detbaja;
    }

    public void setDetbaja(Detbaja detbaja) {
        this.detbaja = detbaja;
    }


    public String getTipoResumen() {
        return tipoResumen;
    }

    public void setTipoResumen(String tipoResumen) {
        this.tipoResumen = tipoResumen;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Resumen getResumen() {
        return resumen;
    }

    public void setResumen(Resumen resumen) {
        this.resumen = resumen;
    }
}

