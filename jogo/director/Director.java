package jogo.director;
import java.lang.module.ModuleDescriptor;

import jogo.personagem.PersonType;
import jogo.armas.ArmsType;
import jogo.builder.Builder;
import jogo.builder.PersonBuilder;
import jogo.personagem.Personagem;

public class Director {

    public void constructMagoPerso(Builder builder) {
        builder.setPersonType(PersonType.MAGO);
        builder.setArmsType(ArmsType.CAJADO);
        builder.setNome("Mago");
        builder.setVida(75);
        builder.setForca(40);
        builder.setDefesa(30);
        builder.setHabilidade("Fogo");

    }

    public void constructGuerreiroPerso(Builder builder) {
        builder.setPersonType(PersonType.GUERREIRO);
        builder.setArmsType(ArmsType.ESPADA);
        builder.setNome("Guerreiro");
        builder.setVida(100);
        builder.setForca(70);
        builder.setDefesa(50);
        builder.setHabilidade("Força Bruta");
    }

    public void constructBruxoPerso(Builder builder) {
        builder.setPersonType(PersonType.BRUXO);
        builder.setArmsType(ArmsType.CAJADO);
        builder.setNome("Bruxo");
        builder.setVida(80);
        builder.setForca(50);
        builder.setDefesa(40);
        builder.setHabilidade("Necromancia");
    }

    public void constructDruidaPerso(Builder builder) {
        builder.setPersonType(PersonType.DRUIDA);
        builder.setArmsType(ArmsType.ARCO);
        builder.setNome("Druida");
        builder.setVida(90);
        builder.setForca(60);
        builder.setDefesa(45);
        builder.setHabilidade("Natureza");
    }

    public void constructLadinosPerso(Builder builder) {
        builder.setPersonType(PersonType.LADINOS);
        builder.setArmsType(ArmsType.ESPADA);
        builder.setNome("Ladinos");
        builder.setVida(70);
        builder.setForca(50);
        builder.setDefesa(35);
        builder.setHabilidade("Furtividade");
    }
}