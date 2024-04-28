package memberlist;
import java.util.Scanner;
public class MemberLibrary{
    public int memberId,noBooksIssued,limit;
    public String name,dob; 
    public int []issuedBookid;
    public MemberLibrary(){//Default Constructor
    }

    public MemberLibrary(int memberId,String name,String dob){  //Parameterised Constructor
      this.name=name;
      this.memberId=memberId;
      this.dob=dob;
      noBooksIssued=0;
      limit=5;
      issuedBookid=new int[5];
    }

    //Display Function
    public void display(){
      System.out.print("\nMember id : "+memberId);
      System.out.print("\nName of the member : "+name);
      System.out.print("\nDate of birth of the member : "+dob);
      System.out.print("\nNo of books issued : "+noBooksIssued);
    }
    
     //Function to display all members in the list
    public void displayList(MemberLibrary []arr,int size){
      for(int i=0;i<size;i++){
        System.out.print("\n");
        arr[i].display();
      }
      System.out.print("\n");
    }
    
    //Function to add members in the library member list
    public void addMemberList(MemberLibrary []arr,int size){
      int memberId,flag;
      String name,dob;
      String title;
      Scanner in=new Scanner(System.in);

      do{ flag=1;
          System.out.print("\nEnter member id : ");
          memberId=in.nextInt();
          for(int i=0;i<size;i++){
          if(memberId==arr[i].memberId){
          flag=0;
          break;
          }
        }
        if(flag==0)
        System.out.print("\nMember id already exist enter a valid member id");
      }while(flag==0);

      System.out.print("\nEnter your name : ");
      in.nextLine();
      name=in.nextLine();
      System.out.print("\nEnter your date of birth (dd/mm/yyyy) : ");
      dob=in.nextLine();

      MemberLibrary Obj=new MemberLibrary(memberId,name,dob);
      arr[size]=Obj;
    }

    //Function to Display a single member
    public void displaySingleMember(MemberLibrary []arr,int size){
       Scanner in=new Scanner(System.in);
       int memberId;
       System.out.print("\nEnter the member id : ");
       memberId=in.nextInt();
       int flag=0;
       for(int i=0;i<size;i++){
         if(memberId==arr[i].memberId){
            arr[i].display();
            flag=1;
            break;
         }
       }
       if(flag==0)
       System.out.print("\nGiven member id is invalid !");
    }
}