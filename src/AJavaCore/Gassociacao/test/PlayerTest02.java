package AJavaCore.Gassociacao.test;

import AJavaCore.Gassociacao.domain.Player;
import AJavaCore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Wellngton Rato");
        Team team = new Team("São Paulo");

        player1.setTeam(team);
        player1.print();
    }
}
