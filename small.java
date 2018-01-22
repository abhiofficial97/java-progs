import java.util.*;
public class small{
	public static void main(String[] args) {
		int a,b,c,res;
		System.out.println("Enter 3 numbers");
		Scanner s = new Scanner(System.in);
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		if (a<b && a<c) {
				res=a;
			}
		else if (b<c) {
				res=b;
			}
		else res=c;	
		System.out.println("The smallest of the three numbers is "+res);
	}
}