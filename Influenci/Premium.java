package Influenci;

abstract class Premium extends Streamer implements Monetizar {

    public Premium(String nome, int followers) {
        super(nome, followers);
    }
    
}    
