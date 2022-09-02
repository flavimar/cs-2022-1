package org.example.closure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListNames {
    public static void listaPessoas(){
        List<String> nomes = new ArrayList<>();
        nomes.add("Flavimar");
        nomes.add("Cris");
        nomes.add("Flavio");
        nomes.add("Caroline");
        nomes.add("Fulano");
        nomes.add("Ciclano");
        //expressão lambda de filtro
        nomes.stream()
                .filter(n-> n.contains("F"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        //Lambda expression
        listaPessoas();
    }
}
