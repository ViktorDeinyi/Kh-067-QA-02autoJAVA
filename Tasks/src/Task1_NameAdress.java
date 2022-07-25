import java.util.Scanner;

public class Task1_NameAdress {
    public static void main (String [] args) {
        String name, address;
        Scanner name_add = new Scanner(System.in);
        System.out.println("What is your name ?");
        name = name_add.nextLine();
        System.out.println("Where are you live ?");
        address = name_add.nextLine();
        System.out.print("So, here is your data:\n " + "Name - " + name + "| Address - " + address);
    }
}
