import java.util.*;

public class inheritques {
	public static void main(String[] args) {
	   
	    car Object1 = new car();
	    bike Object2 = new bike();
	    vehicles Object = new vehicles();
		
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter the number of wheels");
		int wh = var.nextInt();
		
		switch(wh) {
		case 2 : 
			Object2.Display();
		break;	
		
		case 4 : 
			Object1.Display();
			break ;
		default:
			Object.Display();
			
			
		}
	 }
	

}
