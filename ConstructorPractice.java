import org.w3c.dom.ls.LSOutput;

public class ConstructorPractice {
    public static void main(String[] args) {
        Book b1= new Book( 1, "Monsoon",567,1500);
        b1.printInfo();
    }
}
class Book {
    //properties
    int id;
    String name;
    int pages;
    double price;

    //creating Constructor
    Book(int id, String name,int pages,double price){
        this.id=id;
        this.name=name;
        this.pages=pages;
        this.price=price;
    }
    void printInfo(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("No. of Pages: "+this.pages);
        System.out.println("Price: "+this.price);
    }
}
