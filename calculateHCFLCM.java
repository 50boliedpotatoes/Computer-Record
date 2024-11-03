
import java.util.*;
class calculateHCFLCM
{
    int HCF(int a, int b)
    {
        int t1 = a;
        int t2 = b;
        int t;
        while(t2 != 0){
            t = t2;
            t2 = t1%t2;
            t1 = t;
        }
        return t1;
    }
    int LCM(int a, int b)
    {
        return(a*b)/this.HCF(a,b);                      
    }
    public static void main(String[] args) {
        calculateHCFLCM c = new calculateHCFLCM();
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = SN.nextInt();              
        System.out.println("Enter the second number");
        int n2 = SN.nextInt();
        System.out.println("The HCF is " + c.HCF(n1,n2));
        System.out.println("The LCM is " + c.LCM(n1,n2));
    }
}