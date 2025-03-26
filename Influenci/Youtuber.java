package Influenci;
class Youtuber extends Influenciador {
    
    public Youtuber(String nome, int followers) {
        super(nome, followers);
    }

    void postContent(){
        System.out.println(name + " postou um vídeo em seu canal!");
    }

    void interactFollowers(){
        System.out.println(name + " respondeu um comentário!");
    }
}
