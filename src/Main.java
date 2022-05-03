import java.util.Arrays;

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
        Mass thread1 = new Mass(10);
        thread1.setName("Generate");
        thread1.start();
        try {
            thread1.join();

            Mass thread2 = new Mass(thread1.getMass().length);
            thread2.setName("Sum");
            Mass thread3 = new Mass(thread1.getMass().length);
            thread3.setName("Avg");
            thread2.setMass(thread1.getMass());
            thread3.setMass(thread1.getMass());
            thread2.start();
            thread3.start();
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        /**
         * При старте приложения попросите пользователя ввести 2 дроби. Затем используя интерфейс Runnable запустить 4 потока,
         * которые используя лямбда-выражения выполнят действия:
         * Сумма двух дробей;
         * Разница двух дробей;
         * Произведение двух дробей;
         * Деление двух дробей.
         * Результ операций нужно вывести в консоль.
         */


    }
}
