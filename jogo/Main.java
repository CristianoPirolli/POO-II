package jogo;

import jogo.builder.PersonBuilder;
import jogo.director.Director;
import jogo.personagem.Personagem;


public class Main {
    public static void main(String[] args) {
        
        Director director = new Director();

        PersonBuilder builder = new PersonBuilder();
        director.constructMagoPerso(builder);

        Personagem mago = builder.getPerso();
        System.out.println(mago);
    }
}