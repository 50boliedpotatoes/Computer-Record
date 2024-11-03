
import java.util.Scanner;

class eShop
{
    String name;
    double price;
    void accept()
    {
        Scanner SN = new Scanner(System.in);
        // Fix input problems
        SN.useDelimiter(System.lineSeparator());
        // Get user input
        System.out.println("Enter Name");
        name = SN.next();
        System.out.println("Enter price");
        price = SN.nextInt();
        SN.close();
    }
    void calculate()
    {
        if(price <= 25000.0)
        {
            price -= price/20.0;
        }
        if(price <= 57000 && price > 25000)
        {
            price -= (75/1000)*price;
        }
        if(price <= 100000 && price > 57000)
        {
            price -= price/10.0;
        }
        else
        {
            price -= price*(15/100);
        }
    }
    void display()
    {
        System.out.println("Package Details : ");
        System.out.println("Name\t" + name);
        System.out.println("Cost\t" + price);
    }
    public static void main(String[] args) {
        eShop e = new eShop();
        e.accept();
        e.calculate();
        e.display();
    }
}