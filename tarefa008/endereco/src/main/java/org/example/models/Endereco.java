package org.example.models;

import lombok.Data;
import org.example.enums.TipoEndereco;

/**
 * Objeto Endereço com os atriburos nescessarios
 * Data:15/07/2022
 * @author Flavimar da Silva Almeida
 */
@Data
public class Endereco {
    private Integer numero;
    private String complemento;
    private int CEP;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;
}
