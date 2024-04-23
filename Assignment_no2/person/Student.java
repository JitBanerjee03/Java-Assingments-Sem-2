package person;
public class Student extends Person{
  long rollNo;
  String course;

  public Student(String name,long premisesNumber,int pinCode,String street,String city,String states,String emailId,long pnoneNo,long rollNo,String course){
    super(name,premisesNumber,pinCode,street,city,states,emailId,pnoneNo);//calling the constructor Person which is the parent class of Student
    this.rollNo=rollNo;
    this.course=course;
  }

  public void displayStudent(){
    displayPerson();
    System.out.print("\n_ _ _ _ _ _Student Details_ _ _ _ _ _ ");
    System.out.print("\nRoll number : "+rollNo);
    System.out.print("\nCourse of study : "+course);
  }
}