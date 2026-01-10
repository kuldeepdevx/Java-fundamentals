package OOPS.Inheritance.Challenge.LIBRARY;

public class LibraryItem {

    private static int totalItems;

    private String itemID;
    private String titleID;
    private String authorName;
    private boolean isBorrowed;
    private boolean valid;

   static{
       totalItems=0;
    }

    protected LibraryItem(String itemID, String titleID,
                String authorName){
       if(hasInvalidLibraryData(itemID,titleID,authorName)){
           valid=false;
           return;
       }
       this.itemID=itemID;
       this.titleID=titleID;
       this.authorName=authorName;
       isBorrowed=false;
       valid=true;
       totalItems++;
    }

    protected boolean hasInvalidLibraryData(String itemID,String titleID,
                         String authorName){

       return (itemID==null || itemID.trim().isEmpty())
               || (titleID==null || titleID.trim().isEmpty())
               || (authorName==null || authorName.trim().isEmpty());
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getItemID() {
        return itemID;
    }

    public String getTitleID() {
        return titleID;
    }
    protected boolean isValidItem(){
       return valid;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void checkOut(){
        if (!valid) {
            System.out.println("Invalid item cannot be borrowed");
            return;
        }
       if(isBorrowed) {
           System.out.println("Item is already borrowed");
       }else {
           System.out.println("Checkout successful");
           isBorrowed=true;
       }
    }

    public void returnItem(){
        if (!valid) {
            System.out.println("Invalid item cannot be returned");
            return;
        }
       if(!isBorrowed) {
           System.out.println("Item is not currently borrowed");
       }else{
           System.out.println("Return successful");
           isBorrowed=false;
       }
    }

    public static int getTotalItems(){
       return totalItems;
    }
}
