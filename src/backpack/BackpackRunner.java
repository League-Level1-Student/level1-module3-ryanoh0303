package backpack;

public class BackpackRunner {
	
	
	public static void main(String[] args) {
		Backpack back= new Backpack();
		
		Pencil pencil= new Pencil();
	    
		
		back.putInBackpack(pencil);
	
		Ruler ruler= new Ruler();
		back.putInBackpack(ruler);
		
		
		Textbook textbook= new Textbook();
     	back.putInBackpack(textbook);
		
		
		
		back.packAndCheck();
	}
}
