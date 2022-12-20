package classes;

import java.lang.*;

public class RetailProfile extends Profile
{
	private double discount;
	
	public RetailProfile(){}
	public RetailProfile(String email, double productQuantity, Client client, double discount)
	{
		super(email, productQuantity, client);
		this.discount = discount;
	}
	
	public void setDiscount(double discount)
	{
		this.discount = discount;
	}
	public double getDiscount()
	{
		return discount;
	}
	
	public void showDetails()
	{
		System.out.println("------ Profile Information ------");
		this.getClient().showDetails();
		System.out.println("Profile Email           : " + this.getEmail());
		System.out.println("ProductQuantity         : " + this.getProductQuantity());
		System.out.println("discount Rate           : " + discount);
		System.out.println();
	}
}