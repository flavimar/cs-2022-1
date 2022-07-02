package org.example.questao2;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();
        Livro livro = new Livro("Livro 1");
        livro.setAutor("livro1");
        carrinho.add(livro);
        Mouse mouse = new Mouse("Mouse ótico, Saída USB. 1.600 dpi");
        mouse.setTipo("gamer");
        carrinho.add(mouse);
        livro = new Livro("Esse um livro de ação");
        livro.setAutor("livro2");
        carrinho.add(livro);
        mouse = new Mouse("Mouse ótico, Saída p2. 2.600 dpi");
        mouse.setTipo("convecional");
        carrinho.add(mouse);
        livro = new Livro("Esse um livro de romance");
        livro.setAutor("livro3");
        carrinho.add(livro);
        carrinho.forEach(prod ->{
            System.out.println(prod.getDescricao());
        });
    }
}
