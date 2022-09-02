package org.example.models;
import lombok.Data;
import java.util.Date;
import java.util.List;
/**
 * Objeto com os atributos de um pessoa fisica
 * Data:15/07/2022
 * @author Flavimar da Silva Almeida
 */
@Data
public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private List<Endereco> endereco;
}
