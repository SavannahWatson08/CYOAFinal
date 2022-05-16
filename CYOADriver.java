package cyoaFinal;
import java.util.*;
public class CYOADriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		System.out.println("Enter a name: ");
		String nm = input.next();
		System.out.println("Enter a pirate ship name: ");
		String shipName = input.next();
		while(cont == true) {
		boolean savePoint = false;
		CYOAObject story = new CYOAObject(nm, shipName);
		System.out.println(story.intro());
		int option1 = input.nextInt();
		if(option1 == 1) {
			System.out.println(story.scenario1());
			String con = input.next();
		if (con.equals("q")){
			cont = false;
		}
		
		}
		else if(option1 == 2){
			savePoint = true;
		while(savePoint == true) {
		System.out.println(story.scenario2());
		int option2 = input.nextInt();
		if(option2 == 1) {
			System.out.println(story.scenario21());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
				savePoint = false;
		}
		}	
		else if(option2 == 2) {
			System.out.println(story.scenario22());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
				savePoint = false;
		}
		}
		else if(option2 == 3) {
			System.out.println(story.scenario23());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
				savePoint = false;
		}
		}
		else if(option2 == 4) {
			System.out.println(story.scenario24());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
				savePoint = false;
		}
		}
		else {
			System.out.println("That's not an option, try again!\n");
		}
		}
		}
		else if(option1 == 3) {
			System.out.println(story.scenario3());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
		}
		}
		else if(option1 == 4) {
			System.out.println(story.scenario4());
			String con = input.next();
			if (con.equals("q")){
				cont = false;
		}
		}
		else {
			System.out.println("That's not an option, try again!\n");
		}
	}

}
}
