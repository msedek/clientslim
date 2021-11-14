package com.example.msedek.testfactiva.Fragments;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.msedek.testfactiva.Interfaz.IsendFactiva;
import com.example.msedek.testfactiva.Models.AccesToken;
import com.example.msedek.testfactiva.Models.ClientCredentials;
import com.example.msedek.testfactiva.Models.Data;
import com.example.msedek.testfactiva.Models.Detalle;
import com.example.msedek.testfactiva.Models.Documento;
import com.example.msedek.testfactiva.Models.Documento_de_venta;
import com.example.msedek.testfactiva.Models.Errors;
import com.example.msedek.testfactiva.Models.Impuesto;
import com.example.msedek.testfactiva.R;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FacturaFragment extends Fragment {


    TextView txt_razonSoc;
    TextView txt_dirCliente;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_factura, container, false);

        txt_razonSoc = v.findViewById(R.id.txt_razonSoc);
        txt_dirCliente = v.findViewById(R.id.txt_dirCliente);



            txt_razonSoc.setText(getArguments().getString("razonSoc"));
            txt_dirCliente.setText(getArguments().getString("dirCliente"));





/*



        if(isIstoken)
        {




        }
        else
        {
            showmessage("No se ha podido verificar el token, revise su conexion a internet o reinicie la App",1000);
        }


        spanish = new Locale("es", "PE");
        contribuyente = new ArrayList<>();


        final Documento_de_venta documento_de_venta = new Documento_de_venta();

        Detalle detalles = new Detalle();

        detalles.setCodItem("000004");
        detalles.setTasaIgv("0.18");
        detalles.setMontoIgv("0.00");
        detalles.setMontoItem("100.00"); //TODO MONTO NO ES IGUAL QUE PRECIO?
        detalles.setNombreItem("HELADO DE CLARISSA");
        detalles.setPrecioItem("30.00");
        detalles.setIdOperacion("44747");  //TODO CALCULAR ESTO??
        detalles.setCantidadItem("2");
        detalles.setCodAfectacionIgv("20"); //TODO DE DONDE OBTENGO ESTO
        detalles.setPrecioItemSinIgv("30.00");
        detalles.setUnidadMedidaItem("NIU");

        final ArrayList<Detalle> detalle = new ArrayList<>();
        detalle.add(detalles);

        documento_de_venta.setDetalle(detalle);


        Impuesto impuestos = new Impuesto();

        impuestos.setCodImpuesto("1000");//TODO CALCULAR?
        impuestos.setTasaImpuesto("0.18");
        impuestos.setMontoImpuesto("0.00");

        ArrayList<Impuesto> impuesto = new ArrayList<>();
        impuesto.add(impuestos);

        documento_de_venta.setImpuesto(impuesto);


        final Documento documento = new Documento();


        documento.setMntExo("100.00"); //TODO COMO SABER CUANTO ES EL EXONERADO O POR QUE
        documento.setMntTotal("100.00");
        documento.setTipoMoneda("PEN");
        documento.setCorrelativo("8364");//TODO CALCULAR?
        documento.setNombreEmisor("EIDO PERU S.A.C");
        txtemisor.setText(documento.getNombreEmisor());

        documento.setNumDocEmisor("20602297838");
        documento.setTipoDocEmisor("6");//TODO CALCULAR?
        documento.setDireccionOrigen("Narciso de la colina 350");
        documento.setDireccionUbigeo("250101");//TODO QUE ES ESTO

        //  DatosAdicionales datosAdicionales = new DatosAdicionales();

        //datosAdicionales.setNombreVendedor("Miguel Sedek");

        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", spanish);
        //  SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss" + " ", spanish);
        final String datacalc = sdf.format(cal.getTime());
        // String datacalc2 = sdf2.format(cal.getTime());
        documento_de_venta.setFechaEmision(datacalc);


*/
/*        try
        {
            Date date = sdf.parse(datacalc);
              Date date2 = sdf.parse(datacalc2);
             datosAdicionales.setFechaHoraOperacion(date2);
            documento_de_venta.setFechaEmision(date);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }*//*


        //documento_de_venta.setDatosAdicionales(datosAdicionales);


        numef = prefs.getInt("factura_num",6);

        txtconse.setText("F00" + numef);

        if(chpre())
        {
            getRetrofitToken();
        }



        btnfactura.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                documento_de_venta.setTipoDocumento("01");//TODO CALCULAR?
                documento_de_venta.setIdTransaccion("c4ca4238a0b923820dcc509a6f75849d");//TODO CALCULAR?
                documento_de_venta.setCorreoReceptor("miguelsedek@gmail.com");//TODO SOLICITAR
                documento_de_venta.setIdOperacion("ea66c06c1e1c05fa9f1aa39d98dc5bc4");

                documento.setDireccionDestino("Av. Buenavista Nro. 393 Int. 301");//TODO QUE ES ESTO
                documento.setTipoDocReceptor("6");//TODO QUE ES ESTO
                documento.setNumDocReceptor("20600543050");
                documento.setNombreReceptor("FACTURACTIVA DEL PERU S.A.C.");
                String rek = txtconse.getText().toString();
                documento.setSerie(rek); //TODO CALCULAR?


                documento_de_venta.setDocumento(documento);


                sendRetrofitDocumento(documento_de_venta);

                numef = numef + 1;
                txtconse.setText("F00" + numef);



*/
/*                    Gson gson = new Gson();
                    String json = gson.toJson(documento_de_venta);*//*



                //Log.d("doc : ", json);


            }
        });


*/







        return v;




    }



    public static FacturaFragment newInstance(String rcon, String dircon)
    {
        FacturaFragment fragment = new FacturaFragment();


        Bundle bundle = new Bundle();
        bundle.putString("razonSoc", rcon);
        bundle.putString("dirCliente", dircon);

        fragment.setArguments(bundle);




        return fragment;
    }

  private void chectoken() {

        SharedPreferences saved_values = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        expires_at = saved_values.getInt("expires_at", 0);

        long currentTime = 0;

        @SuppressLint("SimpleDateFormat")
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTime = sdf.format(new Date());

        try {

            Date date = sdf.parse(utcTime);
            currentTime = (int) (date.getTime()/1000);


        } catch (ParseException e) {
            e.printStackTrace();
        }


        //int currentTime = (int) (date.getTime()/1000);



        if(currentTime  > expires_at )
        {
            //TOKEN CADUCO PEDIR NUEVO
            Log.i("Status", " esta vencido");
            getRetrofitToken();


        }
        else
        {
            isIstoken = true;
            Log.i("Status", " valido");
        }





        if (toks != null)
        {
            acces_token = toks;
            expires_at = saved_values.getInt("expires_at", 0);
            facorrela = saved_values.getInt("factura_num",6);

            Integer nume = prefs.getInt("factura_num",6);

            txtconse.setText("F00" + nume);

            return false;
        }







        if(chpre())
        {
            getRetrofitToken();

        }















        //RENOVAR TOKEN

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        //getApplicationContext().getSharedPreferences(String.valueOf(prefs), 0).edit().clear().apply();


        //SharedPreferences prefs; // here you get your prefrences by either of two methods
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.apply();


    }


    public void sendRetrofitDocumento(Documento_de_venta documento_de_venta)
    {

        final String code = "Bearer " +  acces_token;



        *//*.baseUrl(" https://requestb.in/")*//*


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://104.236.118.28:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IsendFactiva request = retrofit.create(IsendFactiva.class);

        Call<Errors> call = request.sendoc(code,documento_de_venta);

        call.enqueue(new Callback<Errors>()
        {
            @Override
            public void onResponse(@NonNull Call<Errors> call, @NonNull Response<Errors> response)
            {

                if(response.code() == 200)
                {
                    //TOTO
                    showmessage("RECIBIENDO DEPINGA", 1000);

                    SharedPreferences.Editor editor = prefs.edit();//TODO ESTO VA A LA BASE DEL SERVER
                    editor.putInt("factura_num",numef);
                    editor.apply();

                }
                else
                {


                    ResponseBody errors = response.errorBody();


*//*                    Gson gson = new Gson();
                    String errors = gson.toJson(response.body());*//*

                    showmessage(response.code() + " LA CAGADA",1000);




                }
            }

            @Override
            public void onFailure(@NonNull Call<Errors> call, @NonNull Throwable t)
            {

                Log.d("Error agregar boleta" , t.getMessage());
            }
        });
    }

    public void sendRetrofitDocumentobaja(Documento_de_venta documento_de_venta)
    {

        final String code = "Bearer " +  acces_token;


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://104.236.118.28:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IsendFactiva request = retrofit.create(IsendFactiva.class);

        Call<Data> call = request.sendocbaja(code,documento_de_venta);

        call.enqueue(new Callback<Data>()
        {
            @Override
            public void onResponse(@NonNull Call<Data> call, @NonNull Response<Data> response)
            {
                Data data = response.body();

                Gson gson = new Gson();
                String json = gson.toJson(data);


                Log.d("tag", json);

                //TODO QUE HACER CON DATA DEL SERVER
            }

            @Override
            public void onFailure(@NonNull Call<Data> call, @NonNull Throwable t)
            {

                Log.d("Error agregar boleta" , t.getMessage());
            }
        });
    }

    public void getRetrofitToken()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://104.236.118.28:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IsendFactiva request = retrofit.create(IsendFactiva.class);

        ClientCredentials clientCredentials = new ClientCredentials();

        clientCredentials.setGrant_type(getString(R.string.grant_type));
        clientCredentials.setClient_id(getString(R.string.client_id));
        clientCredentials.setClient_secret(getString(R.string.client_key));

        Call<AccesToken> call = request.getAccessToken(clientCredentials);

        call.enqueue(new Callback<AccesToken>()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NonNull Call<AccesToken> call, @NonNull Response<AccesToken> response)
            {

                AccesToken accesToken =  response.body();

                SharedPreferences saved_values = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor=saved_values.edit();
                assert accesToken != null;
                editor.putString("acces_token", accesToken.getAccess_token());
                editor.putInt("expires_at", accesToken.getExpires_at());
                editor.putInt("factura_num",6);//TODO ESTO PERTECE A LA BASE DE DATOS FATURA

                txtconse.setText("000" + 6);
                editor.apply();
                isIstoken = true;

                Log.d("Token: ", accesToken.getAccess_token());

            }
            @Override
            public void onFailure(@NonNull Call<AccesToken> call, @NonNull Throwable t)
            {
                Log.d("NAY" , t.getMessage());
            }
        });
    }*/


}
