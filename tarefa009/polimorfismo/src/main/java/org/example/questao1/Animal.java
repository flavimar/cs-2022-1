package org.example.questao1;

import lombok.Data;

@Data
public class Animal implements IAnimal{
    private String nome;
    private int idade;
    private boolean movimento;
    @Override
    public String emitirSom() {
        return "Sou um animal";
    }

}
