package person;
public class Address{
    long premisesNumber;
    int pinCode;
    String street,city,state;

    public Address(long premisesNumber,int pinCode,String street,String city,String state){
      this.premisesNumber=premisesNumber;
      this.pinCode=pinCode;
      this.street=street;
      this.city=city;
      this.state=state;
    }

    public void displayAddress(){
        System.out.print("\n_ _ _ _ _ _Address Details_ _ _ _ _ _");
        System.out.print("\nPremises number : "+premisesNumber);
        System.out.print("\nPincode : "+pinCode);
        System.out.print("\nStreet : "+street);
        System.out.print("\nCity : "+city);
        System.out.print("\nState : "+state);
    }

    public void changePremisesNumber(long premisesNumber){
      this.premisesNumber=premisesNumber;
    }

    public void changePinCode(int pinCode){
      this.pinCode=pinCode;
    }

    public void changeStreet(String street){
      this.street=street;
    }

    public void changeCity(String city){
      this.city=city;
    }

    public void changeState(String state){
      this.state=state;
    }
}