package com.example.msedek.testfactiva.Models;

import java.util.Date;

public class DatosAdicionales {

    private String nombreVendedor;
    private Date fechaHoraOperacion;

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public Date getFechaHoraOperacion() {
        return fechaHoraOperacion;
    }

    public void setFechaHoraOperacion(Date fechaHoraOperacion) {
        this.fechaHoraOperacion = fechaHoraOperacion;
    }
}


/*
    "fechaHoraOperacion": "2017-11-29T21:39:43"
  }*/