import java.util.Scanner;

class Homework3 {
    Scanner scanner = new Scanner(System.in);

    int cylcefor(int x) {
        int sum = 0;
        int i;
        for (i = 0; i <= x; i++) {
            sum += i;
        }
        for (i = 0; i >= x; i--) {
            sum += i;
        }
        return (sum);
    }

    int ifwhile(int y) {
        while (100 < y || y < 0) {
            System.out.println("Значение за границами диапазона (от 100 до 0), повторите еще раз:");
            y = scanner.nextInt();
        }
        System.out.println("Вы ввели значение из диопазаона!");
        return y;
    }

    String cyclewhile(String z) {
        while (!z.equals("Exit")) {
            System.out.println("Введите значение еще раз:");
            z = scanner.nextLine();
        }
        return z;
    }

    int massivProgramm(int q) {
        String[] programmArray = new String[]{"Выход", "Euronews", "Discovery", "Sport-tv", "HBO", "Nickelodeon"};
            while (true) {
                if (programmArray[q].equals(programmArray[0])) {
                    System.out.println("Звершенине программы");
                    return q;
                }
                System.out.println("Выбранный канал: " + programmArray[q]);
                System.out.println();
                System.out.println("Выберити следущий канал: ");
                q = scanner.nextInt();
            }
        }
    }

public class Main {
    static int cycleFor;
    static int ifElse;
    static String cycleWhile;;

    public static void main(String[] args) {
        Homework3 param1 = new Homework3();
        Homework3 param2 = new Homework3();
        Homework3 param3 = new Homework3();
        Homework3 param4 = new Homework3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1. Введите цифру для вычесления в цикле for:");
        int inputValue = scanner.nextInt();
        cycleFor = param1.cylcefor(inputValue);
        System.out.println();
        System.out.println("Результат:" + cycleFor);
        System.out.println();
        System.out.println("Задание 2. Введите цифру в диопазоне от 0 до 100");
        int inputValue1 = scanner.nextInt();
        scanner.nextLine();
        ifElse = param2.ifwhile(inputValue1);
        System.out.println("Результат:" + ifElse);
        System.out.println();
        System.out.println("Задание 3. Введите слово Exit для выхода из цикла while");
        String inputText = scanner.nextLine();
        cycleWhile = param3.cyclewhile(inputText);
        System.out.println("Результат:" + cycleWhile);
        System.out.println();
        System.out.println("Задание 4. Выберите канал для просмотра");
        int inputValue2 = scanner.nextInt();
        scanner.nextLine();
        param4.massivProgramm(inputValue2);
    }
}
