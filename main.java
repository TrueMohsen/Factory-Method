package PostGame;
import java.util.Scanner;

public class main {

	private static Mail mail;
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
	    String enemyShipOption="";
	    System.out.println("Plane(P) or Truck(T)? ");
	    
	    if (userInput.hasNextLine()) {
        	enemyShipOption=userInput.nextLine();
        	System.out.println("you entered "+enemyShipOption);
        	if(enemyShipOption.equalsIgnoreCase("P")) {
        		mail = new AirMailService();
			}else if(enemyShipOption.equalsIgnoreCase("T")) {
				mail  = new GroundMailService();
			}   
        } 
        
	    mail.newMailService();
		

	}

}
