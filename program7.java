import java.util.*;
class studentMarks
{
    int[] marksArr = new int[10];
    String[] namesArr = new String[10];
    void inputDetails()
    {
        Scanner SN = new Scanner(System.in);
        // Solving input issues
        SN.useDelimiter(System.lineSeparator());
        System.out.println("Begin entering the names of students");
        for(int i =0; i<10; i++)
        {
            System.out.println("Enter the name of student " + (i+1));
            namesArr[i] = SN.next();
            System.out.println("Enter the marks of student " + (i+1));
            marksArr[i] = Integer.parseInt(SN.next());
        }
        SN.close();
    }
    void arrangeDetails()
    {
        int max = 0;
        for(int i = 0; i< marksArr.length-1; i++)
        {
            max = i;
            for(int j = i; j<marksArr.length-1; j++)
            {
                if (marksArr[j] > marksArr[i])
                {
                    max = j;
                }
            }
            int temp;
            String temString;
            // Swap Marks
            temp = marksArr[i];
            marksArr[i] = marksArr[max];
            marksArr[max] = temp;
            // Swap Names
            temString = namesArr[i];
            namesArr[i] = namesArr[max];
            namesArr[max] = temString;
        }   
    }
    void displayDetails()
    {
        System.out.println("Displaying names and marks of top 3 students");
        for(int i = 0; i<3; i++)
        {
            System.out.println("Rank " + (i+1) + " : ");
            System.out.print(namesArr[i] + "\t");
            System.out.print(marksArr[i] + "\n");
        }
    }
    public static void main(String[] args) {
        studentMarks s = new studentMarks();
        s.inputDetails();
        s.arrangeDetails();
        s.displayDetails();
    }
}