import java.util.Scanner;

class Book
{
 String name, author;
 int price,num_pg;

 Book()
 {}

 Book(String name, String author,int price,int num_pg)
 {
  this.name=name;
  this.author=author;
  this.price=price;
  this.num_pg=num_pg;
 }
 
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the NAME of the book :");
  name=sc.next(); 
  System.out.println("Enter the AUTHOR of the book :");
  author=sc.next();
  System.out.println("Enter the PRICE of the book");
  price=sc.nextInt();
  System.out.println("Enter the NO. of PAGES of the book");
  num_pg=sc.nextInt();
 }
 public String toString()
 {
  return("NAME :"+name+"\t"+ "AUTHOR :"+author+ "\t"+ "Price :"+price+"\t"+ "Number of Pages:"+num_pg);
 }
 
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);
  Book B1=new Book("Struggle","Toshin",499,700);
  System.out.println("Constructor values:\n"+B1);
  System.out.println("Enter the number of book:");
  int n=S.nextInt();
  Book b[]=new Book[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("details of the book"+(i+1));
   System.out.println(b[i]);
  }
 }
}