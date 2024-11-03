
import java.util.*;
class sumOfRowAndColumn
{
    int[][] Matrix;
    int[] SumStrRow;
    int[] SumStrCol;
    int m;
    int n;
    void acceptMatrix()
    {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        m = SN.nextInt();
        System.out.println("Enter the number of columns");
        n = SN.nextInt();
        Matrix = new int[m][n];
        SumStrRow = new int[m];
        SumStrCol = new int[n];
        System.out.println("Enter elements of the matrix");
        for (int j = 0; j<m; j++)
        {
            for(int i = 0; i<n; i++)
            {
                System.out.println("Enter element > ");
                Matrix[j][i] = SN.nextInt();
                System.out.println("");
            }
        }
        SN.close();
    }
    void sumColumn()
    {
        int SumOfCol = 0;
        for (int i = 0; i< m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                SumOfCol+=Matrix[i][j];
            }
            SumStrCol[i] += SumOfCol;
            SumOfCol = 0;
        }
    }
    void sumRow()
    {
        int SumRow = 0;
        for (int i = 0; i< m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                SumRow+=Matrix[j][i];
            }
            SumStrRow[i] += SumRow;
            SumRow = 0;
        }
    }
    void displaySumOfRowAndColumn()
    {
        System.out.println("Showing Sums of rows");
        for(int i= 0; i<m; i++)
        {
            System.out.println(SumStrCol[i]);
        }
        System.out.println("Showing Sums of Columns");
        for(int i =0; i<n; i++)
        {
            System.out.println(SumStrRow[i]);
        }
    }
    public static void main(String[] args) {
        sumOfRowAndColumn s = new sumOfRowAndColumn();
        s.acceptMatrix();
        s.sumColumn();
        s.sumRow();
        s.displaySumOfRowAndColumn();
    }
}   