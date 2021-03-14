/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for William
 */

public class William extends Characters {
	private String crownColor;
	private double crownWeight;
	private String[] williamLines = new String[28];

	public William(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	}

	public William(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender, String crownColor,
			double crownWeight) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
		this.crownColor = crownColor;
		this.crownWeight = crownWeight;
	}

	public void giveLines() {
		williamLines[0] = "�Oh, General Amelia... oh how much I loved you. Your dark crimson red eyes glistening in the moonlight, your pale skin that even goddesses envy, your wild, short, dark black hair fluttering in the wind, that attractively kind smile you put on when you greet me. That petit character and those bright pink lips,�  William cried.";
		williamLines[1] = "�If not for this wretched war torn country, I would have wed you with no doubt. Oh how cruel tis world is! Oh how cruel!�";
		williamLines[2] = "�Oh how much I want to go back to those days of bliss, where we would comfort each other to sleep, sharing our warmth with each other. Now what was once the love of my life, has become a frozen corpse.� ";
		williamLines[3] = "�How much I want to go back to the days where we would stroll through the forest, a circlet of flowers hanging loosely on your head as you laughed so foolishly. The spring breeze tingling our skin, the sound of the river flowing through the woods, the beautiful melody of the birds echoing through the forest� is there anything I can do? Oh, the things I�d give up just to see you again.�";
		williamLines[4] = "�Who�s there?�";
		williamLines[5] = "King William chuckled, �what you can offer? Such impudence. Leave, before I make you.�";
		williamLines[6] = "King William�s eyes widened, �you� how do you know of her? Speak!�";
		williamLines[7] = "King William sneered at the man�s remark, �even God does not play with the dead. No, no, you must be the devil! You seek to take advantage of my distraught soul, I shall not give in to your words of temptation.�";
		williamLines[8] = "�Amelia... what�s the point of living if it�s without you?�";
		williamLines[9] = "��Till death do us part� but it was I! It was I who did us apart! Don�t worry Amelia, I�ll fix this mistake.�";
		williamLines[10] = "�Where, where are you?� he hollered down the halls.";
		williamLines[11] = "�I�ll do it,� King William sternly announced, �I�ll do the three biddings of yours.�";
		williamLines[12] = "�Here.�";
		williamLines[13] = "�I�ve done two of your biddings so far,� King William uttered, �hurry up and make your last request.�";
		williamLines[14] = "The thought occurred to him, �for what reason does a devil need gold?�";
		williamLines[15] = "�Haha, easy there, easy. Let�s go for a stroll, shall we?�";
		williamLines[16] = "�You, do you know-�";
		williamLines[17] = "�No� no!�";
		williamLines[18] = "�Dad. I-";
		williamLines[19] = "�I�� William could not respond.";
		williamLines[20] = "�Silence!�";
		williamLines[21] = "�No.�";
		williamLines[22] = "William was shocked, �was he putting up a front all this time?�";
		williamLines[23] = "He thought, �but why?�";
		williamLines[24] = "�Father, I�m so sorry, I didn�t know you felt that way��";
		williamLines[25] = "�Oh what have I done father, I�m sorry, I...�";
		williamLines[26] = "�F-Father I-I-I�m so sorry, I�m so...�";
		williamLines[27] = "�I-I�ve done all three of the tasks, please, take me to Amelia. Take me to my paradise,� he said so emotionlessly.";
	}
	
	public String getCrownColor() {
		return crownColor;
	}
	
	public double getCrownWeight(){
		return crownWeight;
	}
	
	public String getWilliamLine(int line) {
		return williamLines[line];
	}

}
