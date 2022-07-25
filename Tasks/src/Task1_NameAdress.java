import java.util.Scanner;

public class Task1_NameAdress {
    public static void main (String [] args) {
        String name, address;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?");
        name = sc.nextLine();
        System.out.println("Where are you live ?");
        address = sc.nextLine();
        System.out.print("So, here is your data:\n " + "Name - " + name + "| Address - " + address);
    }
}
