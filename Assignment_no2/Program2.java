import person.Student;
import person.Faculty;
import java.util.Scanner;

public class Program2 {
   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);

     //For Student
     System.out.print("\nEnter your name: ");
     String name = in.nextLine();

     System.out.print("\nEnter your email id: ");
     String emailId = in.nextLine();

     System.out.print("\nEnter your contact number: ");
     long phoneNo = in.nextLong();

     System.out.print("\nEnter your roll number: ");
     long roll = in.nextLong();

     // Consume the newline character left from previous nextLong()
     in.nextLine();

     System.out.print("\nEnter your current course of study: ");
     String course = in.nextLine();

     System.out.print("\nEnter your Premises number: ");
     long premisesNumber = in.nextLong();

     System.out.print("\nEnter your Pincode: ");
     int pincode = in.nextInt();

     // Consume the newline character left from previous nextInt()
     in.nextLine();

     System.out.print("\nEnter your street: ");
     String street = in.nextLine();

     System.out.print("\nEnter your city: ");
     String city = in.nextLine();

     System.out.print("\nEnter your state: ");
     String state = in.nextLine();

     Student Obj1=new Student(name,premisesNumber,pincode,street,city,state,emailId,phoneNo,roll,course);

     System.out.print("\n\nPress any key to change address partially\n");
     System.out.print("\n1) Premises number");
     System.out.print("\n2) Pincode");
     System.out.print("\n3) Street");
     System.out.print("\n4) City");
     System.out.print("\n5) State");
     System.out.print("\nAny Other key for not changing address\n");
     System.out.print("\nEnter your choice : ");
     int choice=in.nextInt();
     in.nextLine();
     switch(choice){
        
        case 1: System.out.print("\nEnter your Premises number: ");
                premisesNumber = in.nextLong();
                Obj1.changePremisesNumber(premisesNumber);
                break;

        case 2: System.out.print("\nEnter your Pincode: ");
                pincode = in.nextInt();  
                Obj1.changePinCode(pincode);  
                break;

        case 3: System.out.print("\nEnter your street: ");
                street = in.nextLine(); 
                Obj1.changeStreet(street);
                break;

        case 4: System.out.print("\nEnter your city: ");
                city = in.nextLine();
                Obj1.changeCity(city);
                break;

        case 5: System.out.print("\nEnter your state: ");
                state = in.nextLine();
                Obj1.changeState(state);
                break;
     }
     Obj1.displayStudent();

     //For Faculty Member
     System.out.print("\n\n");
     
     System.out.print("\nEnter your name: ");
     name = in.nextLine();

     System.out.print("\nEnter your email id: ");
     emailId = in.nextLine();

     System.out.print("\nEnter your contact number: ");
     phoneNo = in.nextLong();

     System.out.print("\nEnter your Employee id: ");
     long employeeId = in.nextLong();

     // Consume the newline character left from previous nextLong()
     in.nextLine();

     System.out.print("\nEnter your department: ");
     String department = in.nextLine();

     System.out.print("\nEnter your specialization : ");
     String specialization=in.nextLine();

     System.out.print("\nEnter your Premises number: ");
     premisesNumber = in.nextLong();

     System.out.print("\nEnter your Pincode: ");
     pincode = in.nextInt();

     // Consume the newline character left from previous nextInt()
     in.nextLine();

     System.out.print("\nEnter your street: ");
     street = in.nextLine();

     System.out.print("\nEnter your city: ");
     city = in.nextLine();

     System.out.print("\nEnter your state: ");
     state = in.nextLine();

     Faculty Obj2=new Faculty(name,premisesNumber,pincode,street,city,state,emailId,phoneNo,employeeId,department,specialization);

     System.out.print("\n\nPress any key to change address partially\n");
     System.out.print("\n1) Premises number");
     System.out.print("\n2) Pincode");
     System.out.print("\n3) Street");
     System.out.print("\n4) City");
     System.out.print("\n5) State");
     System.out.print("\nAny Other key for not changing address\n");
     System.out.print("\nEnter your choice : ");
     choice=in.nextInt();
     in.nextLine();
     switch(choice){
        
        case 1: System.out.print("\nEnter your Premises number: ");
                premisesNumber = in.nextLong();
                Obj2.changePremisesNumber(premisesNumber);
                break;

        case 2: System.out.print("\nEnter your Pincode: ");
                pincode = in.nextInt();  
                Obj2.changePinCode(pincode);  
                break;

        case 3: System.out.print("\nEnter your street: ");
                street = in.nextLine(); 
                Obj2.changeStreet(street);
                break;

        case 4: System.out.print("\nEnter your city: ");
                city = in.nextLine();
                Obj2.changeCity(city);
                break;

        case 5: System.out.print("\nEnter your state: ");
                state = in.nextLine();
                Obj2.changeState(state);
                break;
     }
     Obj2.displayFaculty();
   } 
}
