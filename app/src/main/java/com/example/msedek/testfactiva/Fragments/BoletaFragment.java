package com.example.msedek.testfactiva.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.msedek.testfactiva.Models.Detalle;
import com.example.msedek.testfactiva.Models.Documento;
import com.example.msedek.testfactiva.Models.Documento_de_venta;
import com.example.msedek.testfactiva.Models.Impuesto;
import com.example.msedek.testfactiva.Models.Indicadores;
import com.example.msedek.testfactiva.R;


public class BoletaFragment extends Fragment {


    EditText txt_codItem;
    TextView txt_precioItem;
    TextView txt_montoItem;
    TextView txt_nombreItem;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_boleta, container, false);

        txt_codItem = v.findViewById(R.id.txt_codItem);
/*
        txt_precioItem = v.findViewById(R.id.txt_precioItem);
        txt_montoItem = v.findViewById(R.id.txt_montoItem);
        txt_nombreItem = v.findViewById(R.id.txt_nombreItem);


        Documento_de_venta documento_de_venta = new Documento_de_venta();
        Detalle detalle = new Detalle();
        Impuesto impuesto = new Impuesto();
        Documento documento = new Documento();
        Indicadores indicadores = new Indicadores();

        detalle.setCodItem(txt_codItem.getText().toString());
        detalle.setTasaIgv(Double.parseDouble(getString(R.string.TASA_IGV)));
        Double calIgv = cali();
        detalle.setMontoIgv(calIgv);
        Double monto = calIgv + Double.parseDouble(txt_precioItem.getText().toString());
        detalle.setMontoItem(monto);
        detalle.setNombreItem(txt_nombreItem.getText().toString());
        detalle.setPrecioItem(Double.parseDouble(txt_precioItem.getText().toString()));
        detalle.setIdOperacion(getString(R.string.VENTA_FACTURA));
*/











/*

        {
            "detalle": [
            {


                    "idOperacion": "44747",
                    "cantidadItem": "10.8930",
                    "codAfectacionIgv": "20",
                    "precioItemSinIgv": "9.18",
                    "unidadMedidaItem": "NIU"
            }
  ],
            "impuesto": [
            {
                "codImpuesto": "1000",
                    "tasaImpuesto": "0.18",
                    "montoImpuesto": "0.00"
            }
  ],
            "documento": {
            "serie": "BP01",
                    "mntExo": "100.00",
                    "mntTotal": "100.00",
                    "tipoMoneda": "PEN",
                    "correlativo": "8364",
                    "nombreEmisor": "PETROGAS EIRL",
                    "numDocEmisor": "20309757662",
                    "tipoDocEmisor": "6",
                    "nombreReceptor": "-",
                    "numDocReceptor": "-",
                    "direccionOrigen": "Jr. Guillermo Sisley 1200",
                    "direccionUbigeo": "250101",
                    "tipoDocReceptor": "-",
                    "direccionDestino": "-",
                    "nombreComercialEmisor": "PETROGAS EIRL"
        },
            "indicadores": {
            "indBienesTransferidosAmazonia": "true"
        },
            "fechaEmision": "2017-11-29",
                "idTransaccion": "378086",
                "tipoDocumento": "03",
                "correoReceptor": "",
                "datosAdicionales": {
            "nombreVendedor": "NATALIA SMITH URQUIA GUZMAN",
                    "fechaHoraOperacion": "2017-11-29T21:39:43"
        }
        }







*/








/*


        btboleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                documento_de_venta.setTipoDocumento("03");//TODO CALCULAR?
                documento_de_venta.setIdTransaccion("378086");//TODO CALCULAR?
                documento_de_venta.setCorreoReceptor("miguelsedek@gmail.com");


                documento.setSerie("BP40"); //TODO CALCULAR?
                documento.setNombreComercialEmisor("EIDO PERU S.A.C");

                documento.setDireccionDestino("-");//TODO QUE ES ESTO
                documento.setTipoDocReceptor("-");//TODO QUE ES ESTO
                documento.setNombreReceptor("-");//TODO CALCULAR?
                documento.setNumDocReceptor("-");//TODO CALCULAR?


                documento_de_venta.setDocumento(documento);

                Indicadores indicadores= new Indicadores();
                indicadores.setIndBienesTransferidosAmazonia("true");
                documento_de_venta.setIndicadores(indicadores);

                sendRetrofitDocumento(documento_de_venta);

            }
        });
*/



        return v;

    }

    private Double cali() {

        return Double.parseDouble(txt_precioItem.getText().toString()) * Double.parseDouble(getString(R.string.TASA_IGV));

    }

    public static BoletaFragment newInstance()
    {
        BoletaFragment fragment = new BoletaFragment();

        return fragment;
    }



}
