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


class Clothing extends PRODUCT
{
    private String size;
    private String material;

    public Clothing(String name, double basePrice, String size, String material)
    {
        super(name, basePrice);
        this.size = size;
        this.material = material;
    }

    @Override
    public String displayDetails()
    {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        return name + ", " + basePrice + ", " + size + ", " + material;

    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        Electronics telephone = new Electronics("telephone", 4200.0, "ijapuszko", 18);
        Clothing tee = new Clothing("tshirt", 12.0, "XS", "Polyester");

        inventory.add(tee);
        inventory.add(telephone);

        for (Product product : inventory) {
            product.displayDetails();
            System.out.println("-------------------");
        }
    }
}