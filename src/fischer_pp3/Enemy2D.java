package fischer_pp3;
import java.util.*;
/**
 * 
 * This class, which is a subclass of NonPlayerCharacter, models the stats and actions of an enemy in 
 * a 2d video game 
 * 
 * @author Adam Fischer
 * @version 3/28/19
 * 
 * Programming Project 3
 * Spring 2019
 * 
 */

public class Enemy2D extends NonPlayerCharacter implements Reportable{
	
	// instance fields
	private int xPos;
	private int yPos;
	private int numberTorpedos;
	
	
	
	// methods
	
	/**
	 * This empty argument constructor establishes the basic values for an unchanged enemy
	 */
	public Enemy2D() {
		
		xPos = 0;
		yPos = 0;
		numberTorpedos = 10;
		uniqueID = GameUtilities.generateID();
		personality = Personality.MEAN;
		
	}// end empty argument constructor for Enemy 2D
	
	
	/**
	 * This constructor takes in values for the position of the enemy as well as its torpedos
	 * @param x - the x value for the enemy's position
	 * @param y - the y value for the enemy's position
	 * @param nt - the number of torpedos that the enemy can have
	 */
	public Enemy2D( int x, int y, int nt ) {
		
		setxPos(x);
		setyPos(y);
		setNumberTorpedos(nt);
		
		
	}// end Enemy2D constructor
	
	
	/**
	 * This method takes in and changes the values for the enemy's position
	 * @param x - the x value for the enemy's position
	 * @param y - the y value for the enemy's position
	 */
	public void move(int x, int y) {
		
		setxPos(x);
		setyPos(y);
		
	}// end move
	
	
	/**
	 * This method fires a torpedo and subtracts a torpedo every time it is used
	 * @return - This returns a Boolean based on whether or not there was a torpedo to be fired
	 */
	public Boolean fire() {
		
		if(numberTorpedos>=1) {
			numberTorpedos--;
			return true;
		}
		else {return false;}
		
	}// end fire
	
	
	/**
	 * this method gives a short introduction for the enemy when it is called
	 */
	public String introduce() {
		String intro = "Allow myself to introduce . . . myself.";
		return intro;
	}// end introduce
	
	
	/**
	 * This method gives an exclamation of pain for the enemy to model responses to being damaged
	 */
	public String exclaim() {
		
		Random r = new Random();
		int count = r.nextInt(5)+1;
		String words = "";
		
		switch(count) {
		case 1:
			words = "Ouch!";
			break;
		case 2:
			words = "Yeow!";			
			break;
		case 3:
			words = "Oof!";
			break;
		case 4:
			words = "Ow!";
			break;
		default:
			words = "Hey!";
		}// end swtich statement for the exclamation
		
		return words;
		
	}// end exclaim
	
	
	/**
	 * This method, required by the Reportable interface, prints a box containing the data of the enemy
	 */
	public String reportStructure() {// from interface
		
		String enemyReport ="----------------------------------------\n" +
							"|               Enemy 2D               |\n" +
							"----------------------------------------\n" +
							"| NonPlayerCharacter Subclass          |\n" +
							"----------------------------------------\n" +
							"| Unique ID : "+uniqueID+"       |\n" +
							"| X Position : "+xPos+"                       |\n" +
							"| Y Position : "+yPos+"                       |\n" +
							"| Number of Torpedos : "+numberTorpedos+"              |\n"+
							"| Intelligence : "+intelligence+"               |\n" +
							"| Personality : "+personality+"                   |\n"+
							"----------------------------------------\n";
		
		return enemyReport;
		
	}// end reportStructure

	
	
	// getters and setters
	public int getNumberTorpedos() {
		return numberTorpedos;
	}

	public void setNumberTorpedos(int numberTorpedos) {
		if(numberTorpedos>=1) 
			this.numberTorpedos = numberTorpedos;
		else
			this.numberTorpedos = 1;
	}// end setNumberTorpedos with bounds checking


	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		if(xPos>=0)
			this.xPos = xPos;
		else
			this.xPos = 0;
	}// end setxPos with bounds checking


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {   
		if(yPos>=0)
			this.yPos = yPos;
		else
			this.yPos = 0;
	}// end set yPos with bounds checking
	
	
	
	
}// end subclass Enemy2D
