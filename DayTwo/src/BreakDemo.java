
public class BreakDemo {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			if(i==5) {
				break; // will break the current iteration and all the upcoming iterations
			}
			System.out.println(i);
		}

	}

}
