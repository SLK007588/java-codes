package practice;
import java.util.Scanner;
public class staff {
String staffid,name;
long phone;
Float salary;
public void accept()
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Staff id:");
	staffid=in.next();
	System.out.println("Enter Name:");
	name=in.next();
	System.out.println("Enter Phone Number:");
	phone=in.nextLong();
    System.out.println("Enter Salary:");
    salary=in.nextFloat();
}
public void display()
{
	System.out.println("Staff id:"+staffid);
	System.out.println("name:"+name);
    System.out.println("phone number:"+phone);
    System.out.println("salary:"+salary);
}
}
class Teaching extends staff
{
	String domain;
	int n;
	public void accept()
	{
		super.accept();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Domain : ");
		domain=in.next();
		System.out.println("Enter number of publications : ");
		n=in.nextInt();
		System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("Domain : "+domain);
		System.out.println("Publicatons : "+n);
		System.out.println("\n");
	}
}
class Technical extends staff
{
	String skill;
	public void accept() {
		super.accept();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter technical skills:");
		skill=in.nextLine();
		System.out.println("\n");
	}
	public void display() {
	super.display();
	System.out.println("Technical Skills:");
	System.out.println("\n");
	}
	}
class Contract extends staff
{
	int period;
	public void accept() {
		super.accept();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Period:");
		period=in.nextInt();
		System.out.println("\n");
	}
	public void display() {
	super.display();
	System.out.println("Contract Period:"+period);
	}
	}	
class four
{
	public static void main(String[]args)
	{
		Teaching teaching=new Teaching();
		System.out.println("Enter the details of Teaching Staff");
		teaching.accept();
		Technical technical=new Technical();
		System.out.println("Enter the details of Technical Staff");
		technical.accept();
		Contract contract=new Contract();
		System.out.println("Enter the details of Contract Staff");
		contract.accept();
	System.out.println("The details of Teaching staff");
	teaching.display();
	System.out.println("The details of Technical staff");
	technical.display();	
	System.out.println("The details of Contract staff");
	contract.display();
	}
}