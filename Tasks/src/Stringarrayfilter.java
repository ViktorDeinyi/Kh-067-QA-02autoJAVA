import java.util.Scanner;

public class Stringarrayfilter {

    public static void main(String[] args) {

        final String result = "Результат вашего запроса следующий :";
        Scanner sc = new Scanner(System.in);
        byte more;
        int zero;
        System.out.println("Введите данные в формате [name1, name2, ..., nameX]");
        String str = sc.nextLine();
        String[] words = str.split(", ");
        boolean check = true;
        while (check) {
            System.out.println("Какой фильтр желаете применить для данных?");
            System.out.println("1 | Максимальная длинна");
            System.out.println("2 | Начальная буква(символ)");
            System.out.println("3 | Конечная буква(символ)");
            System.out.println("4 | Содержание");
            System.out.println("0 | Выход");
            int filter = sc.nextInt();
            zero = 0;
            switch (filter) {
                case 1:
                    System.out.print("Максимальная длинна слова = ");
                    int leng = sc.nextInt();
                    System.out.println(result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() <= leng) {
                            System.out.println(++zero + "[" + i + "]" + "  " + words[i]);
                        }
                    }
                    if (zero == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println("Попробуем еще раз? \n1 | да \n2 | нет");
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 2:
                    System.out.print("Начальная буква(ы)/символ(ы) = ");
                    String first = sc.next();
                    System.out.println(result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].startsWith(first)) {
                            System.out.println(++zero + "[" + i + "]" + "  " + words[i]);
                        }
                    }
                    if (zero == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println("Попробуем еще раз? \n1 | да \n2 | нет");
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 3:
                    System.out.print("Конечная буква(ы)/символ(ы) = ");
                    String last = sc.next();
                    System.out.println(result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].endsWith(last)) {
                            System.out.println(++zero + "[" + i + "]" + "  " + words[i]);
                        }
                    }
                    if (zero == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println("Попробуем еще раз? \n1 | да \n2 | нет");
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 4:
                    System.out.print("Поиск букв/символов = ");
                    String cont = sc.next();
                    System.out.println(result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].contains(cont)) {
                            System.out.println(++zero + "[" + i + "]" + "  " + words[i]);
                        }
                    }
                    if (zero == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println("Попробуем еще раз? \n1 | да \n2 | нет");
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 0:
                    check = false;
                    break;
            }
        }
        System.out.print("Спасибо за использование программы");
    }
}
