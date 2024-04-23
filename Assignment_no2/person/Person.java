package person;
public class Person extends Address{
    String name,emailId;
    long pnoneNo;
    
    //Calling the constructor of the Person class
    public Person(String name,long premisesNumber,int pinCode,String street,String city,String state,String emailId,long pnoneNo){
      super(premisesNumber,pinCode,street,city,state);  //calling the fucntion of the super class
      this.name=name;
      this.emailId=emailId;
      this.pnoneNo=pnoneNo;
    }

    public void displayPerson(){
      System.out.print("\n_ _ _ _ _ _Personal Details_ _ _ _ _ _");
      System.out.print("\nName : "+name);
      System.out.print("\nEmail id : "+emailId);
      System.out.print("\nPhone number : "+pnoneNo);
      displayAddress();
    }
}