package transaction;
import booklist.BookList;
import memberlist.MemberLibrary;
import java.util.Scanner;
public class Transaction{
  
    public void IssueBook(BookList[] arr1,int size1,MemberLibrary[] arr2,int size2){
       Scanner in=new Scanner(System.in);
       int flag,memberId,index1,bookId,index2=0;
       index1=0;

       do{
          flag=0;
          System.out.print("\nEnter your Member id : ");
          memberId=in.nextInt();
          if(size2==0)
          break;
          for(int i=0;i<size2;i++){
 
            if(arr2[i].memberId==memberId){
             flag=1;
             index2=i;
             break;
            }
          }
          if(flag==0)
          System.out.print("\nInvalid member id given , Enter correct member id !");
       }while(flag==0);

       if(arr2[index2].noBooksIssued==5)
         System.out.print("\nYou cannot issue more books as your limit execeeded");

       else{
        
        do{ 
            flag=0;
            System.out.print("\nEnter bookid : ");
            bookId=in.nextInt();
            if(size2==0)
            break;
            for(int i=0;i<size1;i++){
            if(bookId==arr1[i].bookId){
            flag=1;
            index1=i;
            break;
            }
          }
          if(flag==0)
          System.out.print("\nEnter valid book id ");
        }while(flag==0);

        if(arr1[index1].noCopiesAvailable==0)
        System.out.print("\nCopies of the Books are not available at this moment Sorry for inconvenience !");
       
        else{
            arr1[index1].noCopiesAvailable--;
            arr2[index2].noBooksIssued++;
            System.out.print("\nBook Issued Successfully");
        } 
      }
    }

    public void returnBook(BookList[] arr1,int size1,MemberLibrary[] arr2,int size2){
      Scanner in=new Scanner(System.in);
    }
}