package jogo.builder;

import jogo.armas.ArmsType;
import jogo.personagem.PersonType;
import jogo.personagem.Personagem;
import jogo.director.Director;


public class PersonBuilder implements Builder {
    private ArmsType armsType;
    private String nome;
    private int vida;
    private int forca;
    private int defesa;
    private String habilidade;
    private PersonType personType;


    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public void setArmsType(ArmsType armsType) {
        this.armsType = armsType;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    @Override
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Personagem getPerso() {
        return new Personagem(personType, armsType, nome, vida, forca, defesa, habilidade);
    }
}
