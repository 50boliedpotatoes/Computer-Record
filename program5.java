import java.util.*;
class overloaderClass
{
    void Number(int num, int d)
    {
        int freq = 0;
        while(num != 0)
        {
            if(num%10 == d)
            {
                freq++;
            }
            num/=10;
        }
        System.out.println("The frequency of " + d + " is " + freq);
    }
    void Number(int n1)
    {
        int sum = 0;
        while(n1 > 0)
        {
            if(n1%2 == 0)
            {
                sum+=(n1%10);
            }
            n1/=10;
        }
        System.out.println("The sum of even digits of " + n1 + " is " + sum);
    }
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter your choice - Frequency of digit(1) or Sum of even digits(2) :");
        int num1 = SN.nextInt();
        overloaderClass o = new overloaderClass();
        if(num1 == 1)
        {
            System.out.println("Enter the number : ");
            int n = SN.nextInt();
            System.out.println("Enter the digit : ");
            int d = SN.nextInt();
            o.Number(n, d);
        }
        if(num1 == 2)
        {
            System.out.println("Enter the number : ");
            int n = SN.nextInt();
            o.Number(n);
        }
        SN.close();
    }
}