package practice;
import java.util.Scanner;
public class arithmetic {
public static void main(String[] args) {
char operator;
Double num1,num2,result;
Scanner in=new Scanner(System.in);
System.out.println("Choose operation to perform +,-,*,/");
operator=in.next().charAt(0);
System.out.println("Enter the first number");
num1=in.nextDouble();
System.out.println("Enter the second number");
num2=in.nextDouble();
switch(operator) {
case'+':
	result=num1+num2;
	System.out.println(num1+"+"+num2+"="+result);
	break;
case'-':
	result=num1-num2;
	System.out.println(num1+"-"+num2+"="+result);
	break;
case'*':
	result=num1*num2;
	System.out.println(num1+"*"+num2+"="+result);
	break;
case'/':
	result=num1/num2;
	System.out.println(num1+"/"+num2+"="+result);
	break;
default:
	System.out.println("Invalid Operator!");
	break;
}
in.close();
}
}