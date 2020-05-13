package by.iacademy.zadanie02.task;
import java.util.Scanner;
public class Task23 {
    public static void task23(){


        Scanner date = new Scanner(System.in);
        System.out.println("Введите число");
        int dd = date.nextInt();

        Scanner mounth = new Scanner(System.in);
        System.out.println("Введите месяц");
        int mm = mounth.nextInt();

        if (dd>0 && dd<=31 && mm>0 && mm<=12) {
            System.out.println("Дата верно введена. Число: "+dd+" Месяц: "+mm);
        }
        else {
            System.out.println("ошибка");
        }

    }
}
