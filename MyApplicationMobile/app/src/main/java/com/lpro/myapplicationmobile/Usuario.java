package com.lpro.myapplicationmobile;

public class Usuario {
    private String username;

    public Usuario() {

    }
    public Usuario(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void logar() {
        new Mensagem().enviar();
    }
}
