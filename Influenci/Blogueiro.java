package Influenci;
class Blogueiro extends Influenciador {
    
    public Blogueiro(String nome, int followers) {
        super(nome, followers);
    }

    void postContent(){
        System.out.println(name + " escreveu em seu blog!");
    }

    void interactFollowers(){
        System.out.println(name + " respondeu um comentário!");
    }
}
