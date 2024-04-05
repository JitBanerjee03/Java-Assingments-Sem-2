import java.util.Scanner;
class function{
    public void show(int n){
      System.out.println(n);
    }

    public void show(double n){
        System.out.println(n);
      }
}
public class Program6{

    public static void main(String[] args){
      
      function Obj=new function();
      
      Scanner input=new Scanner(System.in); 
      
      int i;
      short s;
      
      System.out.print("\nfirst enter the value for int : ");
      i=input.nextInt();
      Obj.show(i);

      System.out.print("\nsecond enter the value for short : ");
      s=input.nextShort();
      Obj.show(s);

      System.out.print("\nThird enter the value for double : ");
      double d=input.nextDouble();
      Obj.show(d);
    }
}