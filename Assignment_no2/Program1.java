import java.util.Scanner;  //For input
import java.lang.Math;     //For generating random numbers for user id

class Bank{
    //attributes
    String name;
    long phoneNo,c_id,current_loan,credit_limit;
    boolean isPrivileged;

    public Bank(String str,long p,long c,boolean ans){  //Constructor
      name=str;
      phoneNo=p;
      c_id=c;
      isPrivileged=ans;
      current_loan=0;
      
      if(isPrivileged==true)
      credit_limit=10000000;

      else
      credit_limit=5000000;

    }

    public void change_Attributes_name(String str){  //Function to change the name
      name=str;
    }

    public void change_Attributes_phone(long ph){  //Function to change the phone number
      phoneNo=ph;
    }

    public boolean loanIsSanctioned(long ask_loan){
       
       if(ask_loan>credit_limit)
       return false;

       else if(credit_limit-current_loan>ask_loan){
        current_loan=ask_loan+current_loan;
        credit_limit=credit_limit-current_loan;
        return true;
      }

      return false;

    }

    public void Display(){
      System.out.print("\nName : "+name);
      System.out.print("\nPhone : "+phoneNo);
      System.out.print("\nCustomer id : "+c_id);
      System.out.print("\nCurrent loan : "+current_loan);
      System.out.print("\nCredit limit : "+credit_limit);
      System.out.print("\n");
    }
}
public class Program1{
    public static void main(String[] args){
      
       Scanner input=new Scanner(System.in);
       
       System.out.print("\nEnter your name : ");
       String name=input.nextLine();
       
       System.out.print("\nEnter your mobile number : ");
       long phoneNo=input.nextLong();

       long id=(long)(Math.random()*10000000000L);
       System.out.print("\nYour randomly generated customer id is "+id);

       Bank User1=new Bank(name,phoneNo,id,true);

       User1.Display();

       System.out.print("\nEnter your loan amount : ");
       long loan=input.nextLong();
       
       if(User1.loanIsSanctioned(loan))
       {
          System.out.print("Your loan is sanctioned");
          User1.Display();
       }

       else
       System.out.print("\nYour loan is not sanctioned");
    }
}