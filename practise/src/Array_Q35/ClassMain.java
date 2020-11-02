package Array_Q35;

import java.util.ArrayList;

public class ClassMain {
	
	private static ArrayList<Integer> X_index(int[] arr, int X) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int start_i=0,end_i=0;
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (X == arr[i]) {
				end_i = i;
				if (flag==false) {
					start_i = i;
					flag = true;
				}
			}
		}
		
		for (int i = start_i+1; i < end_i; i++) {
			arrayList.add(arr[i]);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,3,5,7,3,5,7,9,4,2,4,3,7,9,0,7,6,11,1};
		System.out.println(X_index(arr, 3));
	}

}
