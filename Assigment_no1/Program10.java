import java.util.Scanner;

//Defination of the Metric class
class Metric{
   
   float mile,kilometer;
   
   public void mileToKilometers(float m){
     mile=m;
     kilometer=(1.5f*mile);
   }

   public void kilometersToMile(float k){
     kilometer=k;
     mile=kilometer/1.5f;
   }

   public void Display(){
     System.out.println("Distance in Miles = "+mile);
     System.out.println("Distance in Kilometer = "+kilometer);
   }
}
public class Program10{
    public static void main(String []args){
       Scanner in=new Scanner(System.in);
       System.out.print("\nEnter the distance in miles : ");
       float m=in.nextFloat();
       Metric Ob1=new Metric();
       Ob1.mileToKilometers(m);
       Ob1.Display();

       System.out.print("\nEnter the distance in kilometers : ");
       float k=in.nextFloat();
       Metric Ob2=new Metric();
       Ob2.kilometersToMile(k);
       Ob2.Display();
    }
}

