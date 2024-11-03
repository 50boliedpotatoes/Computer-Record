
import java.util.Scanner;

class CourierService
{
    String name;
    String type;
    int weight;
    double charge;
    CourierService()
    {
        name = "";
        type = "";
        weight = 0;
        charge = 0;
    }
    void accept()
    {
        Scanner SN = new Scanner(System.in);
        // Fix input problems
        SN.useDelimiter(System.lineSeparator());
        // Get user input
        System.out.println("Enter Name");
        name = SN.next();
        System.out.println("Enter Type of package");
        type = SN.next();
        System.out.println("Enter Weight");
        weight = Integer.parseInt(SN.next());
        SN.close();
    }
    void calculate()
    {
        int extraCost = (type.toLowerCase().equals("express") && weight > 10) ? 1500 : (type.toLowerCase().equals("express")) ? 700 : 0 ;
        charge = extraCost;
        if(weight <= 10)
        {
            charge += 800;
        }
        if (weight > 10 && weight <= 20)
        {
            charge += 1500;
        }
        if (weight > 20)
        {
            charge += 4000;
        }
    }
    void print()
    {
        System.out.println("Package Details : ");
        System.out.println("Name\t" + this.name);
        System.out.println("Type\t" + this.type);
        System.out.println("Weight\t" + this.weight);
        System.out.println("TOTAL COST\t" + this.charge);
    }
    public static void main(String[] args) {
        CourierService c = new CourierService();
        c.accept();
        c.calculate();
        c.print();
    }
}