package cyoaFinal;


public class CYOAObject {
	private String name;
	private String ship;
	
	public CYOAObject(String n, String s) {
		name = n;
		ship = s;
	}
	
	
	public String intro(){
		
		return "You are " + name + ", a pirate aboard the " + ship + ". "
				+ "You are going about you usual business when"
				+ " you see a ship on the horizen. What do you do, " + name + "? "
				+ "\n Enter the corrosponding number to choose an outcome."
				+ "\n 1: Tell the captain"
				+ "\n 2: Escape"
				+ "\n 3: Tell the crew"
				+ "\n 4: 'I'm sure it's fine'";
	}


	public String scenario1() {
		// TODO Auto-generated method stub
		return "You tell the captain about the ship, but they"
				+ " tell you not to worry about it. In no time"
				+ " at all, the other ship is attacking, and"
				+ "\n the " + ship + " goes down."
						+ "\n \n Try again? Type 'yes' to continue,"
						+ "\n or 'q' to quit: ";
	}


	public String scenario2() {
		// TODO Auto-generated method stub
		return "You take a dinghy and row to a safe distance away,"
				+ " watching the chaos ensue. But you feel something"
				+ " \n bump the bottom of your boat... What do you do, " + name + "?"
				+ "\n Enter the corrosponding number to choose an outcome."
				+ "\n 1: Get out of the boat"
				+ "\n 2: Row away!!"
				+ "\n 3: Do nothing"
				+ "\n 4: ASSERT DOMINANCE";
	}


	public String scenario3() {
		// TODO Auto-generated method stub
		return "You tell the crew about the ship, and they say that"
				+ " they noticed it as well. You collectively decide to"
				+ " take up arms and prepare for \n a fight. Unfortunately, "
				+ "you are quickly overwhelmed by the enemies, and the"
				+ " crew of the " + ship + " die in battle."
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}


	public String scenario4() {
		// TODO Auto-generated method stub
		return "You decide it's probably nothing, and go on with your"
				+ " day. However your blissful ignorance is interrupted"
				+ " when a \n cannonball sends you overboard! You died."
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}


	public String scenario21() {
		// TODO Auto-generated method stub
		return "You jump out into the water, and find that the object"
				+ " bumping the bottom of your boat was actually a "
				+ "very angry and hungry shark. Oops..."
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}


	public String scenario22() {
		// TODO Auto-generated method stub
		return "You row as fast as you can, but a sleek fin follows you,"
				+ " just poking out of the water. it catches up to you"
				+ " \n soon enough, and you become shark food!"
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}


	public String scenario23() {
		// TODO Auto-generated method stub
		return "You sit in the dinghy, ready to embrace death."
				+ " Eventually, half your boat is taken into"
				+ " the maw of a shark, and your legs with it."
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}


	public String scenario24() {
		// TODO Auto-generated method stub
		return "You yell and scream and even throw a few thing out"
				+ " of the boat. In your rage, you accidentally throw"
				+ " your rations overboard, \n and a shark comes by and"
				+ " snatches them up in it's maw. At least it's not hungry"
				+ " anymore..."
				+ "\n \n Try again? Type 'yes' to continue,"
				+ "\n or 'q' to quit: ";
	}
}
