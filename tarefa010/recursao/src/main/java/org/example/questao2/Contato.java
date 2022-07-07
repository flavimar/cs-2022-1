package org.example.questao2;

import lombok.Data;

@Data
public class Contato implements Comparable<Contato>{
    private String nome;
    private String email;



    @Override
    public int compareTo(Contato c) {
        return this.getNome().compareTo(c.getNome());
    }
    @Override
    public String toString(){
        return "nome: " + this.getNome() + " - email: "  + this.getEmail();
    }
}
