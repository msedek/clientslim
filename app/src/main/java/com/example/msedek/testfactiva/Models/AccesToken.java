package com.example.msedek.testfactiva.Models;

public class AccesToken {


    private String access_token;
    private Integer expires_at;
    private String  token_type;


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Integer expires_at) {
        this.expires_at = expires_at;
    }


    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
