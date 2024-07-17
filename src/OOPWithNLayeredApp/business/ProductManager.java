package OOPWithNLayeredApp.business;

import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.entities.Product;

public class ProductManager {
    public void add(Product product) throws Exception {
        //business rules

        //example business rule
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product price cannot be lower 10!");
        }
        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
    }
}
