package extract_subclass.incorreto;

import lombok.Data;

@Data
public class UsuarioUniversidade {
    private String nomeUsuario;
    private String senha;
    private String nome;
    private String email;
    private String codigo;

    public boolean login(String nomeUsuario, String senha){
        return this.nomeUsuario.equals(nomeUsuario) && this.senha.equals(senha);
    }
}
