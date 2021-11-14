package com.example.msedek.testfactiva.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.msedek.testfactiva.Models.Detbaja;
import com.example.msedek.testfactiva.Models.Documento_de_baja;
import com.example.msedek.testfactiva.Models.Resumen;
import com.example.msedek.testfactiva.R;


public class BajaFragment extends Fragment {

    public static BajaFragment newInstance()
    {
        BajaFragment fragment = new BajaFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_baja, container, false);



/*
        btnbaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Documento_de_baja documento_de_baja = new Documento_de_baja();

                Detbaja detalle = new Detbaja();

                detalle.setSerie("F0020");
                detalle.setMotivo("ANULACION / REIMPRESION");
                detalle.setCorrelativo(2);
                detalle.setTipoDocumento("01");

                documento_de_baja.setDetbaja(detalle);

                Resumen resumen = new Resumen();

                resumen.setId(1);
                resumen.setNombreEmisor("EIDO PERÚ S.A.C.");
                resumen.setNumDocEmisor("20602297838");
                resumen.setFechaReferente(datacalc);
                resumen.setTipoFormatoRepresentacionImpresa("GENERAL");

                documento_de_baja.setResumen(resumen);

                documento_de_baja.setFechaGeneracion(datacalc);

                documento_de_baja.setIdTransaccion("c4ca4238a0b923820dcc509a6f75849b");

                documento_de_baja.setTipoResumen("RA");

                // sendRetrofitDocumentobaja(documento_de_baja);







*//*                Documento_de_venta debaja = new Documento_de_venta();
                Resumen resumen = new Resumen();
                Detalle detallebaja = new Detalle();

                detallebaja.setSerie("F001");
                detallebaja.setMotivo("ANULACIÓN / REIMPRESIÓN");
                detallebaja.setCorrelativo(1);
                detallebaja.setTipoDocumento("01");

                resumen.setId(1);
                resumen.setNombreEmisor("EIDO PERÚ S.A.C.");
                resumen.setNumDocEmisor("20602297838");
                resumen.setNumDocEmisor("6");
                resumen.setFechaReferente(documento_de_venta.getFechaEmision());
                resumen.setTipoFormatoRepresentacionImpresa("GENERAL");
                debaja.setResumen(resumen);


                debaja.setTipoResumen("RA");
                debaja.setIdTransaccion("c4ca4238a0b923820dcc509a6f75849b");
                debaja.setFechaGeneracion(documento_de_venta.getFechaEmision());

                ArrayList<Detalle>detallebajas = new ArrayList<>();
                detallebajas.add(detallebaja);
                debaja.setDetalle(detallebajas);


                sendRetrofitDocumentobaja(debaja);*//*

            }
        });*/

        return v;
    }




}
