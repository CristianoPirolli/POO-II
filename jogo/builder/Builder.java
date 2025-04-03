package jogo.builder;

import jogo.armas.ArmsType;
import jogo.personagem.PersonType;


public interface Builder {
    void setPersonType(PersonType personType);
    void setArmsType(ArmsType armsType);
    void setNome(String nome);
    void setVida(int vida);
    void setForca(int forca);
    void setDefesa(int defesa);
    void setHabilidade(String habilidade);
}