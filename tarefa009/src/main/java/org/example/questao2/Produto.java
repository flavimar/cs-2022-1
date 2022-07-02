package org.example.questao2;

import lombok.Data;

@Data
public abstract class Produto implements IProduto{
    private String nomeLoja;
    private double preco;
    protected String descricao;
    Produto(String descricao){
        this.descricao = descricao;
    }
    @Override
    public String getDescricao(){

        return "Produto de informática";
    }
}
