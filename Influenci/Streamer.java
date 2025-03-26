package Influenci;
class Streamer extends Influenciador {
    
    public Streamer(String nome, int followers) {
        super(nome, followers);
    }

    void postContent(){
        System.out.println(name + " está fazendo uma live!");
    }

    void interactFollowers(){
        System.out.println(name + " respondeu um comentário!");
    }
}
