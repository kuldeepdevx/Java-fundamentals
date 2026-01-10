package OOPS.Inheritance.Challenge.LIBRARY;

public class DVD extends LibraryItem{

    private static int totalDvd;

    private String contentName;
    private double duration;

    public DVD(String itemID, String titleID,
        String authorName,String contentName,double duration){
        super(itemID,titleID,authorName);
        if(!isValidItem() || hasInvalidDvdData(contentName,duration)){
            System.out.println("Invalid Item Data\n");
            return;
        }
        this.contentName=contentName;
        this.duration=duration;
        totalDvd++;
        System.out.println("New item added to library\n");
    }

    private boolean hasInvalidDvdData(String contentName,double duration){
        return (contentName==null || contentName.trim().isEmpty())
                || duration<0;
    }

    public static int getTotalDvd(){
        return totalDvd;
    }
}
