public class TwoDimensional {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,3,6}};
        int b[][] = {{2,5,6},{2,8,4}};
        int c[][] = new int[2][3];

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
