package extract_subclass.correto;

import lombok.Data;

@Data
public class Professor extends UsuarioUniversidade{
    private String nome;
    private String email;
    private String registro;
}
