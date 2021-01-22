import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class PersonMain {
    static PersonDAO pdao = new PersonDAOWithJPAImpl();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("------------------- LETs Start --------------------------");
        System.out.println("---------------------------------------------------------");
        int input;
do {
    System.out.println(" Press " +
            "\n" +  " 1 create "+ "\n" +" 2 select * "+ "\n" +" 3 Update "+ "\n" +" 4 Delete"+ "\n" +" 5 Exit" + "\n" +" 6 search UserName" );
    input = sc.nextInt();
    switch (input) {
        case 1:
            createMain();
            break;
        case 2:
            //SelectAll();

            break;
        case 3:
            // update
            break;
        case 4:
            removeMain();
            break;
        case 5:
            System.exit(0);
            break;
        case 6:
            searchForUser();
            break;
    }
}while(1==1);

    }

    private static void removeMain() {
        System.out.println(" Remove ID?");
        String removeID=sc.nextLine();
        pdao.remove("990130-1619");
    }

    private static void searchForUser() {
        System.out.println("UserName?");
        String inputUserName= sc.nextLine();
        System.out.println(pdao.getByUserName(inputUserName));
    }

    private static void createMain() {
        System.out.println("ID?");
        String inputID= sc.nextLine();
        System.out.println("UserName?");
        String inputUserName= sc.nextLine();
        System.out.println("Password?");
        String inputPassword= sc.nextLine();
        System.out.println("FirstName?");
        String inputFirstName= sc.nextLine();
        System.out.println("LastName?");
        String inputLastName= sc.nextLine();
        System.out.println("Email?");
        String inputEmail= sc.nextLine();
        System.out.println("Phone?");
        String inputPhone= sc.nextLine();
        Person ppp = new Person(inputID,inputUserName, inputPassword, inputFirstName, inputLastName,inputEmail,inputPhone);
        pdao.create(ppp);
    }
}
