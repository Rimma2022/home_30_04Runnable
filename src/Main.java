import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Задание 1
         * При старте приложения запускаются три потока. Первый поток заполняет массив случайными числами. Два
         * других потока ожидают заполнения. Когда массив заполнен оба потока запускаются. Первый поток находит сумму
         * элементов массива, второй поток среднеарифметическое
         * значение в массиве. Полученный массив, сумма и среднеарифметическое возвращаются в метод main, где должны
         * быть отображены
         */
//        Mass thread1 = new Mass(10);
//        thread1.setName("Generate");
//        thread1.start();
//        try {
//            thread1.join();
//
//            Mass thread2 = new Mass(thread1.getMass().length);
//            thread2.setName("Sum");
//            Mass thread3 = new Mass(thread1.getMass().length);
//            thread3.setName("Avg");
//            thread2.setMass(thread1.getMass());
//            thread3.setMass(thread1.getMass());
//            thread2.start();
//            thread3.start();
//            System.out.println();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }





        /**
         * При старте приложения попросите пользователя ввести 2 дроби. Затем используя интерфейс Runnable запустить 4 потока,
         * которые используя лямбда-выражения выполнят действия:
         * Сумма двух дробей;
         * Разница двух дробей;
         * Произведение двух дробей;
         * Деление двух дробей.
         * Результ операций нужно вывести в консоль.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 дроби через запятую");
        System.out.println("Первая дробь:");
        double a = sc.nextDouble();
        System.out.println("Вторая дробь:");
        double b = sc.nextDouble();
        Thread thread11 = new Thread(() -> System.out.printf("Сумма дробей равна: %2.2f\n", a+b));
        thread11.start();
        Thread thread22 = new Thread(() -> {
            System.out.println("От какой дроби вычитать? Если от " + a + ", то введите 1, иначе 2");
            int с = sc.nextInt();
            if (с == 1) {
                System.out.printf("Разница дробей равна: %2.2f\n", a-b);
            } else if (с == 2) {
                System.out.printf("Разница дробей равна: %2.2f\n", b-a);
            }
        });
        thread22.start();
        Thread thread33 = new Thread(() -> System.out.printf("Умножение дробей равно: %2.2f\n", a*b));
        thread33.start();
        Thread thread44 = new Thread(() -> {
            System.out.println("Какая дробь будет делимым? Если " + a + ", то введите 1, иначе 2");
            int d = sc.nextInt();
            if (d == 1) {
                System.out.printf("Деление дробей равно: %2.2f\n", a/b);
            } else if (d == 2) {
                System.out.printf("Разница дробей равна: %2.2f\n", b/a);
            }
        });
        try {
            thread22.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread44.start();

    }
}
