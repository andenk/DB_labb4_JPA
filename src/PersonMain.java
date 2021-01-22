import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class PersonMain {
    static PersonDAO pdao = new PersonDAOWithJPAImpl();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("------------------- LETs Start --------------------------");
        System.out.println("---------------------------------------------------------");

        boolean flagg=true;
        int input;
do {
    System.out.println(" Press " +
            " 1 create "+ "\n" +" 2 select * "+ "\n" +" 3 Update "+ "\n" +" 4 Delete"+ "\n" +" 5 Exit" );
    input = sc.nextInt();
    switch (input) {
        case 1:
            createMain(pdao);
            break;
        case 2:
            // select *

            break;
        case 3:
            // update
            break;
        case 4:
            // delete
            break;
        case 5:
            System.exit(0);
            break;
        case 6:
            searchForUser(pdao);
            break;
    }
}while(flagg=true);

    }

    private static void searchForUser() {
        System.out.println(pdao.getByUserName("SiHa"));
    }

    private static void createMain() {
        Person ppp = new Person("ID","user", "password", "firstName", "lastName","email","phone");
        pdao.create(ppp);
    }
}
