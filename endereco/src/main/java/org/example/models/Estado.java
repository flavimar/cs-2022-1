package org.example.models;

import lombok.Data;

@Data
public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;
}
