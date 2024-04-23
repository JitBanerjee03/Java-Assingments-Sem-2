package person;
public class Faculty extends Person{
  long employeeId;
  String department,specialization;

  public Faculty(String name,long premisesNumber,int pinCode,String street,String city,String state,String emailId,long pnoneNo,long employeeId,String department,String specialization){
    super(name,premisesNumber,pinCode,street,city,state,emailId,pnoneNo);
    this.employeeId=employeeId;
    this.department=department;
    this.specialization=specialization;
  }

  public void displayFaculty(){
    displayPerson();
    System.out.print("\n_ _ _ _ _ _Faculty member details_ _ _ _ _ _ ");
    System.out.print("\nEmployee Id : "+employeeId);
    System.out.print("\nDepartment : "+department);
    System.out.print("\nSpecialization : "+specialization);
  }
}