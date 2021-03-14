/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for Subjects
 */
import java.util.*;

public class Subjects extends Characters {
	private ArrayList<String> subjectsLines = new ArrayList<>();;

	public Subjects(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	}

	public void giveLines() {
		subjectsLines.add("“All hail the king!”");
		subjectsLines.add("“I heard he single handedly ended the war,” a nearby peasant whispered.");
		subjectsLines.add("“Yeah, and I heard he is also responsible for the prosperity of our beloved kingdom, Lebenstein,” another added.");
		subjectsLines.add("“H-handsome!”");
		subjectsLines.add("“Ahh, how dreaded! It’s time for the imperial army to collect taxes again! Whatever happened to our great King William?”");
		subjectsLines.add("“King William? We have no need for such a greedy king! Ever since that time he emerged victorious, he’s been robbing us. Does he not understand that a king is not a king without a kingdom?”");
		subjectsLines.add("“You, it’s your fault!”");
		subjectsLines.add("“Abdicate! Abdicate! Abdicate!”");
		
	}

	public String getSubjectsLine(int line) {
		return subjectsLines.get(line);
	}
}
