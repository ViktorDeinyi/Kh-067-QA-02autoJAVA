import java.util.Scanner;

public class StringArrayFilter {

    public static void main(String[] args) {

        final String Result = "Результат вашего запроса следующий :";
        final String OneMore = "Желаете попробовать еще раз? \n1 | да \n2 | нет";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        byte more;
        int totalresult;


        System.out.println("Введите слова в формате [name1, name2, ..., nameX] ");
        String input = sc.nextLine();
        String[] words = input.split(", ");

        while (check) {
            totalresult = 0;
            System.out.println("Какой фильтр желаете применить для данных?");
            System.out.println("1 | Поиск слов не превышаюших заданную длинну ");
            System.out.println("2 | Поиск слов начинающихся с заданных символов");
            System.out.println("3 | Поиск слов заканчивающихся на заданные символы");
            System.out.println("4 | Поиск слов содержащих в себе комбинацию символов");
            System.out.println("0 | Выход");
            int filter = sc.nextInt();
            switch (filter) {
                case 1:
                    System.out.print("Введите максимальную длинну слова = ");
                    int leng = sc.nextInt();
                    System.out.println(Result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() <= leng) {
                            System.out.println(++totalresult + "  " + words[i]);
                        }
                    }
                    if (totalresult == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println(OneMore);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 2:
                    System.out.print("Введите начальные символы = ");
                    String first = sc.next();
                    System.out.println(Result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].startsWith(first)) {
                            System.out.println(++totalresult + "  " + words[i]);
                        }
                    }
                    if (totalresult == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println(OneMore);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 3:
                    System.out.print("Введите окончательные символы = ");
                    String last = sc.next();
                    System.out.println(Result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].endsWith(last)) {
                            System.out.println(++totalresult + "  " + words[i]);
                        }
                    }
                    if (totalresult == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println(OneMore);
                    more = sc.nextByte();
                    if (more == 1) check = true;
                    else if (more == 2) check = false;
                    break;
                case 4:
                    System.out.print("Введите символы содержащиеся в слове = ");
                    String symbol = sc.next();
                    System.out.println(Result);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].contains(symbol)) {
                            System.out.println(++totalresult + "  " + words[i]);
                        }
                    }
                    if (totalresult == 0) System.out.println("По данному запросу нет релевантных результатов");
                    System.out.println(OneMore);
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
