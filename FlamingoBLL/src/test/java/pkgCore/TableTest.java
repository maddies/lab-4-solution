package pkgCore;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class TableTest {

	@Test
	public void TestAddTablePlayer() {
		Table t = new Table();
		
		// Creating players
		Player p1 = new Player("Maddie", 1);
		Player p2 = new Player("Michelle", 2);
		Player p3 = new Player("Steven", 3);
		
		// Adding players to table
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		t.AddPlayerToTable(p3);

		assertTrue(t.GetPlayerFromTable(p1) == p1);
		assertTrue(t.GetPlayerFromTable(p2) == p2);
		assertTrue(t.GetPlayerFromTable(p2) != p3);
	}
	
	@Test
	public void RemoveTablePlayerTest() {
		Table t2 = new Table();
		
		Player p3 = new Player("Molly", 1);
		Player p4 = new Player("Maggie", 2);
		Player p5 = new Player("Aimee", 3);
		
		t2.AddPlayerToTable(p3);
		t2.AddPlayerToTable(p4);
		t2.AddPlayerToTable(p5);
	
		// Removing the players from table
		t2.RemovePlayerFromTable(p3);
		try {
			t2.GetPlayerFromTable(p3);
		}
		catch (Exception e) {
			System.out.println("That player is not at the table!");
		}
	}

}

