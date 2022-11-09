public class OOP {
    public static void main(String[] args)
    {
        House h1=new House();
        h1.color="Blue";
        h1.price=4400000;
        h1.printInfo();
    }
}
//creating a class
class House{
    //properties
    String color;
    double price;
//function
    void printInfo()
    {
        System.out.println("House color is"+this.color);
        System.out.println("House price is"+this.price);
    }
}