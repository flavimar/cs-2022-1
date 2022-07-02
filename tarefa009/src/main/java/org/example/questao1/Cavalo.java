package org.example.questao1;

public class Cavalo extends Animal {
    public Cavalo() {
        setMovimento(true);
    }

    @Override
    public String emitirSom() {
        return "iiirrrrí, rilinchin";
    }
    public String correr(){
        return "correndo";
    }
}

