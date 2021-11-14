package com.example.msedek.testfactiva.Models;

public class Detalle {

    private String codItem;//CREAR TABLA C:ASIFICATORIA
    private Double tasaIgv;
    private Double montoIgv;
    private Double montoItem;
    private String nombreItem;
    private Double precioItem;
    private String idOperacion;  //CREAR UNA TABLA CON ID PERSONALIZADO
    private Integer cantidadItem;
    private String codAfectacionIgv;//BUSCAR TABLA N 07 ANEXO 8 SUNAT
    private Double precioItemSinIgv;
    private String unidadMedidaItem;
    private String codSistemaCalculoIsc;// CATALOGO 08 CODIGOS DE TIPOS DE SISTEMA ISC NO OBLIGATORIO
    private Double montoIsc; //NO OBLIGATORIO
    private Double tasaIsc;// NO OBLIGATORIO
    private Double descuentoMonto;
    private Double precioItemReferencia;//SE UTILIZA PARA JUSTIFICAR EXCEPCIONES DE PAGO

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Double getTasaIgv() {
        return tasaIgv;
    }

    public void setTasaIgv(Double tasaIgv) {
        this.tasaIgv = tasaIgv;
    }

    public Double getMontoIgv() {
        return montoIgv;
    }

    public void setMontoIgv(Double montoIgv) {
        this.montoIgv = montoIgv;
    }

    public Double getMontoItem() {
        return montoItem;
    }

    public void setMontoItem(Double montoItem) {
        this.montoItem = montoItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public Double getPrecioItem() {
        return precioItem;
    }

    public void setPrecioItem(Double precioItem) {
        this.precioItem = precioItem;
    }

    public String getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(String idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Integer getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(Integer cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public String getCodAfectacionIgv() {
        return codAfectacionIgv;
    }

    public void setCodAfectacionIgv(String codAfectacionIgv) {
        this.codAfectacionIgv = codAfectacionIgv;
    }

    public Double getPrecioItemSinIgv() {
        return precioItemSinIgv;
    }

    public void setPrecioItemSinIgv(Double precioItemSinIgv) {
        this.precioItemSinIgv = precioItemSinIgv;
    }

    public String getUnidadMedidaItem() {
        return unidadMedidaItem;
    }

    public void setUnidadMedidaItem(String unidadMedidaItem) {
        this.unidadMedidaItem = unidadMedidaItem;
    }

    public String getCodSistemaCalculoIsc() {
        return codSistemaCalculoIsc;
    }

    public void setCodSistemaCalculoIsc(String codSistemaCalculoIsc) {
        this.codSistemaCalculoIsc = codSistemaCalculoIsc;
    }

    public Double getMontoIsc() {
        return montoIsc;
    }

    public void setMontoIsc(Double montoIsc) {
        this.montoIsc = montoIsc;
    }

    public Double getTasaIsc() {
        return tasaIsc;
    }

    public void setTasaIsc(Double tasaIsc) {
        this.tasaIsc = tasaIsc;
    }

    public Double getDescuentoMonto() {
        return descuentoMonto;
    }

    public void setDescuentoMonto(Double descuentoMonto) {
        this.descuentoMonto = descuentoMonto;
    }

    public Double getPrecioItemReferencia() {
        return precioItemReferencia;
    }

    public void setPrecioItemReferencia(Double precioItemReferencia) {
        this.precioItemReferencia = precioItemReferencia;
    }

    //BAJA
/*
    private String serie;
    private String motivo;
    private Integer correlativo;
    private String tipoDocumento;
*/


}


