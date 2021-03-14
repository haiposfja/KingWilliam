/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Class to create character objects, also the superclass for specific characters
 */
public class Characters {

	// variables that define a character
	private String hairColor;
	private String eyeColor;
	private double height;
	private double weight;
	private String status;
	private String physique;
	private int age;
	private String personality;
	private String complexity;
	private String name;
	private String gender;

	public Characters(String name, String gender) {
		hairColor = "black";
		eyeColor = "brown";
		height = 170.5;
		weight = 70.5;
		status = "alive";
		physique = "average";
		age = 30;
		personality = "good-natured";
		complexity = "fair";
		this.name = name;
		this.gender = gender;
	}

	public Characters(String hairColor, String eyeColor, double height, double weight, 
			          String status, String physique, int age, String personality, String complexity, 
			          String name, String gender) {
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
		this.height = height;
		this.weight = weight;
		this.status = status;
		this.physique = physique;
		this.age = age;
		this.personality = personality;
		this.complexity  = complexity;
		this.name = name;
		this.gender = gender;
	}

	public String getHairColor() {
		return hairColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getStatus() {
		return status;
	}

	public String getPhysique() {
		return physique;
	}

	public int getAge() {
		return age;
	}

	public String getPersonality() {
		return personality;
	}

	public String getComplexity() {
		return complexity;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
}

