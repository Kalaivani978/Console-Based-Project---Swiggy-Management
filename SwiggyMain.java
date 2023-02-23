package ProjectSwiggyManagement;
/* This is the main class. Here is the program starting point. we have created the object for the scanner class to read
 * the input from the user.
 * 
 * object: we have created the object for the SwiggyBlueprint to access that class attributes and method.
 * 
 * UserInput: Based on the user choice we have performed the operation using switch loop.
 * 
 * 
 */

import java.util.Scanner;

public class SwiggyMain {
	
	private static Scanner scan = new Scanner(System.in);
	public static void toValidate() {
		SwiggyBlueprint obj = new SwiggyBlueprint();
		int user_Choice;   
		do {
			user_Choice = scan.nextInt();
			switch(user_Choice) {
			case 1: obj.toAddRestaurant();
			        break;
			case 2: obj.toDisplayRestaurant();
			        break;
			case 3:obj.toUpdateRestaurant(obj);
			       break;
			       
			case 4:obj.toSearchRestaurant(obj);
			          break;
			case 5:obj.toDeleteRestaurant(obj);
			          break;
			case 6: SwiggyBlueprint.toCallLogout();
			        break;
			default: System.out.println("You have entered the wrong choice");
			          break;
			}

		}while(user_Choice<=5);
		}
	
	
public static void main(String[] args) {
	System.out.println("Enter the username");
	String user_Name = scan.next();
	System.out.println("Enter the password");
	String pass_Word = scan.next();
	SwiggyBlueprint.toCheckLogin(user_Name, pass_Word);

}
}