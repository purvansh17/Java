
public class javaexception {

	public static void main(String args[]){  
	try{  
	//code that may raise exception
	int data=100/0;  
	}catch(ArithmeticException error){System.out.println(error);}  
	 //rest code of the program   
	System.out.println("rest of the code...");  
	 }  
	}  
