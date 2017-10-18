package players;
import java.util.ArrayList;

public class Campaign {
	
	public String title;
	public ArrayList<PlayerCharacter> pcs;
	
	// Constructor
	public Campaign(String title) {
		this.title = title;
	}
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<PlayerCharacter> getPcs() {
		return pcs;
	}
	public void setPcs(ArrayList<PlayerCharacter> pcs) {
		this.pcs = pcs;
	}
	
	// Methods
	public void addPC(PlayerCharacter pc) {
		this.pcs.add(pc);
	}
	
}
