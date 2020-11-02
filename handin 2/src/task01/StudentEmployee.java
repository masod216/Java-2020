package task01;

public class StudentEmployee extends Student 
{
		private String workplace;
		private String job;
		
		public StudentEmployee(String workplace, String job ,String dept, int year,String name, String id)
		{
			super(dept, year, name, id);
			this.workplace = workplace;
			this.job = job;
		}
		
		public String getWorkplace() {
			return workplace;
		}
		
		public String getJob() {
			return job;
		}
		
		public void setJob(String job) {
			this.job = job;
		}
		public void setWorkplace(String workplace) {
			this.job = workplace;
		}
		
		
		
		@Override
		public String toString()
		{
			return super.toString()+" workplace =  "+workplace+" job = "+job;
		}
		
		public void introduce() {
			System.out.println(this.toString());
		}
		
		public String workInfo()
		{
			return super.toString()+" workplace =  "+workplace+" job = "+job;
		}
}


