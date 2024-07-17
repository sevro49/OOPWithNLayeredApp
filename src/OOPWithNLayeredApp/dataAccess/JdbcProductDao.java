package OOPWithNLayeredApp.dataAccess;

import OOPWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //only db access codes
        System.out.println("added to db with JDBC");
    }
}
