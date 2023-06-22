package greatestnumber;

public class Greatestnumber {
	public static void main(String[] args) {
		byte a=25, b=78, c=87;
		if(a>b&&b>c) {
			System.out.println("A is the largest number: "+a);
		}else if (b>c&&c>a) {
			System.out.println("B is the largest number: "+b);
		}else {
			System.out.println("C is the largest number: "+c);
		}
	}

}
