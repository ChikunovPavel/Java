package patern2.boundary_control_entity.presentation;

import patern2.boundary_control_entity.data.FileProductRepository;
import patern2.boundary_control_entity.data.ProductRepository;
import patern2.boundary_control_entity.domein.Product;

;import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "products.dat";
        ProductRepository productRepository = new FileProductRepository(filePath);

// Добавляем два товара в репозиторий
        Product product1 = new Product("1", "Смартфон", 499.99);
        Product product2 = new Product("2", "Ноутбук", 899.99);
        productRepository.addProduct(product1);
        productRepository.addProduct(product2);

// Получаем и выводим список всех товаров
        List<Product> products = productRepository.getAllProducts();
        for (Product product : products) {
            System.out.println("Товар: " + product.getName() + ", Цена: $" + product.getPrice());
        }
    }
}
