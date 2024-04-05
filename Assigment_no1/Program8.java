import java.util.Scanner;

class Student1{
  //Attribuest of the class Student1
  String name;
  int roll,score;

  //1) Constructor with only one parameter 
  public Student1(int r){
    roll=r;
  }

  //2) Constructor with two parameters
  public Student1(int r,String str){
    roll=r;
    name=str;
  }

  //3)Constructor with three parameters
  public Student1(int r,String str,int s){
    roll=r;
    name=str;
    score=s;
  }

  //Constructor without any parameter
  public Student1(){
  }

  //copy constructor
  public Student1(Student1 obj){
    name=obj.name;
    roll=obj.roll;
    score=obj.score;
  }

  //Display Function
  public void Display(){
    System.out.println("The name of the Student1 ="+name);
    System.out.println("The roll of the Student1 ="+roll);
    System.out.println("The score of the Student1 ="+score);
  }
}

public class Program8{
    public static void main(String []args){
       
      Scanner input=new Scanner(System.in);
      int r,s;

      //For Constructor 1
      System.out.print("\nEnter roll of the Student1 for creating object1 :");
      r=input.nextInt();
      Student1 Ob1=new Student1(r);
      Ob1.Display();

      //For Constructor 2
      System.out.print("\nEnter roll of the Student1 for creating object2 :");
      r=input.nextInt();
      System.out.print("\nEnter name of the Student1 for creating object2 :");
      String str=input.next();
      Student1 Ob2=new Student1(r,str);
      Ob2.Display();

       //For Constructor 3
      System.out.print("\nEnter roll of the Student1 for creating object3 :");
      r=input.nextInt();
      System.out.print("\nEnter name of the Student1 for creating object3 :");
      str=input.next();
      System.out.print("\nEnter the score of the Student1 for creating objext3 :");
      s=input.nextInt();
      Student1 Ob3=new Student1(r,str,s);
      Ob3.Display();

      //Copy constructor
      System.out.print("\nDeep copy of Obj3 to Obj4\n");
      Student1 Obj4=new Student1(Ob3);
      Obj4.Display();

    }
}