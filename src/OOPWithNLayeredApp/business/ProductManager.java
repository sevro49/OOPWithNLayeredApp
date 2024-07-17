package OOPWithNLayeredApp.business;

import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.dataAccess.HibernateProductDao;
import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //business rules

        //example business rule
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product price cannot be lower 10!");
        }
        productDao.add(product);

        for (Logger logger: loggers){
            logger.log(product.getName());
        }
    }
}
