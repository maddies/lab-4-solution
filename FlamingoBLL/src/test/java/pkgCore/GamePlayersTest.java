package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayersTest {

	@Test
	public void TestAddGamePlayers() {
		GamePlayBlackJack g = new GamePlayBlackJack(eGameType.BLACKJACK);

		// Creating players
		Player p1 = new Player("Maddie", 1);
		Player p2 = new Player("Michelle", 2);
		Player p3 = new Player("Steven", 3);

		// Adding them to an array list
		ArrayList<Player> PlayerList = new ArrayList<Player>();
		PlayerList.add(p1);
		PlayerList.add(p2);
		PlayerList.add(p3);

		// Adding list of players to game
		g.AddPlayersToGame(PlayerList);

		assertTrue(g.GetPlayerInGame(p1) == p1);
		assertTrue(g.GetPlayerInGame(p3) == p3);
		assertTrue(g.GetPlayerInGame(p1) != p3);

	}

	@Test
	public void TestRemoveGamePlayer() {
		GamePlayBlackJack g = new GamePlayBlackJack(eGameType.BLACKJACK);

		// Creating players
		Player p3 = new Player("Ben", 1);
		Player p4 = new Player("Toby", 2);
		Player p5 = new Player("Fred", 3);

		// Adding them to an array list
		ArrayList<Player> PlayerList = new ArrayList<Player>();
		PlayerList.add(p3);
		PlayerList.add(p4);
		PlayerList.add(p5);

		// Adding all players into game
		g.AddPlayersToGame(PlayerList);

		// Removing a player
		g.RemovePlayerFromGame(p3);
		try {
			g.GetPlayerInGame(p3);
		} catch (Exception e) {
			System.out.println("That player is not playing in this game!");
		}

	}
}
