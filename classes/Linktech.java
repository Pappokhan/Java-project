package classes;

import java.lang.*;
import interfaces.*;

public class Linktech implements ProfileOperations, EmployeeOperations, ClientOperations
{
	private String name;
	private String location;
	private String Email;
	private String PhnNumber;
	private String Founder;
	private String Foundingyear;
	private Profile profiles[] = new Profile [1000];
	private Client clients[] = new Client [500];
	private Employee employees[] = new Employee [100];
	
	public Linktech(){}
	public Linktech(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	
	
	public void setName(String name)
	{this.name = name;}
	public void setLocation(String location)
	{this.location = location;}
	
	public void setEmail(String Email)
	{this.Email = Email;}
	public void setPhnNumber(String PhnNumber)
	{this.PhnNumber = PhnNumber;}
	
	public void setFounder(String Founder)
	{this.Founder = Founder;}
	public void setFoundingyear(String Foundingyear)
	{this.Foundingyear = Foundingyear;}
	
	
	
	public String getName()
	{return name;}
	public String getLocation()
	{return location;}
	
	public String getEmail()
	{return Email;}
	public String getPhnNumber()
	{return PhnNumber;}
	
	public String getFounder()
	{return Founder;}
	public String getFoundingyear()
	{return Foundingyear;}
	

	public boolean insertProfile(Profile a)
	{
		for(int i=0; i<profiles.length; i++)
		{
			if(profiles[i] == null)
			{
				profiles[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeProfile(Profile a)
	{
		for(int i=0; i<profiles.length; i++)
		{
			if(profiles[i] == a)
			{
				profiles[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Profile searchProfile(String email)
	{
		for(int i=0; i<profiles.length; i++)
		{
			if(profiles[i] != null)
			{
				if(profiles[i].getEmail().equals(email))
				{
					return profiles[i];
				}
			}
		}
		return null;
	}
	
	public void showAllProfile()
	{
		for(int i=0; i<profiles.length; i++)
		{
			if(profiles[i] != null)
			{
				profiles[i].showDetails();
			}
		}
	}
	
	
	public boolean insertClient(Client c)
	{
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] == null)
			{
				clients[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeClient(Client c)
	{
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] == c)
			{
				clients[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Client searchClient(int nid)
	{
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] != null)
			{
				if(clients[i].getNid() == nid)
				{
					return clients[i];
				}
			}
		}
		return null;
	}
	
	public void showAllClient()
	{
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] != null)
			{
				clients[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("----     LinkTech Information     ----");
		System.out.println("Company Name               : " + name);
		System.out.println("Linktech Location          : " + location);
		System.out.println("LinkTech Email             : " + Email);
		System.out.println("Linktech Phone Number      : " + PhnNumber);
		System.out.println("Founder of LinkTech        : " + Founder);
		System.out.println("Founding Year              : " + Foundingyear);
		System.out.println("----------------------------------------------");
		System.out.println("--- List of profiles ---");
		this.showAllProfile();
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.println("--- List of Employees ---");
		this.showAllEmployees();
		System.out.println("----------------------------------------------");
		
	}	
}