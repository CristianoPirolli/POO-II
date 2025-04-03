package singleton;

public class Jogo {
    public static void main(String[] args) {
        GameSettings gs = GameSettings.getInstance();
        gs.setVolume(8);
        gs.setResolucao(ResolucaoVideo.ULTRA);
        gs.setNivel(Nivel.DIFICIL);

        System.out.println(gs);

        GameSettings gs2 = GameSettings.getInstance();
        gs2.setVolume(5);
        System.out.println(gs2);
    }
}
