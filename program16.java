
import java.util.*;
class charOps
{
    char[] arr = new char[10];
    char[] vowels = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
    int noUp = 0;
    int noVow = 0;
    void countNumberUppercase()
    {
        for(int i = 0; i< arr.length; i++)
        {
            if((int)arr[i] >= 65 && (int)arr[i] <= 90)
            {
                noUp++;
            }
        }
    }
    void noOfVowels()
    {
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(arr[i] == vowels[j])
                {
                    noVow++;
                    break;
                }
            }
        }
    }
    void loop()
    {
        Scanner SN = new Scanner(System.in);
        SN.useDelimiter(System.lineSeparator());
        System.out.println("Enter an array of 10 characters");
        for(int i = 0; i< 10; i++)
        {
            arr[i] = SN.next().charAt(0);
        }
        countNumberUppercase();
        noOfVowels();
        System.out.println("Number of uppercase characters are " + noUp);
        System.out.println("Number of vowels are " + noVow);
        SN.close();
    }
    public static void main(String[] args) {
        charOps c = new charOps();
        c.loop();
    }
}