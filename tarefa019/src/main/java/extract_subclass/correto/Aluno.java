package extract_subclass.correto;

import lombok.Data;

@Data
public class Aluno extends UsuarioUniversidade{
    private String nome;
    private String email;
    private String matricula;
}
