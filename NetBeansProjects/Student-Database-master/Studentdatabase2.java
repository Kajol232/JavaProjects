package commercial;
import java.util.Scanner;
public class Studentdatabase2 {
public static void main(String[] args)
{
	System.out.println("Enter the number of students you want to enroll: ");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	
	int[] studentdata=new int[n];
	for(int i=0;i<studentdata.length-1;i++) {
		First f1 = new First();
		f1.enroll();
		f1.payBalance();
	}
	
}
}
