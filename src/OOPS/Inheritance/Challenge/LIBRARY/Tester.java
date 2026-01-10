package OOPS.Inheritance.Challenge.LIBRARY;

public class Tester {
    public static void main(String[] args){

        DVD dvd1=new DVD("dvd1","dvdtitle",
                "kuldeep", "ThrillerMovie",12);
        Magazine magazine1=new Magazine("Magazine1","Magazinetitle",
                "Rajput", "Diary","Thriller");
        Book book1=new Book("","Booktitle",
                "Rana", "Isbn1",8999);

        System.out.println(LibraryItem.getTotalItems());
        System.out.println(DVD.getTotalDvd());
    }
}
