package org.example.models;

import lombok.Data;
import org.example.enums.TipoLogradouro;

@Data
public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;
}
