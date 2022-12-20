package classes;

import java.lang.*; 

public class BusinessProfile extends Profile
{
	private int incomeTax;
	
	public BusinessProfile(){}
	public BusinessProfile(String email, double productQuantity, Client client, int incomeTax)
	{
		super(email, productQuantity, client);
		this.incomeTax = incomeTax;
	}
	
	public void setIncomeTax(int incomeTax)
	{
		this.incomeTax = incomeTax;
	}
	public int getIncomeTax()
	{
		return incomeTax;
	}
	
	public void showDetails()
	{
		System.out.println("------ Profile Information ------");
		this.getClient().showDetails();
		System.out.println("Profile Email       : " +this.getEmail());
		System.out.println("ProductQuantity     : " +this.getProductQuantity());
		System.out.println("IncomeTax           : " +incomeTax);
		System.out.println();
	}
}