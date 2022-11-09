public class MethodOverloadingPractice {
    public static void main(String[] args){
        int a=5;
        int b=6;
        double c=3;
        double d=4;
        int x=sum(a, b);
        System.out.println("Sum1= "+x);
        double y=sum(c,d);
        System.out.println("Sum2= "+y);
    }
    public static int sum(int x,int y)
    {
        int z= x+y;
        return z;
    }
    public static double sum(double x,double y)
    {
        double z= x+y;
        return z;
    }
}
