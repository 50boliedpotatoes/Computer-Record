
import java.util.*;
class Unique
{
    boolean isUnique(String word)
    {
        for(int i = 0; i< word.length(); i++)
        {
            for (int j = (i+1); j<word.length(); j++)
            {
                if(word.charAt(i) == word.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Unique u = new Unique();
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter the string > ");
        if(u.isUnique(SN.nextLine()))
        {
            System.out.println("The string is unique");
        }
        else
        {
            System.out.println("The string is not unique");
        }
        SN.close();
    }
}