import com.sun.jdi.event.ThreadStartEvent;

import java.util.Scanner;

public class StringArrayFilter {

    public static void main(String[] args) {

        final String RESULT = "The result of your request :";
        final String NO_RESULT = "There are no relevant results for this query";
        final String ONE_MORE = "Do you want to try one more time? \n1 | yes \n2 | no";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        byte more;
        int totalResult;
        System.out.println("Enter words in the format [name1, name2, ..., nameX] ");
        String input = sc.nextLine();
        String[] words = input.split(", ");
        while (check) {
            totalResult = 0;
            System.out.println("Which filter do you want to apply?");
            System.out.println("1 | Search for words not exceeding a given length ");
            System.out.println("2 | Search for words starting with given characters");
            System.out.println("3 | Search for words ending with given characters");
            System.out.println("4 | Search for words containing a combination of characters");
            System.out.println("0 | Exit");
            int filter = sc.nextInt();
            switch (filter) {
                case 1:
                    System.out.print("Enter the maximum word length = ");
                    int leng = sc.nextInt();
                    System.out.println(RESULT);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() <= leng) {
                            System.out.println(++totalResult + "  " + words[i]);
                        }
                    }
                    if (totalResult == 0) System.out.println(NO_RESULT);
                    System.out.println(ONE_MORE);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 2:
                    System.out.print("Enter starting characters = ");
                    String first = sc.next();
                    System.out.println(RESULT);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].startsWith(first)) {
                            System.out.println(++totalResult + "  " + words[i]);
                        }
                    }
                    if (totalResult == 0) System.out.println(NO_RESULT);
                    System.out.println(ONE_MORE);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 3:
                    System.out.print("Enter ending characters = ");
                    String last = sc.next();
                    System.out.println(RESULT);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].endsWith(last)) {
                            System.out.println(++totalResult + "  " + words[i]);
                        }
                    }
                    if (totalResult == 0) System.out.println(NO_RESULT);
                    System.out.println(ONE_MORE);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 4:
                    System.out.print("Enter the characters contained in the word = ");
                    String symbol = sc.next();
                    System.out.println(RESULT);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].contains(symbol)) {
                            System.out.println(++totalResult + "  " + words[i]);
                        }
                    }
                    if (totalResult == 0) System.out.println(NO_RESULT);
                    System.out.println(ONE_MORE);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 0:
                    check = false;
                    break;
            }
        }
        System.out.print("Thanks for using the program");
    }
}
