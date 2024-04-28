package booklist;
import java.util.Scanner;

public class BookList{
    public int bookId,noCopiesPurchesed,noCopiesAvailable;
    public String title;

    public BookList(){}  //Default Constructor
    
    public BookList(int bookId,int noCopiesPurchesed,String title){  //Parameterised constructor
      this.bookId=bookId;
      this.noCopiesAvailable=noCopiesPurchesed;
      this.noCopiesPurchesed=noCopiesPurchesed;
      this.title=title;
    }

    //Display Function
    public void display(){
      System.out.print("\nBook id : "+bookId);
      System.out.print("\nTitle of the book : "+title);
      System.out.print("\nNumber of copies purchased : "+noCopiesPurchesed);
      System.out.print("\nNumber of copies available : "+noCopiesAvailable);
    }

    //Function to display all the books in the list
    public void displayList(BookList []arr,int size){
      for(int i=0;i<size;i++){
        System.out.print("\n");
        arr[i].display();
      }
      System.out.print("\n");
    }

    public void addNewBook(BookList []arr,int size){
      int bookId,noCopiesPurchesed,noCopiesAvailable,flag;
      String title;
      Scanner in=new Scanner(System.in);

      do{ flag=1;
          System.out.print("\nEnter bookid : ");
          bookId=in.nextInt();
          for(int i=0;i<size;i++){
          if(bookId==arr[i].bookId){
          flag=0;
          break;
          }
        }
        if(flag==0)
        System.out.print("\nBook id already exist enter a valid book id ");
      }while(flag==0);

      System.out.print("\nEnter the title of the book : ");
      in.nextLine();
      title=in.nextLine();
      System.out.print("\nEnter number of copies purchased : ");
      noCopiesPurchesed=in.nextInt();

      BookList Obj=new BookList(bookId,noCopiesPurchesed,title);
      arr[size]=Obj;
    }

    //Function to increase the no of copies of the book
    public void addNo_OfCopies(BookList []arr,int size){
      Scanner in=new Scanner(System.in);
      int bookId;
      System.out.print("\nEnter the book id : ");
      bookId=in.nextInt();
      int flag=0;
      for(int i=0;i<size;i++){
        if(bookId==arr[i].bookId){
          int copies;
          System.out.print("\nEnter number of copies you want to add : ");
          copies=in.nextInt();
          arr[i].noCopiesPurchesed+=copies;
          arr[i].noCopiesAvailable+=copies;
          flag=1;
          break;
        }
      }
      if(flag==0)
      System.out.print("\nGiven book id is invalid !");
    }

    //Function to Display a single book
    public void displaySingleBook(BookList []arr,int size){
       Scanner in=new Scanner(System.in);
       int bookId;
       System.out.print("\nEnter the Book id : ");
       bookId=in.nextInt();
       int flag=0;
       for(int i=0;i<size;i++){
         if(bookId==arr[i].bookId){
            arr[i].display();
            flag=1;
            break;
         }
       }
       if(flag==0)
       System.out.print("\nGiven book id is invalid !");
    }
}