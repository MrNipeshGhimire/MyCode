public class ParameterizedConstructor {
    String name1;
    int roll;
    ParameterizedConstructor(String name,int roll){ //creating constructor
        this.name1=name;
        this.roll=  roll;
    }

    //main function
    public static void main(String[] args)
    {
        ParameterizedConstructor p= new ParameterizedConstructor("Nipesh",1);

        System.out.println("Name: "+p.name1);
        System.out.println("Roll NO: "+p.roll);

    }
}
