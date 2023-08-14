
public class SwitchDemo {

	public static void main(String[] args) {
		char x = 'l';
		switch(x) {
		case 'l':
		case 'L':
			System.out.println("X is a letter");
			break;
		case 'd':
		case 'D': 
			System.out.println("X is a digit");
			break;
		default:
			System.out.println("X is neither letter nor a digit");
		}

	}

}
