package classes;

import java.lang.*;


public class Client
{
	private int nid;
	private String name;
	private String phnNumber;
	
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	
	public int getNid()
	{
		return nid;
	}
	public String getName()
	{
		return name;
	}
	public String getPhnNumber()
	{
		return phnNumber;
	}
	
	public void showDetails()
	{
		System.out.println("--------------------------------------");
		System.out.println("Profile Holder NID                   : " + nid);
		System.out.println("Profile Holder Name                  : " + name);
		System.out.println("Profile Holder Phone Number          : " + phnNumber);
		System.out.println();
	}
}