import java.util.List;

public interface PersonDAO {

    void create(Person p);
    // creates a new product (ignores p.id but autonumbers the database id)




    List<Person> getByUserName(String name);
    // returns all product with exact name

/*
    List<Product> getByPriceRange(double min, double max);
    // returns all products within the price range

    boolean updatePrice(int id, double newPrice);
    // set a new price for the product, return success/failure
   */
    boolean remove(String id);
    // removes the product, return success/failure


}
