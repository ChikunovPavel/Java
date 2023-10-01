package unitTest.GB.seminar1.seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    public static void main(String[] args) {



        List<Product> lst = new ArrayList<>();
        Product product = new Product("Vegetables", 12);
        lst.add(product);
        Product product2 = new Product("Мeat", 500);
        lst.add(product2);
        Product product3 = new Product("Cabbage", 150);
        lst.add(product3);
        Product product4 = new Product("Bread", 50);
        lst.add(product4);
        Product product5 = new Product("Butter", 300);
        lst.add(product5);
        Product product6 = new Product("Water", 70);
        lst.add(product6);
        Product product7 = new Product("Oil", 100);
        lst.add(product7);

        Shop shop = new Shop();
        shop.setProducts(lst);

        shop.getSortedListProducts(shop.getProducts());


        for (Product pr : shop.getProducts()) {
            System.out.println(pr);
        }

        System.out.println("Max cost:");
        System.out.println(shop.getMostExpensiveProduct(lst));
        System.out.println("Size basket:");
        System.out.println(shop.getProducts().size());



//     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)

        assertThat(shop.getProducts()).hasSize(7);

//       2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct(lst)).isEqualTo( product2);


//       3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.getProducts().get(6)).isEqualTo( product2);
        assertThat(shop.getProducts().get(0)).isEqualTo( product);
        assertThat(shop.getProducts().get(4)).isEqualTo( product3);

//        assertThat(shop.getSortedListProducts(lst)).isEqualTo(shop.getProducts());
//


//        assertThat(hero.getBag()).isNotEmpty().hasSize(3).contains("Bow", "Axe", "Gold");
//        assertThat(hero.isHuman()).isEqualTo(true);
//        assertTrue();
//        assertEquals(hero.getArmorStrength(),50);
    }
}













