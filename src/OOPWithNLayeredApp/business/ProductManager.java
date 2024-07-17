package OOPWithNLayeredApp.business;

import OOPWithNLayeredApp.dataAccess.HibernateProductDao;
import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {
        //business rules

        //example business rule
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product price cannot be lower 10!");
        }
        productDao.add(product);
    }
}
