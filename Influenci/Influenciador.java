package Influenci;
abstract class Influenciador {
    String name;
    int followers;

    Influenciador(String name, int followers) {
        this.name = name;
        this.followers = followers;
    }

    final void displayInfo(){
        System.out.println("Nome: " + name);
        System.out.println("Seguidores: " + followers);
    }

    abstract void postContent();

    abstract void interactFollowers();
}
