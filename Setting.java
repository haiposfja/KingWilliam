/* George Chen and Ryken Santillan
 * Ms. Krasteva
 * 3/14/2021
 * Class to create setting objects
 */

public class Setting {

	//private variables that define a setting
	private String timeOfDay;
	private String weather;
	private String size;
	private String material;
	private String location;
	private int year;
	private String placeName;

	public Setting() { // default constructor
		timeOfDay = "morning";
		weather = "sunny";
		size = "colossal";
		material = "stone and gold";
		location = "northwestern area";
		year = 635;
		placeName = "Kingdom of Lebenstein";
	}

	public Setting(String timeOfDay, String weather, String size, String material, String location, int year, String placeName) {
		this.weather = weather;
		this.size = size;
		this.material = material;
		this.location = location;
		this.year = year;
		this.placeName = placeName;

	}

	//method that returns the time of day
	public String getTOD() {
		return timeOfDay;
	}
	
	//method that returns the weather of the setting
	public String getWeather() {
		return weather;
	}

	//method that returns the general size of the setting
	public String getSize() {
		return size;
	}

	//method that returns the materials of a setting
	public String getMaterial() {
		return material;
	}

	//method that returns the location of the setting
	public String getLocation() {
		return location;
	}
	
	//method that returns the year / time period of the setting
	public int getYear() {
		return year;
	}
	
    //method that returns the name of the place of the setting
	public String getplaceName() { 
		return placeName;
	}
}

