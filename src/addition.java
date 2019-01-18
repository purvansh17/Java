import java.util.Scanner;

public class input {
public static void main(String args[]) {
	Scanner no = new Scanner(System.in);
	double fnum;
	double snum;
	double answer;
	System.out.println("Enter first num:");
	fnum = no.nextDouble();
	System.out.println("Enter second num:");
	snum = no.nextDouble();
	answer = fnum + snum;
	System.out.print("The answer is ");
    System.out.println(answer);
	//System.out.print(no.nextLine());
    }
}
