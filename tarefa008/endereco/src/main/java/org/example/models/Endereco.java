package org.example.models;

import lombok.Data;
import org.example.enums.TipoEndereco;

@Data
public class Endereco {
    private Integer numero;
    private String complemento;
    private int CEP;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;
}
