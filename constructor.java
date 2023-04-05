package practice;
import java.util.Scanner;
public class constructor {
int id;
String name;
constructor()
{
	System.out.println("This is default constructor");
	System.out.println("Student Id:"+id);
	System.out.println("Student Name:"+name);
}
constructor(int i,String n)
{
System.out.println("This is parameterized constructor:");
id=i;
name=n;
System.out.println("Student Id:"+id);
System.out.println("Student Name:"+name);
}
public static void main(String[]args)
{
	constructor s=new constructor();
	constructor student=new constructor(10,"Lalit");
}
}