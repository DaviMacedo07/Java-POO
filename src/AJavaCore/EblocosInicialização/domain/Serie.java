package AJavaCore.EblocosInicialização.domain;

public class Serie {
    private String name;
    private int[] episodes;
    /*
    1- Alocado espaço em memória pro objeto
    2- Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    3- Bloco de inicialização é executado
    4- Construtor é executado
    * */
    {
        System.out.println("OLa");

    }
    {
        episodes = new int[20];
        for (int i = 0; i < episodes.length ; i++) {
            episodes[i] = i + 1;
        }
    }
    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public Serie(String name) {
        this.name = name;
    }
    public Serie() {
        for (int episode: episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }
}
