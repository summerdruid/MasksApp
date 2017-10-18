package players;

import java.util.ArrayList;

public class PlayerCharacter {
	
	public String name;
	public String secretid;
	public String player;
	public Playbook playbook;
	public ArrayList<String> powers;
	public ArrayList<String> looks;
	public ArrayList<Move> moves;
	//public ArrayList<Extra> extras;
	
	// Constructor
	public PlayerCharacter(String name, String secretid, String player, Playbook playbook, ArrayList<String> powers) {
		super();
		this.name = name;
		this.secretid = secretid;
		this.player = player;
		this.playbook = playbook;
		this.powers = powers;
	}


	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecretid() {
		return secretid;
	}
	public void setSecretid(String secretid) {
		this.secretid = secretid;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public Playbook getPlaybook() {
		return playbook;
	}
	public void setPlaybook(Playbook playbook) {
		this.playbook = playbook;
	}
	public ArrayList<String> getPowers() {
		return powers;
	}
	public void setPowers(ArrayList<String> powers) {
		this.powers = powers;
	}
	public ArrayList<String> getLooks() {
		return looks;
	}
	public void setLooks(ArrayList<String> looks) {
		this.looks = looks;
	}
	public ArrayList<Move> getMoves() {
		return moves;
	}
	public void setMoves(ArrayList<Move> moves) {
		this.moves = moves;
	}
	
	
	
}
