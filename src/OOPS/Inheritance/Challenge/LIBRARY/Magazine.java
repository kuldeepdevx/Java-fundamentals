package OOPS.Inheritance.Challenge.LIBRARY;

public class Magazine extends LibraryItem {

    private static int totalMagazine;

    private String name;
    private String genre;

    public Magazine(String itemID, String titleID,
        String authorName,String name,String genre){
        super(itemID,titleID,authorName);
        if(!isValidItem() || hasInvalidMagazineData(name,genre)){
            System.out.println("Invalid item data\n");
            return;
        }
        this.name=name;
        this.genre=genre;
        totalMagazine++;
        System.out.println("New item added to library\n");
    }

    private boolean hasInvalidMagazineData(String name,String genre){
        return (name==null ||name.trim().isEmpty())
                || (genre==null || genre.trim().isEmpty());
    }

    public static int getTotalMagazine(){
        return totalMagazine;
    }
}
