import java.util.*;
class Disarium
{
    boolean isDisarium(int number)
    {
        // Convert to string for easy handling
        String numStr = Integer.toString(number);
        // Find the sum of the digits raised to the power of their positions
        int sum = 0;
        for(int i = 0; i<numStr.length(); i++)
        {
            int dg = numStr.charAt(i)-'0';
            sum += Math.pow(dg, (i+1));
        }
        // Return the result of the equality check between sum and number
        return (sum==number);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner SN = new Scanner(System.in);
        int nm = SN.nextInt();
        Disarium d = new Disarium();
        System.out.println(d.isDisarium(nm));
        SN.close();
    }
}