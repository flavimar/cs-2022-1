package org.example.models;

import lombok.Data;
import org.example.enums.TipoLogradouro;
/**
 * Objeto logradouro com o nome e o tipo de logradouro
 * Data:15/07/2022
 * @author Flavimar da Silva Almeida
 */
@Data
public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;
}
