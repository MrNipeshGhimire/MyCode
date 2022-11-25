public class MatrixMulti {
    public static void main(String[] args) {
        int i,j;
        int a[][]= {{1,2,3,4},{1,2,3,4}};
        int b[][]= {{2,3,4,5},{1,2,3,4}};
        int c[][]= new int[4][4];

        for(i=0; i<4; i++)
        {
            for(j=0; j<4; j++)
            {
                c[i][j]= a[i][j] + b[i][j];
                System.out.println(c[i][j]+" ");
            }
         //   System.out.println("\n");
    }
}}