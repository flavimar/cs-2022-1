package org.example;

import org.example.Exceptions.LoginInvalidoException;

public class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("admin", "123");
        try {
            System.out.println(login.fazerLogin("admin", "123"));
            System.out.println(login.fazerLogin("flavimar","123456"));
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
