package org.example.models;

import lombok.Data;

/**
 * Objeto Estado
 * Data:15/07/2022
 * @author Flavimar da Silva Almeida
 */
@Data
public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;
}
