package mats;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int main_sum=0;
		
		int[] mat[] = new int[3][3];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < mat.length; i++) {
			System.out.print("|");
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"|");
			}
			System.out.println();
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i==j) {
					main_sum+=mat[i][j];
				}
			}
		System.out.println(main_sum);
	}
	}
}
