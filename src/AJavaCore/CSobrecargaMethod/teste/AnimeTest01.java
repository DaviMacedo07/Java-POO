package AJavaCore.CSobrecargaMethod.teste;

import AJavaCore.CSobrecargaMethod.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Comedy");
        anime.print();
    }
}
