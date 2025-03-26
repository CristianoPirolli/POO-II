package Influenci;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Influenciador> influenciadores = new ArrayList<>();

        Blogueiro blogueiro = new Blogueiro("Blogueiro", 1000);
        Streamer streamer = new Streamer("Streamer", 5000);

        influenciadores.add(blogueiro);
        influenciadores.add(streamer);

        for (Influenciador influenciador : influenciadores) {
            influenciador.postContent();
            influenciador.interactFollowers();
        }

        
    }

}
