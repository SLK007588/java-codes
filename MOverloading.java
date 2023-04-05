package practice;
import java.util.Scanner;
public class MOverloading {
int add(int a,int b)
{
	int sum=a+b;
	return sum;
}
int add(int a,int b,int c)
{
	int sum=a+b+c;
	return sum;
}
float add(float a,float b)
{
	float sum=a+b;
	return sum;
}
public static void main(String[]args){
MOverloading obj=new MOverloading();
int s1=obj.add(10,20);
int s2=obj.add(10,20,30);
float s3=obj.add(2.2f,2.2f);
System.out.println("Method Overload Sum1="+s1);
System.out.println("Method Overload Sum2="+s2);
System.out.println("Method Overload Sum3="+s3);
}
}