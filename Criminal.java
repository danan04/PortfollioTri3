
import java.util.ArrayList;

/*
 * Criminal class
 */
public class Criminal extends Generics {
	/*
	 * fields
	 * 
	 */
	public static final String type = "Criminal";

	public enum KeyType {
		combo, name, age, height, gender, hair, state, crime, other
	};

	public static KeyType key = KeyType.combo;
	private String name;
	private int age;
	private String height;
	private String gender;
	private String hair;
	private String state;
	private String crime;
	private String other;

	/*
	 * constructor
	 * 
	 */
	public Criminal(String n, int a, String ht, String g, String ha, String s, String c, String o) {
		this.setType(type);
		this.name = n;
		this.age = a;
		this.height = ht;
		this.gender = g;
		this.hair = ha;
		this.state = s;
		this.crime = c;
		this.other = o;
	}

	/*
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() {
		String output = "";
		switch (key) {
		case name:
			output += this.name;
			break;
		case age:
			output += "000" + this.age;
			output = output.substring(output.length() - 3);
			break;
		case height:
			output += this.height;
			break;
		case gender:
			output += this.gender;
			break;
		case hair:
			output += this.hair;
			break;
		case state:
			output += this.state;
			break;
		case crime:
			output += this.crime;
			break;
		case other:
			output += this.other;
			break;
		case combo:
		default:
			output += type + ": " + this.name + ", " + this.age + ", " + this.height + ", " + this.gender + ", "
					+ this.hair + ", " + this.state + ", " + this.crime + ", " + this.other;
		}
		return output;

	}

	/*
	 * Initialize Criminal data If age is unknown "00"
	 */
	public static Generics[] criminalData() {
		Generics[] ad = {
				new Criminal("Catherine Gu", 17, "5'4''", "F", "black", "CA", "Annoying Sravani",
						"Last Seen: Over a Zoom call"),
				new Criminal("Sravani", 18, "5'5''", "F", "black", "CA", "Not being helpful",
						"Last seen: On a Zoom call"),
				new Criminal("unknown", 00, "?", "M", "blue", "?", "Stealing zarfs from Starbucks",
						"Last seen: Starbucks"),
				new Criminal("Bob Joe", 23, "?", "M", "brown", "?",
						"Selling a Psychrolutes marcidus at a local pet store",
						"Last seen: Bob's Absolutely Normal Pet Store"),
				new Criminal("Jane Doe", 32, "?", "F", "brown", "?", "Attempting to feed a Wunderpus photogenicus",
						"Last seen: Pacific Ocean"),
				// new Criminal()
		};
		return ad;
	}

	public static ArrayList<Generics> criminalData2() {
		ArrayList<Generics> ad = new ArrayList<Generics>();
		ad.add(new Criminal("Catherine Gu", 17, "5'4''", "F", "black", "CA", "Annoying Sravani",
				"Last Seen: Over a Zoom call"));
		ad.add(new Criminal("Sravani", 18, "5'5''", "F", "black", "CA", "Not being helpful",
				"Last seen: On a Zoom call"));
		ad.add(new Criminal("unknown", 00, "?", "M", "blue", "?", "Stealing zarfs from Starbucks",
				"Last seen: Starbucks"));
		ad.add(new Criminal("Bob Joe", 23, "?", "M", "brown", "?",
				"Selling a Psychrolutes marcidus at a local pet store",
				"Last seen: Bob's Absolutely Normal Pet Store"));
		ad.add(new Criminal("Jane Doe", 32, "?", "F", "brown", "?", "Attempting to feed a Wunderpus photogenicus",
				"Last seen: Pacific Ocean"));
		// new Criminal()
	return ad;
}

	/*
	 * main to test Criminal class
	 * 
	 */
	public static String main(String[] args) {
		Generics[] ad = criminalData();

		for (Generics a : ad)
			System.out.println(a);

		String list = "";
		for(int i = 0; i < ad.length; i++)
		{
			System.out.println(ad[i]);
			list += ad[i] + "\n";
		}
		return list;
	}

}
