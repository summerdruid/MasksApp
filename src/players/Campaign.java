package players;
import java.util.ArrayList;

public class Campaign {
	
	public String name;
	public ArrayList<PlayerCharacter> pcs;
	
	// Accessors
	public String getName() {
		return name;
	}
	public ArrayList<PlayerCharacter> getPCs() {
		return pcs;
	}
	
	// Mutators
	public void setName(String name) {
		this.name = name;
	}
	public void setPCs(ArrayList<PlayerCharacter> pcs) {
		this.pcs = pcs;
	}
	
	public void addPC(PlayerCharacter pc) {
		this.pcs.add(pc);
	}
	
}
