import java.util.Scanner;
import booklist.BookList;
import memberlist.MemberLibrary;

public class Program3{
    public static void main(String []args){
      int choice;
      /**
       * viii) Issue a book ( check book validity and availability, check member validity and eligibility to get a book, once passes through the validations add an entry into transaction list and update counts in corresponding booklist and memberlist entries) ix) book return book ( check the validity of corresponding  issue with book id and member id and once passes through the validations update the transaction entry by marking member id as ‘xxxx’  and update counts in corresponding booklist and memberlist entries)
Consider the list as arrays. While working with arrays it is to be ensured that use of indices 
       */
      Scanner in=new Scanner(System.in);
      BookList []array=new BookList[10];
      int size=0;
      MemberLibrary []memberList=new MemberLibrary[10];
      int membersize=0;

      do{
          System.out.print("\n_ _ _ _ _ _ _ _ _ _MENU_ _ _ _ _ _ _ _ _ _\n");
          System.out.print("\n1) Add new book in the booklist");
          System.out.print("\n2) Add more copies of the book");
          System.out.print("\n3) Show all book details");
          System.out.print("\n4) Show details of a book");
          System.out.print("\n5) Add members in the library member list");
          System.out.print("\n6) Show all members");
          System.out.print("\n7) Show details of a member");
          System.out.print("\n8) Issue a book");
          System.out.print("\n9) Return a book\n");
          System.out.print("\nEnter your choice : ");
          choice=in.nextInt();

          switch(choice){

             case 1 : if(size==10)
                      System.out.print("\nCannot add more books since the booklist limit is execeded");
                      else{
                        new BookList().addNewBook(array,size);
                        size++;
                      }
                      break;

            case 2 : new BookList().addNo_OfCopies(array,size);
                     break;
             
             case 3 : new BookList().displayList(array,size);
                      break;

             case 4 : new BookList().displaySingleBook(array,size);
                      break;

             case 5: if(membersize==10)
                      System.out.print("\nCannot add more members since the memberlist limit is execeded");
                      else{
                        new MemberLibrary().addMemberList(memberList,membersize);
                        membersize++;
                      }
                      break;

             case 6: new MemberLibrary().displayList(memberList,membersize);
                     break;

             case 7 : new MemberLibrary().displaySingleMember(memberList,membersize);
                      break;
          }

          System.out.print("\nPress 1 to continue and any other key to exit : ");
          choice=in.nextInt();
      }while(choice==1);
    }
}