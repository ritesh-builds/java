package Inheritance.QuestionsInheritance;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkOut(String itemId, String title, String author) {
        System.out.println("Checkout the item...");
    }
    public void returnItem(){
        System.out.println("Return the item...");
    }

}
