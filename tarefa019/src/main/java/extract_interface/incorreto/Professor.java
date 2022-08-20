package extract_interface.incorreto;

import extract_interface.correto.Pessoa;

public class Professor extends Pessoa {
    private String registro;

    public boolean fazerLogin(String username, String password){
        return true;
    }
}
