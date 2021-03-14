/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for William
 */

import java.util.*;

public class William extends Characters {
	private String crownColor;
	private double crownWeight;
	private ArrayList<String> williamLines = new ArrayList<>();

	public William(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	    crownColor = "yellow";
	    crownWeight = 1.2;
	}

	public William(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender, String crownColor,
			double crownWeight) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
		this.crownColor = crownColor;
		this.crownWeight = crownWeight;
	}

	public void giveLines() {
		williamLines.add("“Oh, General Amelia... oh how much I loved you. Your dark crimson red eyes glistening in the moonlight, your pale skin that even goddesses envy, your wild, short, dark black hair fluttering in the wind, that attractively kind smile you put on when you greet me. That petit character and those bright pink lips,”  William cried.");
		williamLines.add("“If not for this wretched war torn country, I would have wed you with no doubt. Oh how cruel tis world is! Oh how cruel!”");
		williamLines.add("“Oh how much I want to go back to those days of bliss, where we would comfort each other to sleep, sharing our warmth with each other. Now what was once the love of my life, has become a frozen corpse.”");
		williamLines.add("“How much I want to go back to the days where we would stroll through the forest, a circlet of flowers hanging loosely on your head as you laughed so foolishly. The spring breeze tingling our skin, the sound of the river flowing through the woods, the beautiful melody of the birds echoing through the forest… is there anything I can do? Oh, the things I’d give up just to see you again.”");
		williamLines.add("“Who’s there?”");
		williamLines.add("King William chuckled, “what you can offer? Such impudence. Leave, before I make you.”");
		williamLines.add("King William’s eyes widened, “you… how do you know of her? Speak!”");
		williamLines.add("King William sneered at the man’s remark, “even God does not play with the dead. No, no, you must be the devil! You seek to take advantage of my distraught soul, I shall not give in to your words of temptation.”");
		williamLines.add("“Amelia... what’s the point of living if it’s without you?”");
		williamLines.add("“‘Till death do us part… but it was I! It was I who did us apart! Don’t worry Amelia, I’ll fix this mistake.”");
		williamLines.add("“Where, where are you?” he hollered down the halls.");
		williamLines.add("“I’ll do it,” King William sternly announced, “I’ll do the three biddings of yours.”");
		williamLines.add("“Here.”");
		williamLines.add("“I’ve done two of your biddings so far,” King William uttered, “hurry up and make your last request.”");
		williamLines.add("The thought occurred to him, ‘for what reason does a devil need gold?’");
		williamLines.add("“Haha, easy there, easy. Let’s go for a stroll, shall we?”");
		williamLines.add("“You, do you know-”");
		williamLines.add("“No… no!”");
		williamLines.add("“Dad. I-");
		williamLines.add("“I…” William could not respond.");
		williamLines.add("“Silence!”");
		williamLines.add("“No.”");
		williamLines.add("William was shocked, ‘was he putting up a front all this time?’");
		williamLines.add("He thought, ‘but why?’");
		williamLines.add("“Father, I’m so sorry, I didn’t know you felt that way…”");
		williamLines.add("“Oh what have I done father, I’m sorry, I...”");
		williamLines.add("“F-Father I-I-I’m so sorry, I’m so...”");
		williamLines.add("“I-I’ve done all three of the tasks, please, take me to Amelia. Take me to my paradise,” he said so emotionlessly.");
	}
	
	public String getCrownColor() {
		return crownColor;
	}
	
	public double getCrownWeight(){
		return crownWeight;
	}
	
	public String getWilliamLine(int line) {
		return williamLines.get(line);
	}

}
