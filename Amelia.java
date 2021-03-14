/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for Amelia
 */

import java.util.*;

public class Amelia extends Characters{
	private ArrayList<String> ameliaLines = new ArrayList<>();;
	
	public Amelia(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	}
	
	public void giveLines() {
		ameliaLines.add("“Hey! You always have such a stern expression, but don’t worry, I’ll be the one to change that! I’m Amelia, and you?”");
		ameliaLines.add("“William, how was the food?”");
		ameliaLines.add("“Oh William, I love you.”");
		ameliaLines.add("“William, promise me that we’ll be together, ‘till… what was it again? Right, ‘till death do us part.”");
	}
	
	public String getAmeliaLine(int line) {
		return ameliaLines.get(line);
	}
}
