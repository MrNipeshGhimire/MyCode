public class DefaultConstructor {
    //properties
    String name;
    int roll;
    String address;
    //creating constructor
    DefaultConstructor(){
        System.out.println("This is Default Constructor");
        name="Nipesh";
        roll=1;
        address="Kerabari";
        }
        void display()
        {
            System.out.println("Name:"+name+"\nRoll No:"+roll+"\nAddress:"+address);
        }
        //main function
    public static void main(String[] args){
        DefaultConstructor d1= new DefaultConstructor();
        d1.display();

    }
}
