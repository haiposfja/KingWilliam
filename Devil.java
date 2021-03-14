/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for Devil
 */

public class Devil extends Characters{
	private String hornType;
	private String hornColor;
	private String[] devilLines = new String[14];
	
	public Devil(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
		hornType = "pointed";
		hornColor = "black";
	}
	
	public Devil(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender, String hornType, String hornColor) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
		this.hornType = hornType;
		this.hornColor = hornColor;
	}
	
	public void giveLines() {
		devilLines[0] = "“There is…” a raspy voice sounded from behind.";
		devilLines[1] = "“Me?”";
		devilLines[2] = "The man responded, “don’t worry about who I am. Instead, worry of the bountiful offers I can provide.”";
		devilLines[3] = " “Hmm…” the man stood up and paced around the room with his hands tucked behind his back.";
		devilLines[4] = "“Amelia?”";
		devilLines[5] = "“Do you not wish for an eternal paradise… just the two of you? I can grant that for you, given that you execute three of my orders.”";
		devilLines[6] = "“I wonder. I wonder indeed. Just how long your confidence will last.”";
		devilLines[7] = "“Searching for me?”";
		devilLines[8] = "“The third bidding will come later,” the devil replied, “do not be so impatient.”";
		devilLines[9] = "“Complete the bidding,” the devil whispered in William’s ear.";
		devilLines[10] = "“Finish it.”";
		devilLines[11] = "“Aren’t you tired of him calling you a failure? Finish it,” the devil snickered, “you’ve come so far. Amelia is waiting for you.”";
		devilLines[12] = "“Then why are you holding that knife in your hand?”";
		devilLines[13] = "“I am a man of my words,” the devil humbly bowed.";
	}
	
	public String getDevilLine(int line) {
		return devilLines[line];
	}
}
