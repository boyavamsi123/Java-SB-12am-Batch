import java.util.*;
public class Login
{
	static Scanner sc = new Scanner(System.in);
	static int a;
	static int rr;
	static double balance;
	static double zz;
	static String s1;
	static String s2;
	static String s3;
	static String def = "\u001B[0m";
    	static String blink = "\u001B[5m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
    	static String purpe = "\u001B[35m";
    	static String skblue = "\u001B[36m";
	public static void  OTP()
	{
		 rr = (int )(Math.random()*10000);
		System.out.println("OTP: "+rr);
	}

	public static  int  TC()
	{
		int  yy = (int)(Math.random()*10000);
		return yy;
	}
	public static  void  upi(double x)
	{
		System.out.println("					Enter the UPI id:");
		String  ss=sc.next();
		System.out.println("					wait a second to verify the upi id");
		for(int i =1;i<=3;i++)
		{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
		}
		System.out.println("					UPI id is verified ,now You can do payment ");
		System.out.println(" 					Total amout  is :"+x);
		System.out.println("					press 1 to continue for the payment or else quit the app");
		int  t = sc.nextInt();
		if(t==1)
		{
			System.out.println("				Now You will get pop message in your mobile to pay  amount with in  5 minutes");
			for(int i =1;i<=5;i++)
			{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
			}
			s3="Payment Successfully  done";
			System.out.println("							"+s3);
			
		}
		else
		{		s3="Payment Successfully  Not done";
				System.exit(0);
		}
		
	}
	public static void debitcard(double tt)
	{
		System.out.println("							Enter the following details carefully");
		System.out.println("							Enter the Debit Card Number:");
		String t1 = sc.next();
		System.out.println("							Enter the   Debit Card expairy month and year(MMYY)");
		String t2 = sc.next();
		System.out.println("							Enter the  Debit card CVV number:");
		int t3 = sc.nextInt();
		System.out.println("							Press 1 to continue to the payment or else quit the app");
		int t4 = sc.nextInt();
		if(t4==1)
		{
			
			System.out.println(" 						Total amout  is :"+tt);
			System.out.println("						Now you will recieve otp to mobile number:");
			OTP();
			System.out.println("						Enter the  otp  Which is Sent to Your Mobile Number:");
			int t5 = sc.nextInt();
			if(t5==rr)
			{
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}
						s3="Payment Successfully  done";

						System.out.println("					Payment Successfully  done");


			}
			else
			{
					System.out.println("						Invalid otp");
					System.out.println("						Now you will recieve  another otp to mobile number:");
					OTP();

			}
			
			
				
		}
		else
		{
			s3="Payment Successfully  Not done";
			System.exit(0);	
		}


	}
	public static void creditcard(double ff)
	{
		System.out.println("							Enter the following details carefully");
		System.out.println("							Enter the Credit Card Number:");
		String f1 = sc.next();
		System.out.println("							Enter the   Credit Card expairy month and year(MMYY)");
		String f2 = sc.next();
		System.out.println("							Enter the  Credit CVV number:");
		int f3 = sc.nextInt();
		System.out.println("							Press 1 to continue to the payment or else quit the app");
		int f4 = sc.nextInt();
		if(f4==1)
		{
			
			System.out.println(" 						Total amout  is :"+ff);
			System.out.println("						Now you will recieve otp to mobile number:");
			OTP();
			System.out.println("						Enter the  otp which is registed to mobile Number:");
			int f5 = sc.nextInt();
			if(rr==f5)
			{
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}
						s3="Payment Successfully  done";

						System.out.println("						Payment Successfully  done");


			}
			else
			{
					System.out.println("							Invalid otp");
					System.out.println("							Now you will recieve  another otp to mobile number:");
					OTP();

			}
			
			
				
		}
		else
		{
			s3="Payment Successfully  Not done";
			System.exit(0);	
		}


	}

		
	public static void   confirm(String yy,String x1,String x2)
	{
		 zz = TC();
		System.out.println("*    Ticket cost    :       "+zz+"*");
		
		System.out.println("			Select payment any option");
		System.out.println(" 			1.UPI");
		System.out.println("			2.Debit Card");
		System.out.println("			3.credit Card");
		System.out.println("			any Input  Exit from App");
		int vv=sc.nextInt();
		if(vv==1)
		{
			upi(zz);
			payment(yy,x1,x2);
		}
		else if(vv==2)
		{
			debitcard(zz);
			payment(yy,x1,x2);
		}
		else if(vv==3)
		{
			creditcard(zz);
			payment(yy,x1,x2);
		}

		else
		{
			System.exit(0);
		}
		

	}
	public static void payment(String yy,String x1,String x2)
	{
			
		System.out.println("				Press 1 to Enter the Details of the passanger or  quit from the app");
		int aa = sc.nextInt();
		if(aa== 1)
		{
			
			System.out.println("					Enter the Name:");
        		String Name = sc.next();
        		System.out.println("					Enter the Phone Number:");
        		long phoneNumber = sc.nextLong();
        		System.out.println("					Enter the Aadhar Number:");
        		long AadharNumber = sc.nextLong();
			if(s3.equals("Payment Successfully  done"))
			{
				//System.out.println("  		  Amount is deducted from wallet				 ");
				System.out.println();

				//balance = balance - zz;
				System.out.println("		!Hurray , 	  Your  Journey details are ");
				System.out.println();

				System.out.println("**********************");
				System.out.println("* 	        Name                ="+Name);
				System.out.println("* 		PhoneNumber   ="+phoneNumber);
				System.out.println("* 		AadharNumber ="+AadharNumber);
				System.out.println("* 		Ticket cost         ="+zz);
				System.out.println("* 		Seat Number     ="+yy);
				System.out.println("* 		Bus Name          ="+x1);
				System.out.println("* 		Bus Number      ="+x2);
				System.out.println("**********************");
			}
			System.out.println();		
		}
		else
		{
			System.exit(0);
		}
		

	}
		public static void back()
	{
		System.out.println("back to the avilabe features:");
		
	}
	
	public static void  train_ticket()
	{
		String s1=Source_Book();
		String s2=Dest_Book();
		System.out.println(s1+".........."+s2);
		if(s1.equals(s2))
		{
			System.out.println("		Sorry You can not Book ticket Because Source and destination is same			");
			train_ticket();
			
		}
		else
		{
				System.out.println("				Select the Trains :");
				Train();

				
		}	
	

	}
	
	public static void Train()
	{
		System.out.println("					1.Hyderabad SF Express");
		System.out.println();

		System.out.println("			        	2.Mumbai Rajdhani Express");
		System.out.println();

		System.out.println("                                	3.Vande Bharat Express");

		System.out.println("                                	4.Gatimaan Express");
		
		int ee = sc.nextInt();
		switch(ee)
		{
			case 1:
				 System.out.println("							Avilabe seates are:");
				int[]  arr111={1,2,3,4,5,6,7,8,0,10,11,12,13,0,15,16,17,18,0,20,21,22,23,24,25,26,0,0,29,30,31,31,33,34,35,36,37,38,39,40,42,42,43,44,45,46,47,48,49,50};
				for(int i: arr111)
				{
						System.out.print(i+" ");
				
				}	
				System.out.println("\n						Select  any one seat ");
				int y=sc.nextInt();
				int z=0;
				if(y>=arr111[0] && y<=arr111[49])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					System.out.println();
					System.out.println("					 Please do not close the Tab or press Back");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();

						System.out.println("					 Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("						seat Number not found");
					System.out.println();

					System.out.println("						choose once  Again from starting on  wards");
					
					System.exit(0);
					//Train();
				}
				for(int i=0;i<arr111.length;i++)
				{
					if(y==arr111[i])
					{
						System.out.println("					You selected a seat number : "+y);
						z=i;
						break;
					}
				}
					System.out.println("						Press 1 to proceed to book the ticket: or else quit  the app ");
					int w = sc.nextInt();
					if(w==1)
					{
						arr111[z]=0;
						System.out.println("					Avilable seates are:");
						for(int m: arr111)
						{
							System.out.print(m+" ");
						}
						String yy=String.valueOf(y);
						//passanger_details(yy);
						System.out.println("\n				 press 1 continue for the payment or else quit the app");
						int xx=sc.nextInt();
						if(xx==1)
						{
							String x1="Hyderabad SF Express";
							String  x2 ="12603";
							confirm(yy,x1,x2);
							

						}
						else
						{
							//back();
							//features();
							System.exit(0);

						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 2:
				 System.out.println("						Avilabe seates are:");
				int[]  arr211 ={1,2,3,4,5,6,7,8,0,10,11,12,13,0,15,16,17,18,0,20,21,22,23,24,25,26,0,0,29,30,31,31,33,34,35,36,37,38,39,40,42,42,43,44,45,46,47,48,49,50};

				for(int a: arr211)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n					Select  any one seat ");
				int t=sc.nextInt();
				int h=0;
				if(t>=arr211[0] && t<=arr211[49])
				{
					
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					System.out.println();
					System.out.println("					 Please do not close the Tab or press Back");

					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


						System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("					seat Number not found");
					System.out.println();

					System.out.println("					choose once  Again   From starting Onwards");
					System.exit(0);

					
					//Train();
				}
				for(int i=0;i<arr211.length;i++)
				{
					if(t==arr211[i])
					{
						System.out.println("				You selected a seat number : "+t);
						h=i;
						break;
					}
				}
					System.out.println("					press 1 to proceed to book the ticket: or else quit the app ");
					int k = sc.nextInt();
					if(k==1)
					{
						arr211[h]=0;
						System.out.println("				Avilable seates are:");
						for(int j: arr211)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(t);
						System.out.println("\n			 press 1 continue for the payment or else quit");
						int cc=sc.nextInt();
						if(cc==1)
						{
							String y1="Mumbai Rajdhani Express";
							String  y2 ="12951";
							confirm(yy,y1,y2);
						}
						else
						{
							//back();
							//features();
							System.exit(0);
						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 3:
				 System.out.println("					Avilabe seates are:");
				System.out.println();

				int[]  arr311 ={1,2,3,4,5,6,7,8,0,10,11,12,13,0,15,16,17,18,0,20,21,22,23,24,25,26,0,0,29,30,31,31,33,34,35,36,37,38,39,40,42,42,43,44,45,46,47,48,49,50};

				for(int a: arr311)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n				Select  any one seat ");
				int g=sc.nextInt();
				int f=0;
				if(g>=arr311[0] && g<=arr311[49])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					System.out.println();
					System.out.println("					 Please do not close the Tab or press Back");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


					System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("				seat Number not found");
					System.out.println();

					System.out.println("				choose once  Again ");
					//Train();
					System.exit(0);

				}

				for(int i=0;i<arr311.length;i++)
				{
					if(g==arr311[i])
					{
						System.out.println("			You selected a seat number : "+g);
						f=i;
						break;
					}
				}
					System.out.println("				press 1 to proceed to book the ticket: or  Quit the app ");
					int d = sc.nextInt();
					if(d==1)
					{
						arr311[f]=0;
						System.out.println("			Avilable seates are:");
						for(int j: arr311)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(g);
						//passanger_details(yy);
						//System.out.println("\n continue for the payment");
						System.out.println("\n			 press 1 continue for the payment or else quit from the app");
						int zz=sc.nextInt();
						if(zz==1)
						{
							String z1="Vande Bharat Express";
							String  z2 ="20704";
							confirm(yy,z1,z2);
						}
						else
						{
							//features
							//features();
							System.exit(0);
						}

						
					}
					else
					{
						System.exit(0);
						//features();
						//break;
					}
							
				break;
			case 4:
				 System.out.println("					Avilabe seates are:");
				System.out.println();

				int[]  arr411 ={1,2,3,4,5,6,7,8,0,10,11,12,13,0,15,16,17,18,0,20,21,22,23,24,25,26,0,0,29,30,31,31,33,34,35,36,37,38,39,40,42,42,43,44,45,46,47,48,49,50};

				for(int aa: arr411)
				{
					System.out.print(aa+" ");
				}
				System.out.println("\n				Select  any one seat ");
				int gg=sc.nextInt();
				int ff=0;
				if(gg>=arr411[0] && gg<=arr411[49])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					System.out.println();
					System.out.println("					 Please do not close the Tab or press Back");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


					System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("				seat Number not found");
					System.out.println();

					System.out.println("				choose once  Again ");
					Train();
				}

				for(int i=0;i<arr411.length;i++)
				{
					if(gg==arr411[i])
					{
						System.out.println("			You selected a seat number : "+gg);
						ff=i;
						break;
					}
				}
					System.out.println("				press 1 to proceed to book the ticket: or  Quit the app ");
					int dd = sc.nextInt();
					if(dd==1)
					{
						arr411[ff]=0;
						System.out.println("			Avilable seates are:");
						for(int j: arr411)
						{
							System.out.print(j+" ");
						}
						String yyy=String.valueOf(gg);
						//passanger_details(yy);
						//System.out.println("\n continue for the payment");
						System.out.println("\n			 press 1 continue for the payment or else quit from the app");
						int zzz=sc.nextInt();
						if(zzz==1)
						{
							String z1="Gatimaan Express";
							String  z2 ="12050";
							confirm(yyy,z1,z2);
						}
						else
						{
							//features
							//features();
							System.exit(0);
						}

						
					}
					else
					{
						System.exit(0);
						//features();
						//break;
					}
							
				break;


			default:
					
					quit();
					break;
		}
	}

	public static void Buses()
	{
		System.out.println("				1.Bus1(Lakshmi Travels)");
		System.out.println();

		System.out.println("			        2.Bus2(Sai Ganesh Travels)");
		System.out.println();

		System.out.println("                                3.Bus3(Sai Balaji Travels)");
		int x = sc.nextInt();
		switch(x)
		{
			case 1:
				 System.out.println("							Avilabe seates are:");
				int[]  arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
				for(int a: arr)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n						Select  any one seat ");
				int y=sc.nextInt();
				int z=0;
				if(y>=arr[0] && y<=arr[29])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();

						System.out.println("					 Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("						seat Number not found");
					System.out.println();

					System.out.println("						choose once  Again ");
					System.exit(0);

					//Buses();
				}
				for(int i=0;i<arr.length;i++)
				{
					if(y==arr[i])
					{
						System.out.println("					You selected a seat number : "+y);
						z=i;
						break;
					}
				}
					System.out.println("						Press 1 to proceed to book the ticket: or else quit  the app ");
					int w = sc.nextInt();
					if(w==1)
					{
						arr[z]=0;
						System.out.println("					Avilable seates are:");
						for(int j: arr)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(y);
						//passanger_details(yy);
						System.out.println("\n				 press 1 continue for the payment or else quit the app");
						int xx=sc.nextInt();
						if(xx==1)
						{
							String x1="Lakshmi Travels";
							String  x2 ="AP 29 Z3777";
							confirm(yy,x1,x2);
							

						}
						else
						{
							//back();
							//features();
							System.exit(0);

						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 2:
				 System.out.println("						Avilabe seates are:");
				int[]  arr2 ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
				for(int a: arr2)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n					Select  any one seat ");
				int t=sc.nextInt();
				int h=0;
				if(t>=arr2[0] && t<=arr2[29])
				{
					
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


						System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("					seat Number not found");
					System.out.println();

					System.out.println("					choose once  Again ");
					//Buses();
					System.exit(0);

				}
				for(int i=0;i<arr2.length;i++)
				{
					if(t==arr2[i])
					{
						System.out.println("				You selected a seat number : "+t);
						h=i;
						break;
					}
				}
					System.out.println("					press 1 to proceed to book the ticket: or else quit the app ");
					int k = sc.nextInt();
					if(k==1)
					{
						arr2[h]=0;
						System.out.println("				Avilable seates are:");
						for(int j: arr2)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(t);
						System.out.println("\n			 press 1 continue for the payment or else quit");
						int cc=sc.nextInt();
						if(cc==1)
						{
							String y1="Sai Ganesh Travels";
							String  y2 ="AP 29 Z3772";
							confirm(yy,y1,y2);
						}
						else
						{
							//back();
							//features();
							System.exit(0);
						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 3:
				 System.out.println("					Avilabe seates are:");
				System.out.println();

				int[]  arr3 ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
				for(int a: arr3)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n				Select  any one seat ");
				int g=sc.nextInt();
				int f=0;
				if(g>=arr3[0] && g<=arr3[29])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


					System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("				seat Number not found");
					System.out.println();

					System.out.println("				choose once  Again ");
					//Buses();
					System.exit(0);

				}

				for(int i=0;i<arr3.length;i++)
				{
					if(g==arr3[i])
					{
						System.out.println("			You selected a seat number : "+g);
						f=i;
						break;
					}
				}
					System.out.println("				press 1 to proceed to book the ticket: or  Quit the app ");
					int d = sc.nextInt();
					if(d==1)
					{
						arr3[f]=0;
						System.out.println("			Avilable seates are:");
						for(int j: arr3)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(g);
						//passanger_details(yy);
						//System.out.println("\n continue for the payment");
						System.out.println("\n			 press 1 continue for the payment or else quit from the app");
						int zz=sc.nextInt();
						if(zz==1)
						{
							String z1="Sai Balaji Travels";
							String  z2 ="AP 56 T30546";
							confirm(yy,z1,z2);
						}
						else
						{
							//features
							//features();
							System.exit(0);
						}

						
					}
					else
					{
						System.exit(0);
						//features();
						//break;
					}
							
				break;

			default:
					
					quit();
					break;
		}
	}
	public static void wallet()
	{
		System.out.println("* 				Minmum balance is "+500+"Rs" +" Maximum balance is "+20000+"Rs			*");
		//balance = sc.nextDouble();
		deposit();
	}
	public static void deposit()
	{
		System.out.println("Enter the amount to be deposited in wallet");
		double xxx= sc.nextDouble();
		
		//balance =  balance +d;
		System.out.println("			Select payment any option");
		System.out.println(" 			1.UPI");
		System.out.println("			2.Debit Card");
		System.out.println("			3.credit Card");
		System.out.println("			any Input  Exit from App");
		int vv=sc.nextInt();
		if(vv==1)
		{
			upi(xxx);
			balance =  balance +xxx;
			//payment(yy,x1,x2);
		}
		else if(vv==2)
		{
			debitcard(xxx);
			balance =  balance +xxx;

			//payment(yy,x1,x2);
		}
		else if(vv==3)
		{
			creditcard(xxx);
			balance =  balance +xxx;

			//payment(yy,x1,x2);
		}

		else
		{
			System.exit(0);
		}
		System.out.println();
		System.out.println("					!Hurray Deposit Successful				");
		System.out.println();
		
	}
	/*public static void withdraw(double e)
	{
		if(e>balance)
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
			balance = balance - e;
		}
	}*/

	
	public static void  show_balance()
	{
		System.out.println("*					Amount :						 "+balance);
	}
	static
	{
		System.out.print(blink);
		System.out.print(red);
		System.out.println("				.............Welcome to the Online Ticket  Booking App............... ");
		System.out.print(def);

	}
	public static void  otpgen()
	{
		 a = (int )(Math.random()*10000);
		System.out.println("OTP: "+a);
	}
	public  static void  otpval(int m)
	{
		if(m==a)
		{
			System.out.print(blink);
			System.out.print(green);
			System.out.println("*						!Login Successful!					*");
			System.out.println();
			System.out.print(def);
		}
		else
		{
			System.out.print(blink);
			System.out.print(red);

			System.out.println("*						!Enter  the valid otp! 					*");
			System.out.println();
			System.out.print(def);

			otpgen();
			otpval(sc.nextInt());

		}
	}
	public static void  phno(long ph)
	{
		String mob = String .valueOf(ph);
		int len = mob.length();
		
		
		
			if(ph>=6000000000L && ph<=9999999999L )
			{
					
					System.out.print(blink);
					System.out.print(red);
					System.out.println("						You had Enter valid phone number: 			");
					System.out.println("							Enter the OTP which is sent to given Mobile Number:      ");
					//System.out.println("					Enter the valid 10 digit Phone Number			");
					
					System.out.println();
					System.out.print(def);
					otpgen();
					System.out.println();

					otpval(sc.nextInt());

					
			}
			else
			{
					System.out.print(blink);
					System.out.print(green);
					//System.out.println("*						You had Enter valid phone number:");
					//System.out.println("							Enter the OTP which is sent to given Mobile Number:      ");
					System.out.println("					Enter the valid 10 digit Phone Number			");
	
					System.out.print(def);
					long x = sc.nextLong();
					phno(x);
					

			}	
		
	}
	public static void cities()
	{
		String[] city = {"Delhi","Mumbai","Bangalore","Kolkata ","Chennai ","Hyderabad ","Pune","Jaipur ","Ahmedabad ","Lucknow","Visakhapatnam","Coimbatore","Kochi","Bhubaneswar","Indore","Gurgaon","Noida","Asaam"};

		System.out.println("							Avilable cities are:                                        ");
		for(String s : city)
		{
			System.out.println("				"+s);
		}
	}
	public static void quit()
	{
		System.out.println("Successfully log out");
		System.exit(0);
	}
	public static void features()	
	{
		int x = sc.nextInt();
		switch(x)
		{
			case 1:
					wallet();
					break;
			case 2:
					show_balance();
					break;
			case 3:
					cities();
					break;
			case 4:
					System.out.println("							Select which Ticket you Want to Book");
					System.out.println("							1.Bus Ticket");
					System.out.println("							2.Flight Ticket");
					System.out.println("							3.Train Ticket");
					
					int nn = sc.nextInt();
					if(nn ==1)
					{
						ticket();
					}
					else if(nn==2)
					{
						flight_ticket();
					}
					else if(nn==3)
					{
						train_ticket();
					}
					else
					{
		
						System.out.println("Enter the valid Input to get the desired  feature");
						features();


					}
					break;
			case 5:
					quit();
					break;
			default:
				System.out.println("						Enter the valid feature:				");
				features();	
		}
		if(x!=5)
		{
		System.out.println("						press 1 to continue or else  logout the app  .	     ");
		if(1==sc.nextInt())
		{
			System.out.println("						Main Menu:");
			System.out.println("						1.Add money to wallet.");
			System.out.println("						2.show wallet Balance.");
			System.out.println("						3.Avilabe cities are");
			System.out.println("						4.Book Ticket.");
			System.out.println("						5.Quit the App");
			System.out.println("						press above options to get facility:");
			features();
		}
		else
		{
			System.exit(0);
		}
		}	

	}

	public static  String  Source_Book()
	{
		System.out.println("			Enter the Source place:");
		 s1 =sc.next().toLowerCase().trim();
		source(s1);
		return s1;
	}
	public static String Dest_Book()
	{
		System.out.println("			Enter the Destination place");
		 s2 = sc.next().toLowerCase().trim();
		destination(s2);
		return s2;

	}
	public static void  flight_ticket()
	{
		String s1=Source_Book();
		String s2=Dest_Book();
		System.out.println(s1+".........."+s2);
		if(s1.equals(s2))
		{
			System.out.println("		Sorry You can not Book ticket Because Source and destination is same			");
			flight_ticket();
			
		}
		else
		{
				System.out.println("				Select the Flights :");
				Flights();

				
		}	
	

	}
	

	public static void Flights()
	{
		System.out.println("				1.Flight1(Air India )");
		System.out.println();

		System.out.println("			        2.Flight_2(IndiGo)");
		System.out.println();

		System.out.println("                                3.Flight_3(AirAsia India)");
		int ee = sc.nextInt();
		switch(ee)
		{
			case 1:
				 System.out.println("							Avilabe seates are:");
				int[]  arr11={1,2,3,4,5,6,7,8,0,10,11,12,13,0,15,16,17,18,0,20,21,22,23,24,25,26,0,0,29,30};
				for(int i: arr11)
				{
						System.out.print(i+" ");
				
				}	
				System.out.println("\n						Select  any one seat ");
				int y=sc.nextInt();
				int z=0;
				if(y>=arr11[0] && y<=arr11[29])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();

						System.out.println("					 Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("						seat Number not found");
					System.out.println();

					System.out.println("						choose once  Again from starting Onwards");
					System.exit(0);
					//Flights();
				}
				for(int i=0;i<arr11.length;i++)
				{
					if(y==arr11[i])
					{
						System.out.println("					You selected a seat number : "+y);
						z=i;
						break;
					}
				}
					System.out.println("						Press 1 to proceed to book the ticket: or else quit  the app ");
					int w = sc.nextInt();
					if(w==1)
					{
						arr11[z]=0;
						System.out.println("					Avilable seates are:");
						for(int m: arr11)
						{
							System.out.print(m+" ");
						}
						String yy=String.valueOf(y);
						//passanger_details(yy);
						System.out.println("\n				 press 1 continue for the payment or else quit the app");
						int xx=sc.nextInt();
						if(xx==1)
						{
							String x1="Air India";
							String  x2 ="BA 222";
							confirm(yy,x1,x2);
							

						}
						else
						{
							//back();
							//features();
							System.exit(0);

						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 2:
				 System.out.println("						Avilabe seates are:");
				int[]  arr21 ={1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,19,0,21,22,23,24,25,26,27,28,29,0};
				for(int a: arr21)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n					Select  any one seat ");
				int t=sc.nextInt();
				int h=0;
				if(t>=arr21[0] && t<=arr21[29])
				{
					
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


						System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("					seat Number not found");
					System.out.println();

					System.out.println("					choose once  Again ");
					System.exit(0);
					//Flights();
				}
				for(int i=0;i<arr21.length;i++)
				{
					if(t==arr21[i])
					{
						System.out.println("				You selected a seat number : "+t);
						h=i;
						break;
					}
				}
					System.out.println("					press 1 to proceed to book the ticket: or else quit the app ");
					int k = sc.nextInt();
					if(k==1)
					{
						arr21[h]=0;
						System.out.println("				Avilable seates are:");
						for(int j: arr21)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(t);
						System.out.println("\n			 press 1 continue for the payment or else quit");
						int cc=sc.nextInt();
						if(cc==1)
						{
							String y1="IndiGo";
							String  y2 ="AI 126";
							confirm(yy,y1,y2);
						}
						else
						{
							//back();
							//features();
							System.exit(0);
						}
						
					}
					else
					{
						//back();
						//break;
						System.exit(0);
					}
							
				break;
			case 3:
				 System.out.println("					Avilabe seates are:");
				System.out.println();

				int[]  arr31 ={1,2,3,4,5,6,7,8,9,10,11,12,0,14,15,16,17,0,19,20,0,22,23,24,25,26,27,0,29,30};
				for(int a: arr31)
				{
					System.out.print(a+" ");
				}
				System.out.println("\n				Select  any one seat ");
				int g=sc.nextInt();
				int f=0;
				if(g>=arr31[0] && g<=arr31[29])
				{
					System.out.println("						Wait a sec  checking the Avilability of the seat");
					for(int i =1;i<=5;i++)
					{
							try
							{
								Thread.sleep(1500);
							}
							catch(InterruptedException e){}
							System.out.println("				"+i+" sec");
					}

					System.out.println();


					System.out.println("				Hurray! seat is Avilable");
				}
				else
				{
					System.out.println("				seat Number not found");
					System.out.println();

					System.out.println("				choose once  Again ");
					System.exit(0);

					//Flights();
				}

				for(int i=0;i<arr31.length;i++)
				{
					if(g==arr31[i])
					{
						System.out.println("			You selected a seat number : "+g);
						f=i;
						break;
					}
				}
					System.out.println("				press 1 to proceed to book the ticket: or  Quit the app ");
					int d = sc.nextInt();
					if(d==1)
					{
						arr31[f]=0;
						System.out.println("			Avilable seates are:");
						for(int j: arr31)
						{
							System.out.print(j+" ");
						}
						String yy=String.valueOf(g);
						//passanger_details(yy);
						//System.out.println("\n continue for the payment");
						System.out.println("\n			 press 1 continue for the payment or else quit from the app");
						int zz=sc.nextInt();
						if(zz==1)
						{
							String z1="AirAsia India";
							String  z2 ="AF1735";
							confirm(yy,z1,z2);
						}
						else
						{
							//features
							//features();
							System.exit(0);
						}

						
					}
					else
					{
						System.exit(0);
						//features();
						//break;
					}
							
				break;

			default:
					
					quit();
					break;
		}
	}

	public static void  ticket()
	{
		String s1=Source_Book();
		String s2=Dest_Book();
		System.out.println(s1+".........."+s2);
		if(s1.equals(s2))
		{
			System.out.println("		Sorry You can not Book ticket Because Source and destination is same			");
			ticket();
			
		}
		else
		{
				System.out.println("				Select the Buses :");
				Buses();

				
		}	
	

	}
	public static void source(String s1)
	{
		int x=0;
		String[] arr={"Delhi","Mumbai","Bangalore","Kolkata ","Chennai ","Hyderabad ","Pune","Jaipur ","Ahmedabad ","Lucknow","Visakhapatnam","Coimbatore","Kochi","Bhubaneswar","Indore","Gurgaon","Noida","Assam"};
			
		
		for(int i=0;i<arr.length;i++)
		{
			if((s1.equalsIgnoreCase(arr[i].toLowerCase().trim())))
			{
				x=1;
				break;
			}
		}
			if(x==0)
			{
				System.out.println("						Sorry !Source city not found			");
				System.out.println();

				cities();
				System.out.println(" 						press 1 to continue to book ticket  or else log out from the app");
				System.out.println();

				int y =sc.nextInt();
				if(y==1)
				{
					Source_Book();
				}
				else
				{
					System.exit(0);
				}
			}				
	}
	public static void destination(String s2)
	{
		int w=0;
		String[] arr1={"Delhi","Mumbai","Bangalore","Kolkata ","Chennai ","Hyderabad ","Pune","Jaipur ","Ahmedabad ","Lucknow","Visakhapatnam","Coimbatore","Kochi","Bhubaneswar","Indore","Gurgaon","Noida","Assam"};
			
		
		for(int i=0;i<arr1.length;i++)
		{
			if((s2.equalsIgnoreCase(arr1[i])))
			{
				w=1;
				break;
			}
		}
			if(w==0)
			{
				System.out.println("				Destination city not found");
				cities();
				System.out.println("				press 1 to continue to book ticket    or else logout");
				int z =sc.nextInt();
				if(z==1)
				{
					Dest_Book();
				}
				else
				{
					System.exit(0);
				}
			}				
	}
 	public static void main(String[] args)
	{
		System.out.print(purpe);
		System.out.println(".....				please login with Your mobile Number to Book ticket......				");
		System.out.print(def);
		System.out.print(red);
		System.out.print(blink);
		System.out.println("					Enter the 10 Digit Mobile Number:								");
		System.out.print(def);
		long n = sc.nextLong();
		phno(n);
		System.out.print(blue);

		System.out.println("					Avilable features are:");
		System.out.println("					1.Add money to wallet.");
		System.out.println("					2.show wallet Balance.");
		System.out.println("					3.Avilabe cities are");
		System.out.println("					4.Book Ticket.");
		System.out.println("					5.Quit the App");
		System.out.println("					press above options to get facility:");
		System.out.print(def);

		features();
	}

}