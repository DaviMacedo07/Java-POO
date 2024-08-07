package AJavaCore.DConstrutores.test;

import AJavaCore.DConstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "TV", 12, "Action", "Universal");
        anime.print();
    }
}
