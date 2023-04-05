package practice;
import java.util.Scanner;
public class quadratic {
public static void main(String[] args) {
int a,b,c;
double root1,root2;
System.out.println("Enter the coefficients");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
double determinant=b*b-4*a*c;
if(determinant>0) {
	root1=(-b+(determinant))/(2*a);
	root2=(-b-(determinant))/(2*a);
System.out.format("root1=%.2f and root2=%.2f",root1,root2);
}
else if(determinant==0) {
	root1=root2=-b/(2*a);
	System.out.format("root1=root2=%.2f",root1);
	}
else {
	double real=-b/(2*a);
	double imaginary=Math.sqrt(-determinant)/(2*a);

	System.out.format("root1=%.2f+%.2fi",real,imaginary);
	System.out.format("\nroot2=%.2f+%.2fi",real,imaginary);
}
}
}