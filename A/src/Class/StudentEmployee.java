package Class;

import Abstrac.Person;
import Interface.IEmployee;
import Interface.IStudent;

public class StudentEmployee extends Person implements IStudent,IEmployee 
{
		private Student student;
		private Employee employee;
		
		public StudentEmployee(String workplace, String job ,String dept, int year,String name, String id)
		{
			super(name, id);
			student = new Student(dept, year, name, id);
			employee = new Employee(workplace, job, name, id);
		}

		@Override
		public String getWorkplace() {
			// TODO Auto-generated method stub
			return employee.getWorkplace();
		}

		@Override
		public String getJob() {
			// TODO Auto-generated method stub
			return employee.getJob();
		}

		@Override
		public void setJob(String job) {
			// TODO Auto-generated method stub
			employee.setJob(job);
		}

		@Override
		public void setWorkplace(String workplace) {
			// TODO Auto-generated method stub
			employee.setWorkplace(workplace);
		}

		@Override
		public String workInfo() {
			// TODO Auto-generated method stub
			return employee.workInfo();
		}

		@Override
		public String getDept() {
			// TODO Auto-generated method stub
			return student.getDept();
		}

		@Override
		public int getYear() {
			// TODO Auto-generated method stub
			return student.getYear();
		}

		@Override
		public void setDept(String dept) {
			// TODO Auto-generated method stub
			student.setDept(dept);
		}

		@Override
		public void setYear(int year) {
			// TODO Auto-generated method stub
			student.setYear(year);
		}

		@Override
		public void introduce() {
			// TODO Auto-generated method stub
			super.toString();
			studentInfo();
			workInfo();
			
		}

		@Override
		public String studentInfo() {
			// TODO Auto-generated method stub
			return student.studentInfo();
		}
		

		
		

}


