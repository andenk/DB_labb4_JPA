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
            updateAlternative();
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

    private static void updateAlternative() {
        int input;
            System.out.println(" Update \n 1 password \n 2 userName \n 3 firstName \n 4 lastName  \n 5 Email \n 6 Phone");
            input = sc.nextInt();
            switch (input){
              case 1:
                  updatePassword();
                  break;
              case 2:
                  updateUserName();
                  break;
              case 3:
                  updateFirstName();
                  break;
              case 4:
                  updateLastName();
                  break;
              case 5:
                  updateEmail();
                  break;
              case 6:
                  updatePhone();
                  break;
          }
            
    }

    private static void updatePassword() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new Password?");
        String newPassword= sc.next();
        pdao.updatePassword(updateID,newPassword);
    }

    private static void updateUserName() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new UserName?");
        String newUserName= sc.next();
        pdao.updateUserName(updateID,newUserName);
    }
    private static void updateFirstName() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new FirstName?");
        String newFirstName= sc.next();
        pdao.updateFirstName(updateID,newFirstName);
    }

    private static void updateLastName() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new LastName?");
        String newLastName= sc.next();
        pdao.updateLastName(updateID,newLastName);
    }
    private static void updateEmail() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new Email?");
        String newEmail= sc.next();
        pdao.updateEmail(updateID,newEmail);
    }
    private static void updatePhone() {
        System.out.print(" update on ID?");
        String updateID= sc.next();
        System.out.print(" new Phone?");
        String newPhone= sc.next();
        pdao.updatePhone(updateID,newPhone);
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
