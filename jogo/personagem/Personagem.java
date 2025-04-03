package jogo.personagem;

import jogo.armas.ArmsType;

public class Personagem {
    private final PersonType personType;
    private final ArmsType armsType;
    private final String nome;
    private final int vida;
    private final int forca;
    private final int defesa;
    private final String habilidade;

    public Personagem(PersonType personType, ArmsType armsType, String nome,
                int vida, int forca, int defesa, String habilidade) {
        this.personType = personType;
        this.armsType = armsType;
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.habilidade = habilidade;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public ArmsType getArmsType() {
        return armsType;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getHabilidade() {
        return habilidade;
    }


}
