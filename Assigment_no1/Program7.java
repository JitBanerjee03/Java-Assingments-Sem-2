import java.util.Scanner;
class Student{
    private String name;
    private int roll,score;

    public void Input(String str,int r,int s){
      
      name=str;
      roll=r;
      score=s; 
    }

    public void Display(){
      
        System.out.println("\nName = "+name);
        System.out.println("\nRoll = "+roll);
        System.out.println("\nScore = "+score);
      }

    public void Copy(Student Ob){
        Ob.name=name;
        Ob.roll=roll;
        Ob.score=score;
    }
}
public class Program7{
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);

      System.out.print("\nEnter the name of the student : ");
      String name=input.nextLine();

      System.out.print("\nEnter the roll of the student : ");
      int r=input.nextInt();

      System.out.print("\nEnter the score of the student : ");
      int s=input.nextInt();

      Student Obj=new Student();
      Obj.Input(name,r,s);

      Obj.Display();

      Student temp=new Student();
      Obj.Copy(temp);

      System.out.print("\nContent of the object temp is \n");
      temp.Display();

    }
}