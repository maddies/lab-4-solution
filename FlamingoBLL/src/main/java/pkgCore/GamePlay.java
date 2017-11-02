package pkgCore;

import java.util.ArrayList;

import pkgEnum.eGameType;
import java.util.HashMap;
import java.util.UUID;

public abstract class GamePlay {

	private eGameType eGameType;
	// private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	private HashMap<UUID, Player> GamePlayers_hm = new HashMap<UUID, Player>();
	
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(ArrayList<Player> Players)
	{
		//TODO: Implement this method
		for (Player p : Players) {
			GamePlayers_hm.put(p.getPlayerID(), p);
		}
	}
	
	protected void RemovePlayerFromGame(Player p)
	{
		GamePlayers_hm.remove(p);
		}
	
	protected Player GetPlayerInGame(Player p)
	{
		GamePlayers_hm.get(p);
		return p;
	}
}