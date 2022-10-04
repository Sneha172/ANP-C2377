package question3;

public class Swap {
	public static void main(String[] arg) {
		int a= 1;
		int b=2;
		System.out.println("Values before swaping:"+"a="+ a +", b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values after swaping:"+"a="+ a +", b="+b);
	}
}
