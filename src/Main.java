import OOPWithNLayeredApp.business.ProductManager;
import OOPWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone 15", 100000);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
    }
}