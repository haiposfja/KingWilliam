/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Subclass of Characters for Narrator
 */

import java.util.*;
public class Narrator extends Characters {
	private ArrayList<String> narratorLines = new ArrayList<>();

	public Narrator(String hairColor, String eyeColor, double height, double weight, String status, String physique,
			int age, String personality, String complexity, String name, String gender) {
		super(hairColor, eyeColor, height, weight, status, physique, age, personality, complexity, name, gender);
	}

	//adds all the narrator's lines
	public void giveLines() {
		narratorLines.add("The buzzing of trumpets rang throughout the kingdom as countless subjects cheered for their king.");
		narratorLines.add("It was supposed to be a great day for King William.");
		narratorLines.add("He had recently returned from the frontline and emerged victorious.");
		narratorLines.add("Cheers awaited at every turn, as he rode throughout the kingdom on his majestic steed, Percy.");
		narratorLines.add("Percy could be described as a perfect match for King William.");
		narratorLines.add("She shone a brilliant hue of white, and complemented the natural beauty of the king.");
		narratorLines.add("Rumors of his valiant achievements were now the hot talk of his subjects, but they were only second to his arsenal.");
		narratorLines.add("King William’s appearance itself was a display of the world’s unfairness.");
		narratorLines.add("His long, silky, blonde hair that trickled down to his waist, coupled with the piercing-cold, azure blue eyes of his were the dream of every love-seeking maiden.");
		narratorLines.add("The yelps of admiration from many ladies in love matched the importance of his achievements.");
		narratorLines.add("However, under that charismatic smile of William’s, lay a dark secret.");
		narratorLines.add("One that no one has seen.");
		narratorLines.add("Just as William arrived at his chambers, his strong willed, charismatic character broke down.");
		narratorLines.add("Shattered, just like that.");
		narratorLines.add("Amelia was a general of the enemy kingdom and William’s sole lover. ");
		narratorLines.add("They would meet secretly in a cabin in the woods and waste their youth away.");
		narratorLines.add("A forbidden love, if you may.");
		narratorLines.add("But nothing good lasts forever.");
		narratorLines.add("Soon enough, war broke out and off to war William went.");
		narratorLines.add("He fought gallantly, taking the lead in the battle.");
		narratorLines.add("Drawing an arrow, he struck the enemy general straight in the heart.");
		narratorLines.add("It was then that he discovered he had felled none other than his lover, Amelia.");
		narratorLines.add("Out of all of the generals, out of all the soldiers of the enemy kingdom, he killed the only one that he loved.");
		narratorLines.add("William dragged his feet, and stared into a mirror. In his reflection stood Amelia, smiling gently.");
		narratorLines.add("Tears poured out of William’s eyes, leaving a puddle to gather on the hardwood floor.");
		narratorLines.add("King William spun around, only to find a pale man nested onto his lavish red couch.");
		narratorLines.add("His jet black hair contrasted his albino-like skin, although it did match the dull black hue of his eyes.");
		narratorLines.add("The man gave off an eerie vibe like no other; even King William whose senses were sharpened by countless battles and wars felt an unknown fear of the presence nearby.");
		narratorLines.add("He slightly drew the sword that hung at his waist as his thumb pressed gently against the hilt.");
		narratorLines.add("A slight push revealed the sharp gleam of his blade.");
		narratorLines.add("The figure spoke, rubbing his chin like a wise elder.");
		narratorLines.add("A devilish smile stretched across the ends of the man's face, showcasing his shark-like teeth.");
		narratorLines.add("Instead of disappearing, the man stood upright, greeting King William’s stern look with a malicious demeanor");
		narratorLines.add("Days passed as King William silently grieved in solitude.");
		narratorLines.add("Each day without his secret lover further dug into the hole in his heart.");
		narratorLines.add("He sought alcohol, but his clouded judgement only made the devil’s words clearer.");
		narratorLines.add("He sought the materialistic possessions that brought smiles upon his fellow nobles, but it only made him realize that these treasures paled in comparison to the treasure he desired  — Amelia.");
		narratorLines.add("King William threw himself onto his bed, letting the drowsiness of the day and the ringing noise from the previous party lull him to sleep.");
		narratorLines.add("As he slept with a turbulent mind, he dreamed of his fair maiden.");
		narratorLines.add("This was their first meeting.");
		narratorLines.add("King William wasn’t born charismatic, nor was he raised charismatic.");
		narratorLines.add("As the first prince of a struggling kingdom, he shouldered the burden of the success of the kingdom.");
		narratorLines.add("His life consisted of laborious training and the overseeing of the land.");
		narratorLines.add("Such a dull lifestyle gave birth to William, the stone-faced, cold prince.");
		narratorLines.add("But everything changed after meeting Amelia.");
		narratorLines.add("She melted his frozen heart; taught him how to smile.");
		narratorLines.add("Countless memories rushed through his sleeping mind:");
		narratorLines.add("King William jolted up from his bed as cold sweat ran down the sides of his forehead.");
		narratorLines.add("King William sprinted from his bed and began to search everywhere.");
		narratorLines.add("Suddenly, a sharp laughter erupted from behind.");
		narratorLines.add("The man wore the same sinister smile as he did during their first encounter.");
		narratorLines.add("4 months have passed since King William accepted the deal of the devil.");
		narratorLines.add("King William brought upon the table a large treasure chest full of gold.");
		narratorLines.add("The devil snickered evilly as its eyes shone as bright a yellow as the sun at noon.");
		narratorLines.add("His rough voice displayed his impatience and anger.");
		narratorLines.add("He was not happy with what he had done.");
		narratorLines.add("The devil’s first bidding had forced an increase in the taxation of his subjects.");
		narratorLines.add("As a result, many starved to death.");
		narratorLines.add("It pained William to see his subjects suffer as such, but his tapered judgement only saw it as a small sacrifice for a greater cause.");
		narratorLines.add("The second bidding was to offer this gold to the devil.");
		narratorLines.add("King William cocked an eyebrow as the devil greedily devoured the gold.");
		narratorLines.add("Clenching his fists, William managed to put out a slight nod.");
		narratorLines.add("He exited promptly, perching atop his trusty steed, Percy.");
		narratorLines.add("Percy neighed in response, and began to gallop towards the outskirts of the kingdom.");
		narratorLines.add("As he meandered around, his eyes drooped reflexively.");
		narratorLines.add("What was once a beautiful, prosperous kingdom decorated with gold and flourishing with complex architecture now looked like a refuge for the beggars.");
		narratorLines.add("A woman swiftly approached King William");
		narratorLines.add("She screamed as she stabbed Percy ruthlessly through the head with a sharp object, dispatching the creature with a single strike.");
		narratorLines.add("As William stumbled and dismounted his loyal steed, he boiled with rage.");
		narratorLines.add("However, his words were taken from his throat as he witnessed the scene before him.");
		narratorLines.add("His subjects were malnourished, the woman who killed his steed was clutching her dead child as tears streamed endlessly down her cheeks.");
		narratorLines.add("Does his horse even compare to the value of a loved one?");
		narratorLines.add("It didn’t take King William long enough to realize the mess he created.");
		narratorLines.add("Was this the kingdom he wished to create?");
		narratorLines.add("Not only did he rob the life of the one he loved, he was doing the same to many others.");
		narratorLines.add("He began to shiver and his mind entered a delusional state.");
		narratorLines.add("His vision became hazy.");
		narratorLines.add("It was only a matter of time before a large number of his subjects gathered around him.");
		narratorLines.add("They chanted the words like fanatical cultists, but they were right.");
		narratorLines.add("He didn’t deserve to be king.");
		narratorLines.add("The wind blew gently as it lightly ruffled the shirt strapped around William.");
		narratorLines.add("It has now been a year.");
		narratorLines.add("He was forcefully removed from the throne, and his family members were burnt at the stake.");
		narratorLines.add("Luckily, he managed to escape alongside his father, the two of them residing in the cabin that once used to be the hideout for William and Amelia’s secret ventures.");
		narratorLines.add("William’s father threw the glass of tea William had prepared for him, as he coughed out blood violently.");
		narratorLines.add("He continued to cough out blood violently as William rushed to assist him.");
		narratorLines.add("He slowly exited the room as he pulled on the greying strands of his hair.");
		narratorLines.add("William punched through a wooden plank, the edge of his knuckles bleeding.");
		narratorLines.add("The third bidding was simple.");
		narratorLines.add("All William had to do was to kill his own father.");
		narratorLines.add("William shook his head fervently, attempting to resist the devil’s temptation.");
		narratorLines.add("William looked at the knife in his hand with fear in his eyes.");
		narratorLines.add("Was he set on doing it?");
		narratorLines.add("He approached his father’s room, listening to his rumblings.");
		narratorLines.add("William reluctantly opened the door, with the still knife in clear view.");
		narratorLines.add("He was cut off.");
		narratorLines.add("His father exclaimed angrily, breaking a flowerpot nearby.");
		narratorLines.add("This boiled William’s blood.");
		narratorLines.add("In the heat of the moment William lunged forward and thrusted the knife through his father’s chest.");
		narratorLines.add("The crunching of bones was not a novelty, but for some reason he couldn’t get rid of the guilt from this one.");
		narratorLines.add("He stared at the blood trickling down his fingers.");
		narratorLines.add("And then it struck him.");
		narratorLines.add("His father’s hand brushed upon his cheeks before it dropped.");
		narratorLines.add("His father’s body became limp, as the color drained from his skin like a wilted flower.");
		narratorLines.add("All that was left was a smile, the happiness his father felt right before he died, his son actually cared for him.");
		narratorLines.add("William fell to his knees, his hands shaking from the distraught.");
		narratorLines.add("But he had to get this out of his head.");
		narratorLines.add("He has accomplished the devils tasks.");
		narratorLines.add("He is finally free from the devil.");
		narratorLines.add("A man who used all the people around him, he knew he didn’t deserve it after all he had done.");
		narratorLines.add("He knew that he was grasping at straws.");
		narratorLines.add("William wished that all of this was just a dream.");
		narratorLines.add("He would wake up beside Amelia the next day and everything would be back to what it used to be.");
		narratorLines.add("His father greeting him in the dining hall; his loyal attendees serving him the finest of dishes.");
		narratorLines.add("And as he walks out into the Kingdom of Lebenstein, he is welcomed with smiles and cheers.");
		narratorLines.add("The gold plating across the kingdom and the amazing architect that was used for the design.");
		narratorLines.add("A prosperous kingdom with a charismatic hard working king.");
		narratorLines.add("However, his heart sunk at the devil’s ominous grin.");
		narratorLines.add("William suddenly felt a sharp pain in his chest.");
		narratorLines.add("An arrow was pierced straight through his heart, the exact one that had killed his lover.");
		narratorLines.add("As he dragged his feet in a futile attempt to escape, he caught a glimpse of his reflection in a cracked mirror.");
		narratorLines.add("Sharp horns, dyed in blood, and an evil smile.");
		narratorLines.add("All along, he had not dealt with the devil, he became the devil.");
	}

	//returns a specific narrator line
	public String getNarratorLine(int line) {
		return narratorLines.get(line);
	}
}
