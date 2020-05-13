package by.iacademy.zadanie02.task;

import java.util.Scanner;

public class Task33 {
    public static void task33(){


        Scanner password = new Scanner(System.in);
        System.out.println("Введите пароль");
        int pass = password.nextInt();

        if (pass == 9583 || pass == 1747) {
            System.out.println("У Вас доступ к модулям A,B,C");
        }
        else if (pass == 3331 || pass == 7922) {
            System.out.println("У Вас доступ к модулям B,C");
        }
        else if (pass == 9455 || pass == 8997) {
            System.out.println("У Вас доступ к модулям C");
        }
        else {
            System.out.println("У Вас нет доступа к суперсекретной базе Пентагона=( Удачи в следующий раз!");
        }

    }
}
