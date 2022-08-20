package extract_interface.correto;

import lombok.Data;

@Data
public class Aluno extends Pessoa implements Conta{
    private String matricula;

    private Telefone telefone;

    public String toString(){
        return "Nome:" + getNome() +
                "Idade:" + getIdade() +
                "Matricula" + matricula;

    }

    @Override
    public boolean fazerLogin(String username, String password) {
        return true;
    }
}
