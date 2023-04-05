package practice;
import java.util.Scanner;
public class prime {
public static void main(String[] args) {
Double num;
System.out.println("Enter the number:");
Scanner in=new Scanner(System.in);
num=in.nextDouble();
boolean flag=false;
	for(int i=2;i<=num/2;++i) {
		if (num%i==0) {
			flag=true;
			break;
	}
	}
if(!flag)
{
	System.out.println(num+"is a prime number");
}	
else
{	
	System.out.println(num+"is not a prime number");
}
}
}