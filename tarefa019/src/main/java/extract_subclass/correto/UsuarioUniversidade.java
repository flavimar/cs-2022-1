package extract_subclass.correto;

import lombok.Data;

@Data
public class UsuarioUniversidade {
    private String nomeUsuario;
    private String senha;


    public boolean login(String nomeUsuario, String senha){
        return this.nomeUsuario.equals(nomeUsuario) && this.senha.equals(senha);
    }
}
