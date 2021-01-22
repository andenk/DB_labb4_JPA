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

            System.out.println(pdao.selectAll());
            break;
        case 3:
            updateMain();
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

    private static void updateMain() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new Email?");
        String newEmail= sc.next();
        pdao.updateEmail(updateID,newEmail);
    }

    private static void removeMain() {
        System.out.print(" Remove ID?");
        String removeID= sc.next();
        pdao.remove(removeID);
    }

    private static void searchForUser() {
        System.out.println("UserName?");
        String inputUserName= sc.nextLine();
        System.out.println(pdao.getByUserName(inputUserName));
    }

    private static void createMain() {
        System.out.println("ID?");
        String inputID= sc.next();
        System.out.println("UserName?");
        String inputUserName= sc.next();
        System.out.println("Password?");
        String inputPassword= sc.next();
        System.out.println("FirstName?");
        String inputFirstName= sc.next();
        System.out.println("LastName?");
        String inputLastName= sc.next();
        System.out.println("Email?");
        String inputEmail= sc.next();
        System.out.println("Phone?");
        String inputPhone= sc.next();
        Person ppp = new Person(inputID,inputUserName, inputPassword, inputFirstName, inputLastName,inputEmail,inputPhone);
        pdao.create(ppp);
    }
}
