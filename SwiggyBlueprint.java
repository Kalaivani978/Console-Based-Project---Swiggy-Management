package ProjectSwiggyManagement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*   This is the program for SwiggyManagement. Here we act as SwiggyManagement. Using this program we can add the  
 * restaurant to Swiggy, display all the restaurant list, update the restaurant details, search the restaurant or delete
 * the restaurant..
 * 
 * Attributes: To make more secure, we make the attributes as private and using encapsulation method, we have accessed.
 * 
 * List: Created one Arraylist to store the restaurant detail in inserted order basis. I have created the list as run
 * time polymorphism.
 * 
 * Here we used the No argument constructor and parameterized constructor as to display and set the user value.
 * 
 * Method: To perform specific operation in precise manner. we have created method for specific operation like 
 * add, delete, search, update, display.
 * 
 * toString: we have overridden this method from object class to display the restaurant list based on our format.
 */
public class SwiggyBlueprint {
	private String res_Name;
	private String own_Name;
	private int res_Id;
	private String food_Type;
	private byte price;
	private String location;
	private byte ratings;
	private static String  user_Name = "Kalaivani";
	private static String pass_Word = "Kalai@123";
	
	List<SwiggyBlueprint> restaurant = new ArrayList<SwiggyBlueprint>(); 
	
	Scanner scan = new Scanner(System.in);
	
	public SwiggyBlueprint() {
		System.out.println("Please choose the option 1.Add the Restaurant , 2. Display the Restaurant, 3. Update the Restaurant, 4. Search the Restaurant, 5.Delete the restaurant, 6.Log out");

	}
	public SwiggyBlueprint(String res_Name,String own_Name, int res_Id,String food_Type,byte price, String location, byte ratings) {
	this.res_Name= res_Name;
	this.own_Name = own_Name;
	this.res_Id= res_Id;
	this.food_Type = food_Type;
	this.location = location;
	this.price= price;
	this.ratings= ratings;
	
			
	}
	public String getRes_Name() {
		return res_Name;
	}
	public void setRes_Name(String res_Name) {
		this.res_Name= res_Name;
		
	}
	public String getOwn_Name() {
		return own_Name;
	}
	public void setOwn_Name(String own_Name) {
		this.own_Name= own_Name;
		
	}
	public int getRes_Id() {
		return res_Id;
	}
	public void setRes_Id(int res_Id) {
		this.res_Id= res_Id;
		
	}
	public String getFood_Type() {
		return food_Type;
	}
	public void setFood_Type(String food_Type) {
		this.food_Type= food_Type;
		
	}
	public byte getPrice() {
		return price;
	}
	public void setPrice(byte price) {
		this.price= price;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
		
	}
	public byte getRating() {
		return ratings;
	}
	public void setRating(byte ratings) {
		this.ratings= ratings;
		
	}
	public void toAddRestaurant() {
		System.out.println("Please enter the details to add your restaurant, enter the Restaurant name");
        String res_name = scan.next();
        System.out.println("Enter the Restaurant Id");
        int res_id= scan.nextInt();
        System.out.println("Enter the Owner name");
        String own_name= scan.next();
        System.out.println("Enter the food type either veg or nonveg");
        String food_type = scan.next();
        System.out.println("Enter the average  price");
        byte price = scan.nextByte();
        System.out.println("Enter the address");
        String location = scan.next();
        System.out.println("Enter the Ratings");
        byte rating = scan.nextByte();
        restaurant.add(new SwiggyBlueprint(res_name,own_name,res_id,food_type,price,location,rating));
	}
	public void toDisplayRestaurant() {
	//	System.out.println("Restaurant Lists are");
//        System.out.println(restaurant);

        Iterator<SwiggyBlueprint> iter = restaurant.iterator();
        while(iter.hasNext()) {
        	 System.out.println(iter.next());
        	 
        }
	}
	public void toUpdateRestaurant(SwiggyBlueprint obj) {
		System.out.println("Enter the employee id that you need to update");
	       int id = scan.nextInt();
	       int ctr = -1;
	       boolean flag = false;
	       Iterator<SwiggyBlueprint> it = restaurant.iterator();
	       while(it.hasNext()) {
	    	   ctr++;
	    	   obj = it.next();
	    	   if(obj.getRes_Id() == id) {
	    		 flag = true;
		         System.out.println("Please enter the updated details ");
		         System.out.println("Enter the restaurant name");
		         String res_name1 = scan.next();
	             System.out.println("Enter the Restaurant Id");
	             int res_id1= scan.nextInt();
	             System.out.println("Enter the Owner name");
	             String own_name1= scan.next();
	             System.out.println("Enter the food type wither veg or nonveg");
	             String food_type1 = scan.next();
	             System.out.println("Enter the average  price");
	             byte price1= scan.nextByte();
	             System.out.println("Enter the address");
	             String location1 = scan.next();
	             System.out.println("Enter the Ratings");
	             byte rating1 = scan.nextByte();
	             restaurant.set(ctr, new SwiggyBlueprint(res_name1,own_name1,res_id1,food_type1,price1,location1,rating1));
	    	     break ;
	    	     }
	    	     
	       }if(flag==false) {
	    	 System.out.println("Entered  id is incorrect. Please choose the option listed above");
	       }
	}
	public void toSearchRestaurant(SwiggyBlueprint obj) {
		System.out.println("Enter the restaurant id to search");
        boolean flag1 = false;
        int id1= scan.nextInt();
        Iterator<SwiggyBlueprint> it1 = restaurant.iterator();
        while(it1.hasNext()) {
      	  obj= it1.next();
      	  if(obj.getRes_Id()==id1) {
      		  flag1= true;
      		  System.out.println(obj);
      		  break;
      	  }
        }
       if(flag1==false) {
      	 System.out.println("Not in the list. Please choose the option listed above");
       }
	}
	public void toDeleteRestaurant(SwiggyBlueprint obj) {
		System.out.println("Enter the restaurant id to delete");
        boolean flag2 = false;
        int id3 = scan.nextInt();
        Iterator<SwiggyBlueprint> it2 = restaurant.iterator();
        while(it2.hasNext()) {
       	obj= it2.next();
      	if(obj.getRes_Id()==id3) {
      		flag2= true;
      		restaurant.remove(obj);
      		System.out.println("Deleted Successfully");
      		break;
      	}
        }
        if(flag2 == false) {
      	  System.out.println("Entered id is incorrect. Please choose the option listed above");
        }
	}
	public static void toCheckLogin(String username, String password) {
		if(user_Name.equals(username) && pass_Word.equals(password)){
			SwiggyMain.toValidate();
		}
		else {
			System.out.println("UserName/Password is incorrect");
		}
	}
	public static void toCallLogout() {
		System.out.println("Logged Out Successfully");
	}
	@Override
	public String toString() {
		return "SwiggyBlueprint [res_Name=" + res_Name + ", own_Name=" + own_Name + ", res_Id=" + res_Id
				+ ", food_Type=" + food_Type + ", price=" + price + ", location=" + location + ", ratings=" + ratings
				+ "]";
	}
	
	
}
