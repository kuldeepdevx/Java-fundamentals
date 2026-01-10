package OOPS.Inheritance.Challenge.LIBRARY;

public class Book extends LibraryItem{

    private static int totalBooks;

    private String ISBN;
    private int issueNumber;

    public Book(String itemID, String titleID,
         String authorName,String ISBN,int issueNumber){
        super(itemID,titleID,authorName);
        if(!isValidItem() || hasInvalidBookData(ISBN,issueNumber)){
            System.out.println("Invalid item data\n");
            return;
        }
        this.ISBN=ISBN;
        this.issueNumber=issueNumber;
        totalBooks++;
        System.out.println("New item added to library\n");
    }

    private boolean hasInvalidBookData(String ISBN,int issueNumber) {
        return (ISBN==null ||ISBN.trim().isEmpty()) || issueNumber<0;
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
}
