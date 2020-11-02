package practis1;

import java.util.Scanner;


public class Pencil {
	Scanner in = new Scanner(System.in);

	private double lenOfPencil;
	private String nameOfcomp;
	
	public Pencil(String nameOfcomp,double lenOfPencil) {
		
		if (lenOfPencil>0) {
			this.lenOfPencil = lenOfPencil;
		}
		else {
			System.out.println("try agin "+lenOfPencil + " is invalid");
		}

		this.nameOfcomp = nameOfcomp;
	}

	public double getLenOfPencil() {
		return lenOfPencil;
	}

	public void setLenOfPencil(double lenOfPencil) {
		if (lenOfPencil<this.lenOfPencil) {
			this.lenOfPencil = lenOfPencil;
		}
		else {
			System.out.println("try agin");
		}
		
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Pencil) {
			Pencil p = (Pencil)obj;
			if (p.lenOfPencil == this.lenOfPencil && p.nameOfcomp.equals(this.nameOfcomp)) {
				return true;
			}
		}
		return false;
	}
	
	public void sharpen(double x)
	{
		if (this.lenOfPencil - x>0) {
			lenOfPencil -= x;
		}
		else {
			System.out.println("to short you cut your hand");
		}
	}
	public String toString()
	{
		return "nameOfcomp: "+nameOfcomp+",lenOfPencil: "+lenOfPencil;
	}
	
}
