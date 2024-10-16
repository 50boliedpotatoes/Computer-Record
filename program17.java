import java.util.*;
class OverloadPrint
{
    double sum = 0;
    void print()
    {
        int cn = 1;
        for(int i = 1; i<=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(cn + " ");
                cn++;
            }
            System.out.println("");
        }
    }
    boolean print(int n)
    {
        // Convert to string for easy handling
        String numStr = Integer.toString(n);
        // Find the sum of the digits
        int sum = 0;
        for(int i = 0; i<numStr.length(); i++)
        {
            int dg = numStr.charAt(i)-'0';
            sum += dg;
        }
        return (n == Math.pow(sum, 3));     
    }   
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter your choice -\n(1) Print Pattern \n(2) Dudency check");
        int num1 = SN.nextInt();
        OverloadPrint o = new OverloadPrint();
        if(num1 == 1)
        {
            o.print();
        }
        if(num1 == 2)
        {
            System.out.println("Enter n : ");
            int n = SN.nextInt();
            if(o.print(n))
            {
                System.out.println("n is a dudency number");
            }
            else
            {
                System.out.println("n is not a Dudency number");
            }
        }
        SN.close();
}
}