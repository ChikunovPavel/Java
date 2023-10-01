package unitTest.GB.seminar1.seminars.first.hw;

public class Product implements Comparable<Product> {
    private int cost; // Стоимость продукта
    private String title; // Название

//    Дописал конструкторы
    public Product(){};
    public Product(String title,int cost){
        this.title = title;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product:" +
                " Title: " + title +
                " , Cost: " + cost ;
    }
    @Override
    public int compareTo(Product o) {
        return title.compareTo(o.title);
    }

}