import java.util.*;
class StudentNames
{
    String[] names = new String[10];
    void acceptNames()
    {
        Scanner SN = new Scanner(System.in);
        SN.useDelimiter(System.lineSeparator());
        System.out.println("Enter 10 names > ");
        for(int i =0; i< 10; i++)
        {
            names[i] = SN.next();
        }
        System.out.println("Enter the name to search for > ");
        searchForName(SN.next());
    }
    void searchForName(String key)
    {
        for(int i = 0; i< 10; i++)
        {
            if (names[i].toLowerCase() == key.toLowerCase())
            {
                System.out.println("Found at index " + i);
            }
            startsWithADI(names[1]);
        }
    }
    void startsWithADI(String input1)
    {
        String input = input1.toUpperCase();
        if(input.length() >= 3 && input.charAt(0) == 'A' && input.charAt(1) == 'D' && input.charAt(2) == 'I')
        {
            System.out.println(input1);
        }
    }
    public static void main(String[] args) {
        StudentNames s = new StudentNames();
        s.acceptNames();
    }
}