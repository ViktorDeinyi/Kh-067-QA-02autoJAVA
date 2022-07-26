import java.util.Scanner;

public class Calculator {

        public static void main (String[] args) {
            double sum, num1, num2;
            Scanner scd = new Scanner(System.in);
            Scanner scs = new Scanner(System.in);
            System.out.println("Давай попробуем что-то посчитать");
            System.out.println("Введи первую цифру...");
            num1 = scd.nextDouble();
            System.out.print(num1);
            System.out.println(" |Теперь оператор...");
            String arg = scs.nextLine();
            while (!arg.equals("+")&!arg.equals("-")&!arg.equals("*")&!arg.equals("/")&!arg.equals("%")) {
                System.out.println("С таким оператором мы еще не научились работать...  \nДавай попробуем ввести другой:");
                arg = scs.nextLine();}
            System.out.print(num1 + " " + arg);
            System.out.println(" |Ну а теперь вторую цифру...");
            num2 = scd.nextDouble();
            if (arg.equals("+")) { sum = num1 + num2;
                System.out.println("Результат сложения: "+ num1 + " " + arg + " " + num2 + " = " + sum );}
            else if (arg.equals("-")) { sum = (num1 - num2);
                System.out.println("Результат вычитания: "+ num1 + " " + arg + " " + num2 + " = " + sum );}
            else if (arg.equals("*")) { sum = (num1 * num2);
                System.out.println("Результат умножения: "+ num1 + " " + arg + " " + num2 + " = " + sum );}
            else if (arg.equals("/")) { sum = (num1 / num2);
                System.out.println("Результат деления: "+ num1 + " " + arg + " " + num2 + " = " + sum );}
            else if (arg.equals("%")) { sum = (num1 % num2);
                System.out.println("Результат вычисления модуля: "+ num1 + " " + arg + " " + num2 + " = " + sum );}
            else {
                System.out.println(" |Что-то пошло не так... ");
            }
        }
}
