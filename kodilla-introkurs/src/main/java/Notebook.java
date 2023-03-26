public class Notebook { //zadanie 2.2 sumuje mi wyniki zamiast je wyświetlać
    private int weight;
    private int price;
    private int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }



    public void checkYear() {
        if (this.year < 2000) {
            System.out.println("This notebook is very old!");
        } else if (this.year < 2010) {
            System.out.println("This notebook is quite old.");
        } else {
            System.out.println("This notebook is relatively new.");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light!");
        } else if (this.weight < 3000) {
            System.out.println("This notebook is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy!");
        }
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap!");
        } else if (this.price < 1000) {
            System.out.println("This price is good!");
        } else if (this.price < 1500) {
            System.out.println("This notebook is a bit expensive.");
        } else if (this.price < 2000 && this.year > 2018) {
            System.out.println("This notebook is quite expensive and was produced recently.");
        } else {
            System.out.println("This notebook is very expensive!");
        }
    }
    public static void main(String[] args) {
        Notebook notebook = new Notebook(500,  599, 1996 );
        System.out.println("Notebook waży " + notebook.weight + " i kosztuje " +  notebook.price + ". Rok produkcji " + notebook.year + ".");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();


        Notebook heavyNotebook = new Notebook( 2000,  899, 2010);
        System.out.println("Notebook waży " + heavyNotebook.weight + " i kosztuje " +  heavyNotebook.price + ". Rok produkcji " + heavyNotebook.year + ".");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(9600,  1499, 2022);
        System.out.println("Notebook waży " + oldNotebook.weight + " i kosztuje " +  oldNotebook.price + ". Rok produkcji " + oldNotebook.year + ".");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }

}