import java.util.List;

public interface PersonDAO {

    void create(Person p);
    // creates a new product (ignores p.id but autonumbers the database id)

    List<Person> getByUserName(String name);
    // returns all product with exact name
    List<Person> selectAll();
/*
    List<Product> getByPriceRange(double min, double max);
    // returns all products within the price range
*/
    boolean updateUserName(String updateID, String newUserName);
    boolean updateFirstName(String updateID, String newFirstName);
    boolean updateLastName(String updateID, String newLastName);
    boolean updatePhone(String updateID, String newPhone);
    boolean updatePassword(String updateID, String newPassword);

    boolean updateEmail(String updateID, String newEmail);
    // set a new price for the product, return success/failure

    boolean remove(String id);
    // removes the product, return success/failure


}
