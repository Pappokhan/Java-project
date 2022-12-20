package classes;

import java.lang.*;
import interfaces.LinktechService;

public abstract class Profile implements LinktechService
{	
	private String email;
	private double productQuantity;
	private Client client;
	
	public Profile(){}
	public Profile(String email, double productQuantity, Client client)
	{
		this.email = email;
		this.productQuantity = productQuantity;
		this.client = client;
	}
	
	public void setEmail(String email)
	{this.email = email;}
	
	public void setProductQuantity(double productQuantity)
	{this.productQuantity = productQuantity;}
	
	public void setClient(Client client)
	{this.client = client;}
	
	public String getEmail()
	{return email;}
	public double getProductQuantity()
	{return productQuantity;}
	public Client getClient()
	{return client;}
	
	public abstract void showDetails();
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			productQuantity = productQuantity + amount;
			return true;
		}
		return false;
	}
	
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<= productQuantity)
		{
			productQuantity = productQuantity - amount;
			return true;
		}
		return false;
	}
}