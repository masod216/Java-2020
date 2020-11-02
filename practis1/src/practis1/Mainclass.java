package practis1;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p1 = new Pencil("a", 5.3);
		Pencil p2 = new Pencil("a", -5.3);
		Pencil p3 = new Pencil("a", 5.3);
		
		ColorPencil cp1 = new ColorPencil("Blue","a", 5.3);
		ColorPencil cp2 = new ColorPencil("Green","a", -5.3);
		ColorPencil cp3 = new ColorPencil("Blue","a", 5.3);
		
		///System.out.println(p1.equals(p2));
		System.out.println(cp1.equals(cp3));

	}

}
