package org.example.questao1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Zoologico {
    List<Animal> jaulas = new ArrayList<>();

    public void addAnimal(Animal animal){
        jaulas.add(animal);
    }
    public void percorrerJaulas(){
        for(Animal jaula : this.jaulas){
            System.out.println("emitindo som: " + jaula.emitirSom());
            if(jaula.isMovimento()) {
                System.out.println("Correndo");
            }
            System.out.println("proxima jaula...");
        }
    }
}
