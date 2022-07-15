package org.example.models;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private List<Endereco> endereco;
}
