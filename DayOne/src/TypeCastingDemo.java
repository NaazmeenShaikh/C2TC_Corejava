
public class TypeCastingDemo {

	public static void main(String[] args) {
		//type casting refers to converting one data type in another data type.
		byte i=10;//converting smaller type to larger data type(widening casting or implicit)
		int id=i;//it is default
		System.out.println(i);
		System.out.println(id);
		
		
		float num=20.56f;//converting higher to smaller data type(narrowing casting or explicit)
		int val=(int)num;
		System.out.println(num);
		System.out.println(val);
	}

}
