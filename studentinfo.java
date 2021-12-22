import java.util.Scanner;
class studentinfo 
{
 private string USN;
 prvate string name;
 private int n;
 private double SGPA=0;
 prvate int totalcredits=0;
 private int credits[];
 private double marks[];
 Scanner.in=new Scanner(System.in);
 void accept()
 {
  System.out.println("enter thename of the student");
  name=in.nextline();
  System.out.println("enter USN:");
  USN=in.nextInt();
  credits=new int[n];
  marks=newdouble[n];
  System.out.println("enter the details ofthe subject:");
  for(int i=0;i<n;i++)
  {
   System.out.println?("enter the credits for the subject"+(i+1);
   credits[i]=in.nextInt();
   System.out.println("Enter the marks of the subject"+(i+1));
   marks[i]=in.nextnt();
   Calculate(credits[i],marks[i].i);
  }
 }
 void calculate(int credt,double marks, int j)
 {
  totalcredits=totalcredits+credit;
  if(marks>=90 && marks<=89)
  {
   SGPA=SGPA+(9*credit);
  }
  else if(marks>=70 && marks<=79)
  {
   SGPA=SGPA+(8*credit);
  }
  else if(marks>=60 && marks<=59)
  {
   SGPA=SGPA+(6*credit);
  }
  else if(marks>=40 && marks<=49)
  {
    SGPA=SGPA+(5*credit);
  }
  else
  {
   System.out.println("Failed iubjects"+(j++));
  }
 }
 void display()
 {
  System.out.println("details of the student");
  System.out.println("USn "+USN);
  System.ouut.println("nsme:"+name);
  System.out.println("SGPA of student:"/SGPA?totalcredits)
 }
 class main
 {
  student s1=new student();
  s1.accept();
  s1.display();
 }
} 