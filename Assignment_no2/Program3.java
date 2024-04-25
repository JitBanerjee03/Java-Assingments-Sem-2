import java.util.Scanner;
import booklist.BookList;
import memberlist.MemberLibrary;
import transaction.Transaction;
public class Program3{
    public static void main(String []args){
      int choice;
      Scanner in=new Scanner(System.in);
      BookList []array=new BookList[10];
      int size=0;
      MemberLibrary []memberList=new MemberLibrary[10];
      int membersize=0;

      do{
          System.out.print("\n_ _ _ _ _ _ _ _ _ MENU _ _ _ _ _ _ _ _ _\n");
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

             case 8 : System.out.print("\n"+size);
                      System.out.print("\n"+membersize);
                      new Transaction().IssueBook(array,size,memberList,membersize);
                      break;
          }

          System.out.print("\nPress 1 to continue and any other key to exit : ");
          choice=in.nextInt();
      }while(choice==1);
   }
}