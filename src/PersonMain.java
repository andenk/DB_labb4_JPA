import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class PersonMain {
    public static void main(String[] args) {

        boolean flagg=true;
        System.out.println("tal");
        Scanner sc = new Scanner(System.in);
        int input;
do {
    input = sc.nextInt();
    switch (input) {
        case 1:
    }
}while(flagg=true);
	PersonDAO pdao = new PersonDAOWithJPAImpl();

        System.out.println("------------------- LETs Start --------------------------");
        System.out.println("---------------------------------------------------------");
        Person ppp = new Person("ID","user", "password", "firstName", "lastName","email","phone");


        pdao.create(ppp);


        System.out.println(pdao.getByUserName("SiHa"));

    }
}
