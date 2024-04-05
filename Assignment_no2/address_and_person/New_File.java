package address_and_person;
class Address{   //Address class
    int premisesNo,pin;
    String street,city,state;

    public Address(int p_no,int P_code,String str,String City,String State){
      premisesNo=p_no;
      pin=P_code;
      street=str;
      city=City;
      state=State;
    }

    public void Change_Address_PremisesNo(int p_no){
      premisesNo=p_no;
    } 

    public void Change_Address_Pincode(int P_code){
      pin=P_code;
    } 

    public void Change_Address_Street(String str){
      street=str;  
    } 

    public void Change_Address_City(String City){
      city=City;
    } 

    public void Change_Address_State(String State){
      state=State;
    }

    public void Show_Address(){
        System.out.print("\nPremises number : "+premisesNo);
        System.out.print("\nStreet : "+street);
        System.out.print("\nCity : "+premisesNo);
        System.out.print("\nPinCode : "+pin);
        System.out.print("\nState : "+state);
    }
}

class Person extends Address{  //Person class
  
  String name,emailId;
  long phoneNo;

  public Person(int p_no,int P_code,String str,String City,String State,String p_n,String email,long phone){
    super(p_no,P_code,str,City,State);
    name=p_n;
    emailId=email;
    phoneNo=phone;
  }

  public void Show_Person_Details(){
    System.out.print("\nName : "+name);
    Show_Address();
    System.out.print("\nPhone no : "+phoneNo);
    System.out.print("\nE-mail id : "+emailId);
  }
}
public class New_File{
    public static void main(String []args){
    
    }
}