package extract_class.incorreto;

import lombok.Data;

@Data
public class Pessoa {
    private String nome;
    private int idade;
    private String numTelefone;
    private String dddTelefone;

    public String formatarTelefone(){
        return "(" + dddTelefone+ ")" + numTelefone;
    }
}
