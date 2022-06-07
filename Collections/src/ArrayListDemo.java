import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.print("List " + list);
		
		list.add(3, 4);
		
		System.out.print("List " + list);
		
	}
}
