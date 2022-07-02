package org.example.questao1;

public class Preguica extends Animal {
    Preguica(){
        setMovimento(false);
    }
    @Override
    public String emitirSom() {
        return "eai";
    }
}
