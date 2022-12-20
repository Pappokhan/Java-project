import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();

		String user, pass, ch;
		
		System.out.println("WELCOME TO _LINKTECH_ APP");

		System.out.println(" --- Press ---\n1: User login- \n2: Admin login-");
		ch = sc.nextLine();

		System.out.println("_Enter Your Username-");
		user = sc.nextLine();

		System.out.println("_Enter Your Password-");
		pass = sc.nextLine();

		switch(ch)
		{
			case "1":
				if(user.equals("oop") && pass.equals("0101"))
				{
					System.out.println("__Login successful__");
				}
				else
				{
					System.out.println("__Invalid Username Or Password__");
				}
				break;

			case "2":
			 	if(user.equals("Admin") && pass.equals("admin"))
				{
					System.out.println("__Login Successful__");
				}
				else
				{
					System.out.println("__Invalid Username Or Password__");
				}

	    }

		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Linktech l = new Linktech();
		l.setName("_LinkTech");
		l.setLocation("_Bashundhara");
		l.setEmail("_linktech0101@gmail.com");
		l.setPhnNumber("_01914433835");
		l.setFounder("_Pappo Khan");
		l.setFoundingyear("_2021_");
		
		System.out.println("----------------------------------------------    ");
		System.out.println("Welcome to #Bashundhara# LinkTech Branch------");
		System.out.println("----------------------------------------------  \n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
		
			
			System.out.println("\t1. Employee Information              -");
			System.out.println("\t2. Client Information                -");
			System.out.println("\t3. Profile Information               -");
			System.out.println("\t4. Linktech Service                  -");
			System.out.println("\t5. linktech Information              -");
			System.out.println("\t6.           ---- Exit ----           ");
			
			System.out.println("\n----------------------------------------------");
			System.out.print("Enter Chosen your Option: ");
			int choice = sc.nextInt();
			System.out.println("----------------------------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println();
					System.out.println("You have selected Employee Information.");
					System.out.println();
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee              -");
					System.out.println("\t2. Remove Employee                  -");
					System.out.println("\t3. Search Employee                  -");
					System.out.println("\t4. Show All Employees               -");
					System.out.println("\t5. Go Back                          -");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter The your option: ");
					int option1 = sc.nextInt();
					System.out.println("-----------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println();
							System.out.println("You have selected Insert Employee...");
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println();
							System.out.println("You have selected Remove Employee...");
							System.out.println();
							break;
							
						case 3:
							
							System.out.println();
							System.out.println("You have selected Search Employee...");
							System.out.println();
							break;
							
						case 4:
						
							System.out.println();
							System.out.println("You have selected Show All Employees...");
							System.out.println();
							break;
							
						case 5:
							
							System.out.println();
							System.out.println("You have selected to Go Back....");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println();
							System.out.println("Invalid Option... Going Back...");
							System.out.println();
							break;
					}
					break;
					
				case 2:
					
					System.out.println();
					System.out.println("You have selected client Information...");
					System.out.println();
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Client             -");
					System.out.println("\t2. Remove Client                 -");
					System.out.println("\t3. Search Client                 -");
					System.out.println("\t4. Show All Client               -");
					System.out.println("\t5. Go Back                       -");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter The your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println();
							System.out.println("You have selected Insert client...");
							System.out.println();
							
							System.out.print("Enter The client NID               : ");
							int nid1 = sc.nextInt();
							System.out.print("Enter The Client Name              : ");
							String name1 = sc.next();
							System.out.print("Enter The Client Phone Email       : ");
							String phnNumber1 = sc.next();
							
							Client c1 = new Client();
							c1.setNid(nid1);
							c1.setName(name1);
							c1.setPhnNumber(phnNumber1);
							
							if(l.insertClient(c1))
							{
								System.out.println("---  Client Inserted, NID Number               : " + c1.getNid() + "  ---");
							}
							else
							{
								System.out.println("---  Client NOT Inserted, NID NID Number       : " + c1.getNid() + "  ---");
							}
								
							break;
							
						case 2:
							
							System.out.println();
							System.out.println("You have selected Remove client...");
							System.out.println();
							
							System.out.print("Enter The the NID to remove a client: ");
							int nid2 = sc.nextInt();
							
							Client c2 = l.searchClient(nid2);
							
							if(c2 != null)
							{
								System.out.println("---    Client Found    ---");
								
								if(l.removeClient(c2))
								{
									System.out.println("----  client Removed, NID : " + c2.getNid() + "  ----");
								}
							}
							else
							{
								System.out.println("---  Client NOT Found & NOT Removed  ---");
							}
								
							break;
							
						case 3:
							
							System.out.println();
							System.out.println("You have selected Search client...");
							System.out.println();
							
							System.out.print("Enter The the NID to search a client: ");
							int nid3 = sc.nextInt();
							
							Client c3 = l.searchClient(nid3);
							
							if(c3 != null)
							{
								System.out.println("---  Client Found  ---");
								c3.showDetails();
							}
							else
							{
								System.out.println("---  Client NOT Found  ---");
							}
							
							break;
							
						case 4:
						
							System.out.println();
							System.out.println("You have selected Show All clients...");
							System.out.println();
							
							l.showAllClient();
							
							break;
							
						case 5:
							
							System.out.println();
							System.out.println("You have selected to Go Back...");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println();
							System.out.println("Invalid Option... Going Back...");
							System.out.println();
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println();
					System.out.println("You have selected Profile Information...");
					System.out.println();
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Profile              -");
					System.out.println("\t2. Remove Profile                  -");
					System.out.println("\t3. Search Profile                  -");
					System.out.println("\t4. Show All Profile                -");
					System.out.println("\t5. Go Back                         -");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter The your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println();
							System.out.println("You have selected Insert Profile...");
							System.out.println();
							
							
							System.out.print("Enter The NID to verify a client: ");
							int nid1 = sc.nextInt();
							
							Client c1 = l.searchClient(nid1);
							
							if(c1 != null)
							{
								System.out.println("---  Client Verified  ---");
								
								Profile a = null;
								
								System.out.println("There are Two types of Profile. Which one do you want to create?");
								System.out.println("\t1. Retail Profile           -");
								System.out.println("\t2. Business Profile         -");
								System.out.println("\t3. Go Back                  -");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter The your Type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								if(type == 1)
								{
									System.out.print("Enter The Profile Email Number             -: ");
									String an = sc.next();
									System.out.print("Enter The Profile ProductQuantity          -: ");
									double ba = sc.nextDouble();
									System.out.print("Enter The Discount                         -: ");
									double ir = sc.nextDouble();
									
									RetailProfile rp = new RetailProfile(an, ba, c1, ir);
									a = rp;
									
								}
								else if(type == 2)
								{
									System.out.print("Enter The Profile Email Number             -: ");
									String an = sc.next();
									System.out.print("Enter The Profile ProductQuantity          -: ");
									double ba = sc.nextDouble();
									System.out.print("Enter The Income-Tax                       -: ");
									int ty = sc.nextInt();
									
									BusinessProfile bp = new BusinessProfile(an, ba, c1, ty);
									
									a = bp;
								}
								else if(type == 3)
								{
									System.out.println();
									System.out.println("You have selected to Go Back...");
									System.out.println();
								}
								else
								{									
									System.out.println();
									System.out.println("Invalid Option... Going Back...");
									System.out.println();
								}
								
								if(a!= null)
								{
									if(l.insertProfile(a))
									{
										System.out.println("---  Profile Inserted, Profile Email Number: " + a.getEmail() + "  ---");
									}
									else
									{
										System.out.println("---  Profile Inserted, Profile Email Number: " + a.getEmail() + "  ---");
									}
								}	
							}
							else
							{
								System.out.println("---  Invalid Client... Sorry Can NOT Create Profile   ---");
							}
							
							
							break;
							
						case 2:
							
							System.out.println();
							System.out.println("You have selected Remove Profile...");
							System.out.println();
							
							
							
							
							
							break;
							
						case 3:
							
							System.out.println();
							System.out.println("You have selected Search Profile...");
							System.out.println();
							
							
							
							
							
							break;
							
						case 4:
						
							System.out.println();
							System.out.println("You have selected Show All Profiles...");
							System.out.println();
							
							l.showAllProfile();
							
							break;
							
						case 5:
							
							System.out.println();
							System.out.println("You have selected to Go Back...");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println();
							System.out.println("Invalid Option... Going Back...");
							System.out.println();
							break;
					}
					
					
					break;
					
				case 4:
					
					System.out.println();
					System.out.println("You have selected Profile Service Information...");
					System.out.println();
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Add Quantity              -");
					System.out.println("\t2. Sell Quantity             -");
					System.out.println("\t3. Service History           -");
					System.out.println("\t4. Go Back                   -");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter The your option: ");
					int option4 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println();
							System.out.println("You have selected Add Product...");
							System.out.println();
							
							System.out.print("Enter The Profile Number for Verification: ");
							String an1 = sc.next();
							
							Profile p1 = l.searchProfile(an1);
							
							if(p1 != null)
							{
								System.out.println("--- Profile Verified  ---");
								System.out.println("Profile Email Number         : " + p1.getEmail());
								System.out.println("Profile Holder Name          : " + p1.getClient().getName());
								
								System.out.println("Current productQuantity: " + p1.getEmail());
								System.out.print("Add Amount: ");
								int am = sc.nextInt();
								
								if(p1.addQuantity(am))
								{
									System.out.println("--- Add Successfull ---");
									System.out.println("New ProductQuantity      : " + p1.getProductQuantity());
									frwd.writeInFile(am + " Add in " + p1.getEmail());
								}
								else
								{
									System.out.println("--- Add Failed ---");
								}
							}
							else
							{
								System.out.println("---  Invalid Profile... Sorry Can NOT Add Product   ---");
							}
							
							
							break;
							
						case 2:
							
							System.out.println();
							System.out.println("You have selected Sell productQuantity...");
							System.out.println();
							
							System.out.print("Enter The Profile Email Number for Verification: ");
							String an2 = sc.next();
							
							Profile p2 = l.searchProfile(an2);
							
							if(p2 != null)
							{
								System.out.println("-----    Profile Verified    -----");
								System.out.println("Profile Email Number        : " + p2.getEmail());
								System.out.println("Profile Holder Name         : " + p2.getClient().getName());
								
								System.out.println("Current productQuantity      : " + p2.getProductQuantity());
								System.out.print("Sell Amount                    : ");
								int am = sc.nextInt();
								
								if(p2.sellQuantity(am))
								{
									System.out.println("--- Sell Successfull ---");
									System.out.println("New productQuantity     : " + p2.getProductQuantity());
									frwd.writeInFile(am + " ---Sell from--- " + p2.getEmail());
								}
								else
								{
									System.out.println("---   Sell Failed   ---");
								}
							}
							else
							{
								System.out.println("---  Invalid Profile... Sorry Can NOT Sell Product   ---");
							}
							
							break;
							
						case 3:
							
							System.out.println();
							System.out.println("You have selected Service History...");
							System.out.println();
							
							frwd.readFromFile();
							
							break;
							
						case 4:
							
							System.out.println();
							System.out.println("You have selected to Go Back...");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println();
							System.out.println("Invalid Option... Going Back...");
							System.out.println();
							break;
					}
					
					break;
					
				case 5:
				
					System.out.println();
					l.showDetails();
					System.out.println();
					
					break;
					
				case 6:
					
					repeat = false;
					System.out.println();
					System.out.println("Thank You for using our Application...");
					System.out.println();
					
					break;
				
				default:
					
					System.out.println();
					System.out.println("Invalid Choice... Try Again...");
					System.out.println();
					
					break;
			}
		}		
	}
}