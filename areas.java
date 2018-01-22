import java.util.*;
public class areas{
	public static void main(String[] args) {
		System.out.println("What would you like to do?");
		System.out.println("Press 0 for area of circle");
		System.out.println("Press 1 for area of rectanle");
		System.out.println("Press 2 for area of square");
		System.out.println("Press 3 for area of sphere");
		Scanner s = new Scanner(System.in);
		int a;
		double area,p=3.14;
		a=s.nextInt();
		switch (a) {
			case 0:{
				System.out.println("Enter radious");
				int r;
				r=s.nextInt();
				area=r*r*p;
				System.out.println("Area= "+area);
				break;
			}
			case 1:{
				System.out.println("Enter lenght");
				int l,b;
				l=s.nextInt();
				System.out.println("Enter breadth");
				b=s.nextInt();
				area=l*b;
				System.out.println("Area= "+area);
				break;
			}
			case 2:{
				System.out.println("Enter side");
				int si;
				si=s.nextInt();
				area=si*si;
				System.out.println("Area= "+area);
				break;
			}
			case 3:{
				System.out.println("Enter radious");
				int r;
				r=s.nextInt();
				area=4*r*r*p;
				System.out.println("Area= "+area);
				break;
			}
		}
	}
}