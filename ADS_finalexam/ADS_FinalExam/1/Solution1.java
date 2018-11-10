import java.util.Scanner;
class Student
{
	String Name;
	String Rollno;
	double total_marks;
	public Student(String name, String rollno, double total_marks) {
		super();
		Name = name;
		Rollno = rollno;
		this.total_marks = total_marks;
	}

	@Override
	public String toString() {
		return Name+"";
	}
}
class Hashing
{
	int m;

	public Hashing(int m) {
		super();
		this.m = m;
	}
	public int hashfunction(String st)
	{
		int sum=0;
		for(int i=0;i<st.length();i++) {
			sum+=i*st.charAt(i);

		}
		sum=sum%m;
		
		return sum;
	}
	
}
public class Solution1 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
Student student[]=new Student[n1*8];
Hashing h=new Hashing(n1*8);
String se=s.nextLine();
String string[]=new String[n1];
for(int i = 0;i<n1;i++)
{
	String s1=s.nextLine();
	
	String s2[]=s1.split(",");
	int hc=h.hashfunction(s2[0]);
	string[i]=s2[0];
	Student stud=new Student(s2[1],s2[0],Double.parseDouble(s2[2]));
	student[hc]=stud;
	
	
}

int n2=s.nextInt();
String x=s.next();
int c=0;
for(int i = 0;i<n2;i++)
{
	String s1=s.nextLine();
	 c=0;
	String s2[]=s1.split(" ");
	/*for(int j = 0;j<string.length;j++)
	{
		if(s2[1].equals(string[j]))
		{
			c++;
			break;
		}
	}
	if(c==1)
	{*/
	
	switch (s2[2])
	{
	case "1":System.out.println(student[h.hashfunction(s2[1])].Name);
		break;
	
	case "2":
		System.out.println(student[h.hashfunction(s2[1])].total_marks);break;
	}
/*}
	else
	{
		System.out.println("Student doesn't exists...");
	}*/
}

	
}
}
