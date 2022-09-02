package extract_class.correto;

import lombok.Data;

@Data
public class Telefone {
    private String numero;
    private String ddd;

    public String formatarTelefone(){
        return "(" + ddd + ")" + numero;
    }
}
