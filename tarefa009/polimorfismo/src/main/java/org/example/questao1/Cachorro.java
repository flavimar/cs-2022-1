package org.example.questao1;

import lombok.Data;

@Data
public class Cachorro extends Animal{
    Cachorro(){
        setMovimento(true);
    }

    @Override
    public String emitirSom() {
        return "auau";
    }
    public String correr(){
        return "correndo";
    }
}
