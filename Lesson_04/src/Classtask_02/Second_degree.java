package Classtask_02;

public class Second_degree extends First_degree{

	public Double avgGradeFirstDegree;

	public Second_degree(int id, String name, int degree_cost, Double avgGradeFirstDegree) {
		super(id, name, degree_cost);
		this.avgGradeFirstDegree = avgGradeFirstDegree;
	}

	public Double getAvgGradeFirstDegree() {
		return avgGradeFirstDegree;
	}

	@Override
	public String toString() {
		return "Second_degree [avgGradeFirstDegree=" + avgGradeFirstDegree + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
