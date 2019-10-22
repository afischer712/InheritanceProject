package fischer_pp3;
/**
 * 
 * This class creates an object to model the stats of a human player character in a video game
 * 
 * @author Adam Fischer
 * @version 3/28/19
 * 
 * Programming Project 3
 * Spring 2019
 * 
 */

public class HumanPlayer implements Reportable{
	
	
	
	// instance fields
	protected String uniqueID;
	private String name;
	private SkillLevel skillLevel;
	
	
	//methods
	
	/**
	 * This empty argument constructor sets up the basic data for a human player's character
	 */
	public HumanPlayer() {
		
		name = "Player";
		skillLevel = SkillLevel.NOVICE;
		setUniqueID(GameUtilities.generateID());
		
	}// end empty argument constructor
	
	
	/**
	 * This constructor takes in values for the name and difficulty for the character
	 * @param n - the name of the human player's character
	 * @param s - the enum difficulty level for the human player
	 */
	public HumanPlayer(String n, SkillLevel s) {
		
		setName(n);
		setSkillLevel(s);
		setUniqueID(GameUtilities.generateID());
		
	}// end HumanPlayer constructor
	
	
	/**
	 * This class required by the Reportable interface prints a box of the character's data
	 */
	public String reportStructure() {// from interface
		
		String playerReport="----------------------------------------\n" +
							"|             Human Player             |\n" +
							"----------------------------------------\n" +
							"| Not a Subclass                       |\n" +
							"----------------------------------------\n" +
							"| Unique ID : "+getUniqueID()+"       |\n" +
							"| Name : "+name+"                        |\n" +
							"| Skill Level : "+skillLevel+"                 |\n" +
							"----------------------------------------\n";
		
		return playerReport;
		
	}// end reportStructure


	
	// getters and setters
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	public SkillLevel getSkillLevel() {
		return skillLevel;
	}


	public void setSkillLevel(SkillLevel skillLevel) {
		this.skillLevel = skillLevel;
	}


	public String getUniqueID() {
		return uniqueID;
	}


	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	
}// end class HumanPlayer
