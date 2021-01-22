import javax.persistence.*;


import javax.persistence.Entity;

@Entity
@Table(name="Users2")
public class Person {


    @Id
    private String id;
    private String userName;
    private String lastName;

    public Person(String id, String userName, String lastName) {
        id = id;
        userName = userName;
        lastName = lastName;
    }
    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
