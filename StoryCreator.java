
public class StoryCreator {

	public static void main (String []args) {
	
		
		//Part 1: Creating the Characters and Setting
		William william = new William("blonde", "azure blue", 193.04, 100.70, "alive", "muscular",
				                       26, "charming", "fair", "William", "male");
		Subjects subj1 = new Subjects("black", "brown", 170.5, 70.5, "alive", "average", 
				                       30, "good-natured", "fair", "Bob", "male");
		Subjects subj2 = new Subjects("black", "brown", 170.5, 70.5, "alive", "average", 
				                       30, "good-natured", "fair", "John", "male");
		Subjects subj3 = new Subjects("black", "brown", 140.60, 50, "alive", "average", 
				                       25, "good-natured", "fair", "Mary", "female");
	    Narrator nar = new Narrator();
	    Setting part1Kingdom = new Setting();
	    
	    //Part 1: Giving the Characters their Lines
		william.giveLines();
	    subj1.giveLines();
	    subj2.giveLines();
	    subj3.giveLines();
	    nar.giveLines();

		//Part 1: The Story
	    System.out.println("Part 1\n");
		System.out.println(subj1.getSubjectsLine(0) + " " + nar.getNarratorLine(0));
		System.out.println(nar.getNarratorLine(1) + " " + nar.getNarratorLine(2));
        System.out.println(nar.getNarratorLine(3) + " ");
        System.out.println(nar.getNarratorLine(4));
        System.out.println(nar.getNarratorLine(5) + " ");
        System.out.println(subj1.getSubjectsLine(1));
        System.out.println(subj2.getSubjectsLine(2) + " ");
        System.out.println(nar.getNarratorLine(6));
        System.out.println(nar.getNarratorLine(7) + " ");
        System.out.println(nar.getNarratorLine(8));
        System.out.println(subj3.getSubjectsLine(3) + " " + nar.getNarratorLine(9));
        System.out.println(nar.getNarratorLine(10) + " " + nar.getNarratorLine(11));
        
	}
}


