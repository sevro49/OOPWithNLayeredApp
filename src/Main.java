import OOPWithNLayeredApp.business.ProductManager;
import OOPWithNLayeredApp.core.logging.DatabaseLogger;
import OOPWithNLayeredApp.core.logging.FileLogger;
import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.core.logging.MailLogger;
import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone 15", 100000);

        List<Logger> loggers = new ArrayList<>(List.of(new DatabaseLogger(), new FileLogger(), new MailLogger()));
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}