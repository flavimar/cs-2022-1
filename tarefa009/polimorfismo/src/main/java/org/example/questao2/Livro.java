package org.example.questao2;

import lombok.Data;


public class Livro extends Produto{
    private String autor;
    Livro(String descricao){
        super(descricao);

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao(){
        return autor.concat(" ").concat(this.descricao);
    }
}
