package org.example.questao1;

public class AnimalTeste {
    public static void main(String[] args) {
        System.out.println("Sons dos tipos de animais...");
        Animal animal = new Cachorro();
        System.out.println(animal.emitirSom());
        animal = new Cavalo();
        System.out.println(animal.emitirSom());
        animal = new Preguica();
        System.out.println(animal.emitirSom());

        System.out.println("Veterinario examindando...");
        Veterinario veterinario = new Veterinario();
        System.out.println(veterinario.examinar(new Cachorro()));
        System.out.println(veterinario.examinar(new Cavalo()));
        System.out.println(veterinario.examinar(new Preguica()));

        System.out.println("Zoologico...");
        Zoologico zoologico= new Zoologico();
        zoologico.addAnimal(new Preguica());
        zoologico.addAnimal(new Cachorro());
        zoologico.addAnimal(new Cavalo());
        zoologico.addAnimal(new Cachorro());
        zoologico.addAnimal(new Preguica());
        zoologico.addAnimal(new Cachorro());
        zoologico.addAnimal(new Cachorro());
        zoologico.addAnimal(new Preguica());
        zoologico.addAnimal(new Cavalo());
        zoologico.addAnimal(new Cavalo());
        zoologico.percorrerJaulas();




    }
}