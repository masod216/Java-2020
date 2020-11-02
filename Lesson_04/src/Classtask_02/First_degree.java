package Classtask_02;

public class First_degree extends Student{
	
	private int degree_cost;

	public First_degree(int id, String name, int degree_cost) {
		super(id, name);
		this.degree_cost = degree_cost;
	}

	public int getDegree_cost() {
		return degree_cost;
	}

	public void setDegree_cost(int degree_cost) {
		this.degree_cost = degree_cost;
	}

	@Override
	public String toString() {
		return "First_degree [degree_cost=" + degree_cost + ", toString()=" + super.toString() + "]";
	}
	
	
}
