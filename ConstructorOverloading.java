public class ConstructorOverloading {
    String name;
    int roll;
    int age;
    //creating constructor
    ConstructorOverloading(){
        name=null;
        roll=0;
        age=0;
    }
    ConstructorOverloading(String n, int r)
    {
        name=n;
        roll=r;

    }
    ConstructorOverloading(String n, int r, int a){
        name=n;
        roll=r;
        age= a;
    }
    void display()
    {
        System.out.println("Name:"+name+"\t Roll No:"+roll+"\t Age:"+age);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1= new ConstructorOverloading("Nipesh", 1);
        ConstructorOverloading c2= new ConstructorOverloading("Bisesh",2,21);
        c1.display();
        c2.display();
    }
}




