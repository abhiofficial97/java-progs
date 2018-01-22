import java.util.*;
public class voters{
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the age of the person");
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		if (a>=18) {
			System.out.println("Individual can vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	}
}