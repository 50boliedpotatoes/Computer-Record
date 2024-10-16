import java.util.*;
class overloaderClass2
{
    double sum = 0;
    void series(int x, int n)
    {
        for(int i = 1; i<= n; i++)
        {
            sum+=Math.pow(x, i);
        }
    }
    void series(int p)
    {
        for(int i = 1; i<=p; i++)
        {
            sum += Math.pow(i, 3) - 1;
            System.out.println(sum);
        }
    }
    void series()
    {
        for(int i=1; i<10; i++)   
        {
            sum+=1/i;
        }
    }
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter your choice - \nSum of series x^1 + x^2 (1) \nSum of 0, 7, 26, 63  (2) \nSum of 1/2 + 1/3 + 1/4 (3) :");
        int num1 = SN.nextInt();
        overloaderClass2 o = new overloaderClass2();
        if(num1 == 1)
        {
            System.out.println("Enter x: ");
            int n = SN.nextInt();
            System.out.println("Enter number of terms : ");
            int d = SN.nextInt();
            o.series(n, d);
        }
        if(num1 == 2)
        {
            System.out.println("Enter p : ");
            int n = SN.nextInt();
            o.series(n);
        }
        if(num1 == 3)
        {
            o.series();
        }
        System.out.println("The answer is " + Double.toString(o.sum));
        SN.close();
    }
}