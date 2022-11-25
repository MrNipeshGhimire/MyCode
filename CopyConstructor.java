public class CopyConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "Nipesh";
        s1.age=22;

    }
}
  class Student{
    //properties
    String name;
    int age;

    //method
}
class Studenttwo{
    String name;
    int age;

    Studenttwo(Student s1){
        this.name= s1.name;
        this.age= s1.age;
    }
}
