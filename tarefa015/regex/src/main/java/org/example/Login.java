package org.example;

import lombok.Data;

import java.util.concurrent.ExecutionException;

@Data
public class Login {
    private String username;
    private String password;
    private String regexUsername = "^[\\S]{5,30}$";
    private final String regexPassword = "^((?=.*[A-Z])(?=.*[0-9])(?=.*\\S)()).{8,12}$";
    public void validateLogin(String username,String password){
        boolean valido = true;
        if(!username.matches(regexUsername)){
            System.out.println("username incorreto");
            valido = false;
        }
        if(!password.matches(regexPassword)){
            System.out.println("senha incorreta");
            valido = false;
        }
        if(valido) {
            System.out.println("Usuario e senha validados");
        }
    }
}
