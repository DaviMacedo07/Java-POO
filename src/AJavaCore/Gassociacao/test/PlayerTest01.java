package AJavaCore.Gassociacao.test;

import AJavaCore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Di Natalli");
        Player player2 = new Player("Del Pierro");
        Player player3 = new Player("Andrea Pirlo");

        Player[] players = {player1,player2,player3};

        for (Player player: players) {
            player.print();
        }
    }
}
