package commercial;

import java.util.Scanner;

public class First {
private String fname;
private String lname;
private int gradeyear;
private String courses="";
private int tutionbalance=0;
private String student_id;
private int costofcourse=600;
private static int id=1000;
//constructor for taking information
public First()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your First Name: ");
	this.fname=in.next();
	System.out.println("Enter your Last Name: " );
	this.lname=in.next();	
	System.out.println("Enter Your GradeYear :\n [1]Freshman \n[2] Sophomore \n[3] Junior \n[4] Senior \n");
	this.gradeyear=in.nextInt();	
	setStudentId();
	System.out.println("Name: "+fname+" "+lname+"\nGrade-year: "+gradeyear+"\nStudentID:  "+student_id+"");
	System.out.print("\nEnter Your Course Name: ");
}
//unique id generator
public void setStudentId() {
	id++;
	student_id =gradeyear+""+id;
	
}

//enrolling courses:-

public void enroll() {
	do {
		
		System.out.print("Enter Q to Quiet: ");
		Scanner in=new Scanner(System.in);
		
		String course=in.nextLine();
		if(!course.equals("Q")) {
			courses=courses+"\n"+course;
			tutionbalance=tutionbalance+costofcourse;
		}
		
		else {
			
			break;
		}

	}
	
	while(1!=0);
	System.out.println("courses you are enrolled in: "+ courses+"\n");
	System.out.println("Total Tuition fees to pay: "+tutionbalance);
	
	
}
public void viewBalance() {
	System.out.println("Total Balance:RS. "+tutionbalance);
	
	
}
public void payBalance() {
	System.out.println("Pay the amount: ");
	Scanner in = new Scanner(System.in);
	int payment=in.nextInt();
	tutionbalance=tutionbalance-payment;
	viewBalance();
	
}







}
