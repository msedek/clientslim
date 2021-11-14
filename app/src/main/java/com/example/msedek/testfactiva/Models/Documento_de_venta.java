package com.example.msedek.testfactiva.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Documento_de_venta implements Serializable{

    private ArrayList<Detalle> detalle;
    private ArrayList<Impuesto> impuesto;
    private Documento documento;
    private Indicadores indicadores;
    private String  fechaEmision;
    private String idTransaccion;
    private String tipoDocumento;
    private String correoReceptor;
    //FACTURA
    private String idOperacion;
    //BAJA
    private String tipoResumen;
    private Resumen resumen;
    private String fechaGeneracion;

    //private DatosAdicionales datosAdicionales;


    public ArrayList<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<Detalle> detalle) {
        this.detalle = detalle;
    }

    public ArrayList<Impuesto> getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(ArrayList<Impuesto> impuesto) {
        this.impuesto = impuesto;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Indicadores getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(Indicadores indicadores) {
        this.indicadores = indicadores;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public String getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(String idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getTipoResumen() {
        return tipoResumen;
    }

    public void setTipoResumen(String tipoResumen) {
        this.tipoResumen = tipoResumen;
    }

    public Resumen getResumen() {
        return resumen;
    }

    public void setResumen(Resumen resumen) {
        this.resumen = resumen;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

/*    public DatosAdicionales getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(DatosAdicionales datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }*/
}

