public class CopyConstructor2 {
    int height;
    int weight;
    CopyConstructor2(int h, int w)
    {
        height=h;
        weight=w;
    }
    CopyConstructor2(CopyConstructor2 c2)
    {
        height= c2.height;
        weight= c2.weight;
    }
    //display
    void display()
    {
        System.out.println("Height: "+height+"\t\tWeight:"+weight);
    }
    //main
    public static void main(String[] args) {
        CopyConstructor2 cc1= new CopyConstructor2(4,5);
        CopyConstructor2 cc2= new CopyConstructor2(cc1);
        cc1.display();
        cc2.display();
    }
}
