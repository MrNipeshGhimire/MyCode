//single dimensional array
public class SumArray {
    public static void main(String[] args){
        int i;
      int a[]={1,2,3,4};
      int b[]={1,2,3,4};
      int c[]= new int[4];


        for( i=0; i<4; i++){
             c[i]= a[i] + b[i];
        }
        //for displaying
        System.out.println("Sum of Array: ");
        for(i=0; i<4; i++){
            System.out.println(c[i]);
        }
    }
}
