package AJavaCore.FModificadorEstatico.test;

import AJavaCore.EblocosInicialização.domain.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie = new Serie();
        for (int episode: serie.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
