
public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		System.out.println("The largest number is:");
//		Entry Controlled Loop
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(c>b) {
				System.out.println(c);
			}else {
				System.out.println(b);
			}
		}
	}

}
