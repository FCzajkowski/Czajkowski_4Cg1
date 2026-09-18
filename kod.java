import java.util.ArrayList;

class PRODUCT
{
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice)
    {
        this.basePrice = basePrice; 
        this.name = name;
    }

    public String displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Base Price: $" + basePrice);
        return name + ", " + basePrice;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}