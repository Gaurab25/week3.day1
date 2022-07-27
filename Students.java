package week3.day1;

public class Students
{
	public void getStudentInfo(String StudentId)
	{
		System.out.println("Student id " + StudentId);
	}
	public void getStudentInfo(String StudentID, String StudentName)
	{
		System.out.println("Student id and name " + StudentID +" " +StudentName);
	}
	public void getStudentInfo(String email,long phoneno)
	{
		System.out.println("email and phoneno :" + email + " " +phoneno);
	}
	
	public static void main(String[] args)
	{
		Students std1=new Students();
		std1.getStudentInfo("145304");
		std1.getStudentInfo("145304", "Gaurab");
		std1.getStudentInfo("barad@gmail.com" , 700898765);
	

	}

}
