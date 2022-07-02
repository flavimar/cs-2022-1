package org.example.questao2;

import lombok.Data;


public class Mouse extends Produto{
    private String tipo;
    public Mouse(String descricao) {
       super(descricao);

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao(){
        return tipo.concat(" ").concat(super.descricao);
    }
}
