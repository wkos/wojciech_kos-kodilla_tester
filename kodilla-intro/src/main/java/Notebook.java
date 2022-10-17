public class Notebook {
    public int weight;
    public int price;
    public int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight < 2000) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkPriceAndYear() {
        if (this.price < 500 && this.year < 1990) {
            System.out.println("This notebook is very cheap and very old.");
        } else if (this.price < 500 && this.year >= 1990) {
            System.out.println("This notebook is cheap and modern");
        } else if (this.price >= 500 && this.year < 1990) {
            System.out.println("This notebook is expensive and old.");
        } else {
            System.out.println("This notebook is expensive and modern.");
        }
    }
}
