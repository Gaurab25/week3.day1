package org.student;

import org.department.Department;

public class Student extends Department
{
	public void StudentName()
	{
		System.out.println("Gaurab");
	}
	public void studentDept()
	{
		System.out.println("ECE");
	}
	public void studentId()
	{
		System.out.println("et145304");
	}
	public static void main(String[]args)
	{
		Student sd1=new Student();
		sd1.studentDept();
		sd1.collegeCode();
		sd1.collegeName();
		sd1.collegeRank();
		sd1.deptName();
		sd1.studentId();
		sd1.StudentName();
		
	}
}

