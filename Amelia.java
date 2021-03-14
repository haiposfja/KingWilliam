/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for Amelia
 */
public class Amelia extends Characters{
	private String[] ameliaLines = new String[4];
	
	public Amelia(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	}
	
	public void giveLines() {
		ameliaLines[0] = "“Hey! You always have such a stern expression, but don’t worry, I’ll be the one to change that! I’m Amelia, and you?”";
		ameliaLines[1] = "“William, how was the food?”";
		ameliaLines[2] = "“Oh William, I love you.”";
		ameliaLines[3] = "“William, promise me that we’ll be together, ‘till… what was it again? Right, ‘till death do us part.”";
	}
	
	public String getAmeliaLine(int line) {
		return ameliaLines[line];
	}
}
