package backpack;

public class Athlete {

	  static int nextBibNumber;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athlete (String name, int speed, int bibnumber){
	     this.name = name;
	     this.speed = speed;
	     this.bibNumber=bibnumber;
	}

	public static void main(String[] args) {
		Athlete athlete= new Athlete("Bob",5,6);
	    System.out.println(athlete.name);
	    System.out.println(athlete.bibNumber);
	    System.out.println(athlete.raceLocation);
	    
	    
	    Athlete athlete2= new Athlete("jake",6,7);
	    System.out.println(athlete2.bibNumber);
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	}
}
