package org.example;

import org.example.Exceptions.LoginInvalidoException;

public class Login {
    private String usuario;
    private String senha;
    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if(!this.usuario.equals(usuario) || !this.senha.equals(senha)){
            throw new LoginInvalidoException("Login invalido");
        }
        return true;
    }
}
