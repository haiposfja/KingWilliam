/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for William's unnamed Father
 */

public class Father extends Characters {
	private String moustacheType;
	private String[] fatherLines = new String[4];
	
	public Father(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	    moustacheType = "curly";
	}
	
	public Father(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender, String moustacheType) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
		this.moustacheType = moustacheType;
	}
	
	public void giveLines() {
		fatherLines[0] = "“Get out!”";
		fatherLines[1] = "“You failure of a son! If only it wasn’t for-”";
		fatherLines[2] = "“Why,” William’s father asked, “what in the devil made you do this?”";
		fatherLines[3] = "“Ahh, William,” his father sighed";
		fatherLines[4] = "“Oh how much of a failure I was. I tried so desperately and still couldn’t raise you well. I am so sorry William, I am ashamed.”";
		fatherLines[5] = "“Oh! So you come into my room with a knife, are you trying to kill me? I raised you! You insolent child! Have you never learned anything from me!”";
		fatherLines[6] = "His father raised his finger to William’s lips, “hush now child, your father deserved this, you did yourself a favor. I have failed as a father, and for an apology, I sacrifice myself to you.”";
	}
	
	public String getMoustacheType() {
		return moustacheType;
	}
	public String getFatherLine(int line) {
		return fatherLines[line];
	}
}
