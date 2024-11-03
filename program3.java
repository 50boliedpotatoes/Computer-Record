
import java.util.*;
class matrixInterchange
{
    void swapElements(int[][] mat)
    {
        int minX = 0;
        int minY = 0;
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i< 3; i++)
        {
            for (int j = 0; j< 3; j++)
            {
                if (mat[i][j] < mat[minX][minY])
                {
                    minX = i;
                    minY = j;
                }
                if (mat[i][j] > mat[maxX][maxY])
                {
                    maxX = i;
                    maxY = j;
                }
            }
        }
        int temp = mat[minX][minY];
        mat[minX][minY] = mat[maxX][maxY];
        mat[maxX][maxY] = temp;
    }
    public static void main(String[] args) {
        // Get user input
        Scanner SN = new Scanner(System.in);
        int[][] mx = new int[3][3];
        System.out.println("Enter the matrix elements in order");
        for(int i = 0; i< 3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                mx[i][j] = SN.nextInt();
                System.out.println("");
            }
        }
        // Swap Elements
        matrixInterchange m = new matrixInterchange();
        m.swapElements(mx);
        // Print to user 
        for(int i = 0; i< 3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.println(mx[i][j]);
            }
        }
        SN.close();
    }
}