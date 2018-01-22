import java.util.*;
public class cmdarg{
	public static void main(String[] args) {
	int a,b,c;
	double res;
	a= Integer.parseInt(args[0]);
	b= Integer.parseInt(args[1]);
	c= Integer.parseInt(args[2]);
	res=(a/b)*(b/c);
	System.out.println("Result= "+res);	
	}
}