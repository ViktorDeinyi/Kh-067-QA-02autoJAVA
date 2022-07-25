import java.util.Scanner;

public class Task1_NameAdress {
    public static void main (String [] args) {
        String name, address;
        System.out.println("What is your name ?");
        Scanner scs1 = new Scanner(System.in);
        name = scs1.nextLine();
        System.out.println("Where are you live ?");
        Scanner scs2 = new Scanner(System.in);
        address = scs2.nextLine();
        System.out.print("So, here is your data:\n " + "Name - " + name + "| Address - " + address);
    }
}
