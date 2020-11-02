package arrlist;
import java.util.ArrayList;
public class ClassMain {

	public static void main(String[] args) {
		
		String name;

		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("zev");
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("");
		System.out.println(arr.size()); //len of cells
		System.out.println(arr);
		
		arr.remove(2); //"b"
		
		System.out.println(arr);
		
		arr.set(2, "yo"); //reset that cell
		
		System.out.println(arr);
		
		name = arr.get(2); // gets that cell == arr[2]
		System.out.println(name);
		System.out.println(arr.size());
	}

}
