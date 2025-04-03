package singleton;

public class GameSettings {
    private static GameSettings instance;
    private int volume;
    private Nivel nivel;
    private ResolucaoVideo resolucao;

    private GameSettings() {
        this.volume = 0;
        this.nivel = Nivel.NORMAL;
        this.resolucao = ResolucaoVideo.MEDIA;
    }

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    @Override
    public String toString(){
        String config = "\nVolume: " + this.volume +
                        "\nNível: " + this.nivel +
                        "\nResolução: " + this.resolucao;
        return config;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public ResolucaoVideo getResolucao() {
        return resolucao;
    }
    
    public void setResolucao(ResolucaoVideo resolucao) {
        this.resolucao = resolucao;
    }

    
}