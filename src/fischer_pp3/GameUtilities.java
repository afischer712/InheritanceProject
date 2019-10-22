package fischer_pp3;
/**
 * This class provides utilities methods that would be useful
 * for implementing basic game functionality
 * 
 * @author Rob Kelley
 * @version 1.2
 * Programming Project 3
 * SP19
 */

import java.util.Random;

public class GameUtilities {

	private static String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%&^*"; //salt for random number generator
	
	/**
	 * This is a special constructor. By setting to
	 * private, this class can never be instantiated.
	 * This is appropriate because we are going to use 
	 * it as a utility class with only static methods/members
	 */
	private GameUtilities(){
	}//empty-argument constructor
	
	/**
	 * This method uses the SALT
	 * @return String with the randomly generated ID
	 */
	public static String generateID() {
		
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
		
	}//end generateID
	
}//end class
