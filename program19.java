
import java.util.*;
class RemoveVowels
{
    char[] vowels = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
    String removeVowels(String str)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<str.length(); i++)
        {
            boolean isVowel = false;
            for(int j = 0; j<10;j++)
            {
                if(str.charAt(i) == vowels[j])
                {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel)
            {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        RemoveVowels r = new RemoveVowels();
        Scanner SN = new Scanner(System.in);
        System.out.println("Enter the string ");
        System.out.println(r.removeVowels(SN.nextLine()));
        SN.close();
    }
}