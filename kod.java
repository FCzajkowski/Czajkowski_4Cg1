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

class Electronics extends PRODUCT
{
    private String manufacturer;
    private int warrantyMonths;

    public Electronics(String name, double basePrice, String manufacturer, int warrantyMonths) {
        super(name, basePrice);
        this.manufacturer = manufacturer;
        this.warrantyMonths = warrantyMonths;
    };

    @Override
    public String displayDetails()
    {
        super.displayDetails();
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warrantyMonths + " months");
        return name + ", " + basePrice + ", " + manufacturer + ", " + warrantyMonths;
    }
}



public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        Electronics telephone = new Electronics("telephone", 4200.0, "ijapuszko", 18);

        inventory.add(telephone);
    }
}