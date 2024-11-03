
import java.util.*;
class AcceptAndBubbleSort
{
    String[] Names = new String[10];
    int[] Marks = new int[10];
    void accept10NamesAndMarks()
    {
        Scanner SN = new Scanner(System.in);
        System.out.println("Begin entering the names of students");
        for(int i =0; i<10; i++)
        {
            System.out.println("Enter the name of student " + i);
            Names[i] = SN.nextLine();
            System.out.println("Enter the marks of student " + i);
            Marks[i] = SN.nextInt();
            System.out.println("");
        }
        SN.close();
    }
    void bubbleSortMarks()
    {
        for (int i =0; i<9; i++)
        {
            for (int j = 0; j<9; j++)
            {
                if (Marks[j] < Marks[j+1])
                {
                    int temp = Marks[j+1];
                    Marks[j+1] = Marks[j];
                    Marks[j] = temp;
                }
            }
        }
    }
    void displayMarks()
    {
        for(int i =0; i<10; i++)
        {
            System.out.println(Marks[i]);
        }
    }
    public static void main(String[] args) {
        AcceptAndBubbleSort a = new AcceptAndBubbleSort();
        a.accept10NamesAndMarks();
        a.bubbleSortMarks();
        a.displayMarks();
    }
}