import java.util.*;
class MenuDriven
{
    void menu()
    {
        System.out.println("Enter your choice : \n1) Palindromic Number \n2) Perfect Number");
        Scanner SN = new Scanner(System.in);
        int choice = SN.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter the number");
            int num = SN.nextInt();
            if(this.isPalindrome(num))
            {
                System.out.println("Given number is palindrome");
            }
            else
            {
                System.out.println("The number is not palindrome");
            }
        }
        if (choice == 2)
        {
            System.out.println("Enter the number");
            int num = SN.nextInt();
            if(this.isPerfect(num))
            {
                System.out.println("Given number is perfect");
            }
            else
            {
                System.out.println("The number is not perfect");
            }
        }
        SN.close();
    }
    boolean isPalindrome(int number)
    {
        // Convert to string for easy handling
        String numStr = Integer.toString(number);
        StringBuilder reversedStr = new StringBuilder();
        for(int i = numStr.length()-1; i>=0; i--)
        {
            reversedStr.append(numStr.charAt(i));
        }
        return numStr.equals(reversedStr.toString());
    }
    boolean isPerfect(int number)
    {
        int sum = 1;
        for(int i = 1; i<Math.sqrt(number); i++)
        {
            if (number%i == 0)
            {
                sum += i;
            }
        }
        return (number/sum == 1);
    }
    public static void main(String[] args) {
        MenuDriven m = new MenuDriven();
        m.menu();
    }
}