package extract_interface.incorreto;

import extract_interface.incorreto.Pessoa;
import extract_interface.incorreto.Telefone;
import lombok.Data;

@Data
public class Aluno extends Pessoa {
    private String matricula;

    private Telefone telefone;

    public boolean fazerLogin(String username, String password){
        return true;
    }
    public String toString(){
        return "Nome:" + getNome() +
                "Idade:" + getIdade() +
                "Matricula" + matricula;

    }
}