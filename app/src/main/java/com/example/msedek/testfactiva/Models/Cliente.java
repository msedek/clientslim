package com.example.msedek.testfactiva.Models;

public class Cliente {

    private String ruc;
    private String nRazonSocial;
    private String nombreVia;
    private String numero;


    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }


    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getnRazonSocial() {
        return nRazonSocial;
    }

    public void setnRazonSocial(String nRazonSocial) {
        this.nRazonSocial = nRazonSocial;
    }
}
