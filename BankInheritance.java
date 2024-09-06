import java.lang.*;
import java.io.*;
class Customer
{
int account_no;
String customer_name;
int balance;
	void set(int no,String name)
	{
		account_no=no;		
		customer_name=name;
		balance=0;
	}
	void display()
	{
		System.out.println("account no : "+account_no);
		System.out.println("customername : "+customer_name);
		System.out.println("Balance amount : "+balance);

	}
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	 void withdraw(int amount)
	{
		balance=balance-amount;
	}
}
class Interest extends Customer
{
double ibalance;
void calInterest()
{
ibalance=balance*(0.07);
}
void printInterest()
{
System.out.println("interest till date : "+ ibalance);
}
}
class BankInheritance {
public static void main(String args[]) {
Interest c1=new Interest();
System.out.println("creating new customer account");
c1.set(101,"rajesh");
c1.display();
System.out.println("after deposit");
c1.deposit(5000);
c1.display();
System.out.println("after withdraw");
c1.withdraw(2000);
c1.display();
c1.calInterest();
c1.printInterest();
}
}