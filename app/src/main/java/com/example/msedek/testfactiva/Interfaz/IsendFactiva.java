package com.example.msedek.testfactiva.Interfaz;

import com.example.msedek.testfactiva.Models.AccesToken;
import com.example.msedek.testfactiva.Models.Cliente;
import com.example.msedek.testfactiva.Models.Documento_de_venta;
import com.example.msedek.testfactiva.Models.ClientCredentials;
import com.example.msedek.testfactiva.Models.Data;
import com.example.msedek.testfactiva.Models.Errors;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface IsendFactiva
{


    @Headers({"Content-Type: application/json"})
    @POST("emission/documents")
    Call<Errors>sendoc(@Header("Authorization")String auth, @Body Documento_de_venta documento_de_venta);

    @Headers({"Content-Type: application/json"})
    @POST("emission/summaries")
    Call<Data>sendocbaja(@Header("Authorization")String auth,@Body Documento_de_venta documento_de_venta);

    @Headers({"Content-Type: application/json",
              "Authorization: Basic MWJIMzZ4ZFJ2ek9uZXFsd0RnWkk2QzpOemsxWTJVMk5EaG1OVGd4TkdJME1XSTRPRGM0T1dFeU16STJNakk0Wm1N"})
    @POST("oauth2/token")
    Call<AccesToken> getAccessToken(@Body ClientCredentials clientCredentials);

    //@Headers({"CONNECT_TIMEOUT:10000", "READ_TIMEOUT:10000", "WRITE_TIMEOUT:10000"})
    @GET("api/contri/{ruc}")
    Call<ArrayList<Cliente>> getJSONClienteruc(@Path("ruc") String ruc);

/*    @GET("api/cliente/{cli_dni}")
    Call<Cliente> getJSONClienteid(@Path("cli_dni") String cli_dni);*/

}


