package Classtask_02;

public class Third_degree extends Second_degree{

	private int scholarship;

	public Third_degree(int id, String name, int degree_cost, Double avgGradeFirstDegree, int scholarship) {
		super(id, name, degree_cost, avgGradeFirstDegree);
		this.scholarship = scholarship;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return "Third_degree [scholarship=" + scholarship + ", toString()=" + super.toString() + "]";
	}
	
	
}
