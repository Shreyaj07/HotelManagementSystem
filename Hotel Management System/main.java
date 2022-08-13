
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Guest h=new Guest();
		int choice=0,choice1=0;
		String c1;

		do {
			System.out.println("\t\t1]Hotel Management \n\t\t2]Customer");
			System.out.println("Choose correct option : ");
			int op=sc.nextInt();

			switch(op)
			{
			case 1->{
				do {
					System.out.println("\n\t\t(I)nsertion of Room Info\n\t\t(U)pdate Details\n\t\t(S)earch\n\t\t(Di)splay Details\n\t\tDelete (R)oom ");
					System.out.println("Please Enter the valid Command : ");
					c1=sc.next();
					switch(c1)
					{
					case "I"->{
						h.RoomInfo();
					}
					case "U"->{
						h.Update();
					}
					case "S"->{
						node ptr=h.Search();
						h.print(ptr);
					}
					case "Di"->{
						h.Display();
					}
					case "R"->{
						System.out.println("Enter Rent of room to be deleted : ");
						int key=sc.nextInt();
						h.Delete(key);
						System.out.println("Room removed from service Successfully...");
					}
					}
					System.out.println("Do you want to continue with Hotel Changes : press 1 ");
					choice1=sc.nextInt();
				}while(choice1==1);
			}

			case 2->{
				do {
					System.out.println("\n\t\tWelcome to Infinex Hotel ");
					System.out.println("\n\t\tRoom (D)etails\n\t\tFood (O)rder\n\t\t(C)heckout");
					System.out.println("Please Enter the valid Command : ");
					String c=sc.next();
					switch(c)
					{
					case "D"->{
						h.RoomDetails();
					}
					case "O"->{
						h.Order();
					}
					case "C"->{
						h.Checkout();
					}
					}
					System.out.println("Do you want to continue searching room: press1");
				}while(sc.nextInt()==1);

			}
			default ->{
				System.out.println("*** Invalid Input ***");
			}
			}

			System.out.println("Do you want to Continue : press 1");
			choice=sc.nextInt();
		}while(choice==1);
		System.out.println("Thank You.....!");

	}


}
