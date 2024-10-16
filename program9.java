import java.util.*;
class calculateHCFLCM
{
    int[] calculate(int a, int b)
    {
        int n1 = a;
        int n2 = b;
        int HCF = 0;
        int rem = Math.max(n1, n2)%Math.min(n1, n2);
        while (rem!= 0)
        {
            n1 = n1%n2;
            rem = n1;
        }
        HCF = rem;
        // Calculate LCM 
        int LCM = (a*b)/HCF;
        int[] res = {HCF, LCM};
        return res;
    }
    public static void main(String[] args) {
        calculateHCFLCM c = new calculateHCFLCM();
        Scanner SN = new Scanner(System.in);
        SN.useDelimiter(System.lineSeparator()); // Fix input problems
        System.out.println("Enter the two numbers with the larger number being the first number");
        int num1 = Integer.parseInt(SN.next());
        int num2 = Integer.parseInt(SN.next());
        int[] j = c.calculate(num1, num2);
        System.out.print("HCF of the numbers is : " + j[0] + "\n");
        System.out.print("LCM of the numbers is : " + j[1] + "\n");
    }
}