package classes;

import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private int paying;
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPaying(int paying)
	{
		this.paying = paying;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	public String getName()
	{
		return name;
	}
	public int getPaying()
	{
		return paying;
	} 
	
	public void showDetails()
	{
		System.out.println("Employee ID -            : " + empId);
		System.out.println("Employee Name -          : " + name);
		System.out.println("Employee Paying-         : " + paying);
		System.out.println();
	}
}