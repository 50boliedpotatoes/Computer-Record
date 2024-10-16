import java.util.*;
class amicableNumbers
{
    boolean checkForAmicability(int a, int b)
    {
        boolean check = true;
        int SOF = 0;
        // Get factors of the first number
        for(int i = 1; i <b; i++)
        {
            if (a%i == 0)
            {
                SOF+=i;
            }
        }
        // Check equality
        check = (SOF==b) ? true : false;
        SOF = 0;
        // Get the factors of the second number
        for(int i = 1; i <a; i++)
        {
            if (b%i == 0)
            {
                SOF+=i;
            }
        }
        // Check equality
        check = (SOF==a) ? true : false;
        return check;
    }
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter the pair of amicable numbers :");
        int num1 = SN.nextInt();
        System.out.println("");
        int num2 = SN.nextInt();
        amicableNumbers a = new amicableNumbers();
        if(a.checkForAmicability(num1, num2))
        {
            System.out.println("The numbers " + num1 + " and " + num2 + " are amicable");
        }
        else
        {
            System.out.println("The numbers " + num1 + " and " + num2 + " are not amicable");
        }
        SN.close();
    }
}