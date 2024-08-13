package AJavaCore.Gassociacao.test;

import AJavaCore.Gassociacao.domain.Player;
import AJavaCore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Robert Lewandovski");
        Team team = new Team("FC Barcelona");
        Player player1 = new Player("Lamine Yamal");

        Player[] players = {player,player1};

        player.setTeam(team);

        team.setPlayers(players);

        System.out.println("-- Player --");

        player.print();

        System.out.println("-- Team --");
        team.print();

    }
}
