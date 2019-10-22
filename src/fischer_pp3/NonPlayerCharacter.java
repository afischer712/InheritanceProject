package fischer_pp3;
/**
 * 
 * This abstract class creates a superclass to model non player characters in a video game
 * 
 * @author Adam Fischer
 * @version 3/28/19
 * 
 * Programming Project 3
 * Spring 2019
 *
 */


public abstract class NonPlayerCharacter {
	
	//instance fields
	protected String uniqueID;
	protected IntelligenceType intelligence;
	protected Personality personality;
	protected Boolean active;
	
	
	
	// methods
	
	/**
	 * This empty argument constructor establishes the basic values given to its subclasses
	 */
	public NonPlayerCharacter() {
		
		intelligence = IntelligenceType.AVERAGE;
		personality = Personality.NEUTRAL;
		active = false;
		
	}// end empty argument constructor for NonPlayerCharacter
	
	
	/**
	 * This constructor establishes the values passed into a superconstructor
	 * @param i - the enum intelligence type of the npc
	 * @param p - the enum personality of the npc
	 * @param a - whether or not the npc is active
	 */
	public NonPlayerCharacter(IntelligenceType i, Personality p, Boolean a) {
		
		intelligence = i;
		personality = p;
		active = a;
		uniqueID = GameUtilities.generateID();
		
	}// end NonPlayerCharacter constructor
	
	/**
	 *  These abstract methods indicate the methods whose implamentation is required in the subclasses
	 * @return - these both return string values
	 */
	public abstract String introduce();
	public abstract String exclaim();


	// getters and setters
	
	public IntelligenceType getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(IntelligenceType intelligence) {
		this.intelligence = intelligence;
	}


	public Personality getPersonality() {
		return personality;
	}


	public void setPersonality(Personality personality) {
		this.personality = personality;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}
	
}// end superclass NonPlayerCharacter
