package unitTest.GB.seminar1.seminars.first.hw;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop implements Comparator<Product> {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
    public Object getSortedListProducts(List<Product> produc) {
        produc.sort(new Shop());

        return produc;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product  getMostExpensiveProduct(List<Product> produc) {

        Product max =Collections.max(produc);
        return max;
    }




}