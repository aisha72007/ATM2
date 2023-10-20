import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bankaccount bank = new Bankaccount();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Wählen Sie die Aufgabe aus: ");
            Scanner scanner = new Scanner(System.in);
            int aufgabe = scanner.nextInt();
            switch (aufgabe) {
                case 1: // new
                    System.out.println("Vorname: ");
                    String fName = scanner.next();
                    System.out.println("Nachname: ");
                    String lName = scanner.next();
                    bank.newAcount(fName, lName);
                    break;
                case 2: // set
                    System.out.println("Höhe credit: ");
                    float value = scanner.nextFloat();
                    bank.setGeld(value);
                    break;
                case 3:  // get
                    System.out.println("Wenige credit: ");
                    value = scanner.nextFloat();
                    bank.getGeld(value);
                    break;
                case 4:
                    System.out.println("Konto zu Stand: " + bank.getCredit());
                    break;
                default:
                    isRun = false;
            }
        }
    }
}