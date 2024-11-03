
import java.util.*;;
class StringOps
{
    void DoubleLetterSequence(String inpString)
    {
        // Convert To Uppercase
        inpString = inpString.toUpperCase();
        // Find double letter sequences
        int dlSeq = 0;
        for (int i = 0; i<inpString.length()-1; i++)
        {
            if(inpString.charAt(i) == inpString.charAt(i+1))
            {
                dlSeq++;
            }
        }
        System.out.println("Number of double letter sequences is :  " + dlSeq);
    }
    public static void main(String[] args) {
        StringOps s = new StringOps();
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter string > ");
        s.DoubleLetterSequence(SN.nextLine());
        SN.close();
    }
}