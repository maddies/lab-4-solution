package pkgCore;

import java.util.ArrayList;
import java.util.UUID;
import java.util.HashMap;

public class Table {

	private UUID TableID;
	// private ArrayList<Player> PlayersInTable = new ArrayList<Player>();
	private HashMap<UUID, Player> TablePlayers_hm = new HashMap<UUID, Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		//TODO: Implement this method
		TablePlayers_hm.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		//TODO: Implement this method
		TablePlayers_hm.remove(p);
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		TablePlayers_hm.get(p);
		return p;
	}
}