public class PersonMain {
    public static void main(String[] args) {

	PersonDAO pdao = new PersonDAOWithJPAImpl();

        System.out.println("------------------- LETs Start --------------------------");
        System.out.println("---------------------------------------------------------");
        Person ppp = new Person("ID","userName", "password", "firstName", "lastName","email","phone");

      //  pdao.create(ppp);


        System.out.println(pdao.getByUserName("SiHa"));

    }
}
