import java.util.ArrayList;

class Produkt
{
    protected String nazwa;
    protected double cenaBazowa;

    public Produkt(String nazwa, double cenaBazowa)
    {
        this.cenaBazowa = cenaBazowa; 
        this.nazwa = nazwa;
    }

    public String wyswietlSzczegoly()
    {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena bazowa: " + cenaBazowa + " zl");
        return nazwa + ", " + cenaBazowa;
    }
}

class Elektronika extends Produkt
{
    private String producent;
    private int miesiaceGwarancji;

    public Elektronika(String nazwa, double cenaBazowa, String producent, int miesiaceGwarancji) {
        super(nazwa, cenaBazowa);
        this.producent = producent;
        this.miesiaceGwarancji = miesiaceGwarancji;
    };

    @Override
    public String wyswietlSzczegoly()
    {
        super.wyswietlSzczegoly();
        System.out.println("Producent: " + producent);
        System.out.println("Gwarancja: " + miesiaceGwarancji + " miesiecy");
        return nazwa + ", " + cenaBazowa + ", " + producent + ", " + miesiaceGwarancji;
    }
}


class Odziez extends Produkt
{
    private String rozmiar;
    private String material;

    public Odziez(String nazwa, double cenaBazowa, String rozmiar, String material)
    {
        super(nazwa, cenaBazowa);
        this.rozmiar = rozmiar;
        this.material = material;
    }

    @Override
    public String wyswietlSzczegoly()
    {
        super.wyswietlSzczegoly();
        System.out.println("Rozmiar: " + rozmiar);
        System.out.println("Material: " + material);
        return nazwa + ", " + cenaBazowa + ", " + rozmiar + ", " + material;

    }
}

class Program {
    public static void main(String[] args) {
        ArrayList<Produkt> magazyn = new ArrayList<>();

        Elektronika telefon = new Elektronika("telefon", 4200.0, "ijapuszko", 18);
        Odziez koszulka = new Odziez("koszulka", 12.0, "XS", "Poliester");

        magazyn.add(koszulka);
        magazyn.add(telefon);

        for (Produkt produkt : magazyn) {
            produkt.wyswietlSzczegoly();
            System.out.println("-------------------");
        }
    }
}