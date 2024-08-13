package AJavaCore.FModificadorEstatico.domain;

public class Serie {
    private String name;
    private static int[] episodes;
    /*
    0- O Bloco de inicialização é executado quando a JVM carrega a classs
    1- Alocado espaço em memória pro objeto
    2- Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    3- Bloco de inicialização é executado
    4- Construtor é executado
    * */
  static   {
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
        for (int episode: Serie.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }
}
