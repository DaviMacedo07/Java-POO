package AJavaCore.CSobrecargaMethod.dominio;

public class Anime {
    private String name;
    private String tipe;
    private int episodes;
    private String gender;

    public void init(String name, String tipe, int episodes , String gender) {
        this.name = name;
        this.tipe = tipe;
        this.episodes = episodes;
        this.gender = gender;
    }
    public void print() {
        System.out.println(this.name);
        System.out.println(this.tipe);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
