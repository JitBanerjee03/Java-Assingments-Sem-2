import address_and_person.New_File;

class Student extends Person{  //student class
  long rollNumber;
  String course;

  public Student(int p_no,int P_code,String str,String City,String State,String p_n,String email,long phone,long roll,String course){
    super(p_no,P_code,str,City,State,p_n,email,phone);
    rollNumber=roll;
    this.course=course; 
  }
  public void Student_Details(){
    Show_Person_Details();
    System.out.print("\nStudent roll : "+rollNumber);
    System.out.print("\nCourse of the student : "+course);
  }
}

class Employee extends Person{  //faculty class
  long employeeId;
  String department,specialization;

  public Employee(int p_no,int P_code,String str,String City,String State,String p_n,String email,long phone,long e_id,String dept,String specialization){
    super(p_no,P_code,str,City,State,p_n,email,phone);
    employeeId=e_id;
    department=dept;
    this.specialization=specialization;
  }
  public void Student_Details(){
    Show_Person_Details();
    System.out.print("\nEmployee id : "+employeeId);
    System.out.print("\nDepartment : "+department);
    System.out.print("\nSpecialization : "+specialization);
  }
}

public class Program2{
    public static void main(String []args){
      
    }
}