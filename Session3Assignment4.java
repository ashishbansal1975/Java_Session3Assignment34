

// Display the details and result of at-least three students.



import java.lang.*;
import java.io.*;
class student
{
	String name;
	int roll_no;
	int sub1,sub2;
	int total;
	float per;
	void getdata() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name of Student : ");
		name = br.readLine();
		System.out.print("Enter Roll No. of Student : ");
		roll_no = Integer.parseInt(br.readLine());
		System.out.print("Enter marks out of 100 of 1st subject: ");
		sub1 = Integer.parseInt(br.readLine());
		System.out.print("Enter marks out of 100 of 2nd subject : ");
		sub2 = Integer.parseInt(br.readLine());
	}
	void show()
	{
		total=sub1+sub2;
		per=(total*100)/200;
		System.out.println ("Roll No. = "+roll_no);
		System.out.println ("Name = "+name);
		System.out.println ("Marks of 1st Subject = "+sub1);
		System.out.println ("Marks of 2nd Subject = "+sub2);
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+per+"%");
	}
}
public class Session3Assignment4
{
	public static void main(String args[]) throws IOException
	{
		student s1 = new student();
                student s2 = new student();
                student s3 = new student();
                System.out.println("Enter the details of first student : ");
		s1.getdata();
                System.out.println("Enter the details of second student : ");
		s2.getdata();
                System.out.println("Enter the details of third student : ");
		s3.getdata();


                System.out.println("The details of first student are : ");
		s1.show();

                System.out.println("The details of second student are : ");
		s2.show();


                System.out.println("The details of third student are : ");
		s3.show();

	}
}