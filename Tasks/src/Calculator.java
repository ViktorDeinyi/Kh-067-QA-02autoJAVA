import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        final String PLUS = "+", MINUS = "-", MULTIPLY = "*", DIVIDE = "/", MODULUS = "%";
        boolean check = true;
        double sum, num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Давай попробуем что-то посчитать");
        System.out.println("Введи первую цифру...");
        while (check) {
            try {
                num1 = sc.nextDouble();
                check = false;
            } catch (InputMismatchException ime) {
                System.out.println("Хм, похоже ввели некорректный формат цифр ...");
                System.out.println("Давай попробуем еще разок:");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.print(num1);
        System.out.println(" |Теперь оператор...");
        String arg = sc.nextLine();
        while (!arg.equals(PLUS) && !arg.equals(MINUS) && !arg.equals(MULTIPLY) && !arg.equals(DIVIDE) && !arg.equals(MODULUS)) {
            System.out.println("С таким оператором мы еще не научились работать...  \nДавай попробуем ввести другой:");
            arg = sc.nextLine();
        }
        System.out.print(num1 + " " + arg);
        System.out.println(" |Ну а теперь вторую цифру...");
        check = true;
        while (check) {
            try {
                num2 = sc.nextDouble();
                check = false;
            } catch (InputMismatchException ime) {
                System.out.println("Хм, похоже ввели некорректный формат цифр ...");
                System.out.println("Давай попробуем еще разок:");
                sc.nextLine();
            }
        }
        switch (arg) {
            case PLUS:
                sum = num1 + num2;
                System.out.println("Результат сложения: " + num1 + " " + arg + " " + num2 + " = " + sum);
                break;
            case MINUS:
                sum = num1 - num2;
                System.out.println("Результат вычитания: " + num1 + " " + arg + " " + num2 + " = " + sum);
                break;
            case MULTIPLY:
                sum = (num1 * num2);
                System.out.println("Результат умножения: " + num1 + " " + arg + " " + num2 + " = " + sum);
                break;
            case DIVIDE:
                sum = (num1 / num2);
                System.out.println("Результат деления: " + num1 + " " + arg + " " + num2 + " = " + sum);
                break;
            case MODULUS:
                sum = (num1 % num2);
                System.out.println("Результат вычисления модуля: " + num1 + " " + arg + " " + num2 + " = " + sum);
                break;
            default:
                System.out.println(" |Что-то пошло не так... ");
        }

    }
}