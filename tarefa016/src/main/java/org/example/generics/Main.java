package org.example.generics;

import org.example.generics.models.Caminhao;
import org.example.generics.models.Carro;
import org.example.generics.models.Moto;
import org.example.generics.models.Veiculo;

public class Main {
    public static void main(String[] args) {
       Moto moto = new Moto();
       Caminhao caminhao = new Caminhao();
       Carro carro = new Carro();
       Main main = new Main();
       main.buzinar(caminhao);
       main.buzinar(moto);
       main.buzinar(carro);
    }
    public void buzinar(Veiculo v){
        System.out.println(v.buzinar());
    }
}
