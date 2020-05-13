package by.iacademy.zadanie02.task;

import java.util.Scanner;

public class Task21 {
    public static void task21(){
        String girl = "Д";
        String boy = "М";

        Scanner in = new Scanner(System.in);
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        String a = in.nextLine();
        if (a.equals(girl)) {
            System.out.println("Мне нравятся девочки!");
        }
        else if (a.equals(boy)) {
            System.out.println("Мне нравятся мальчики!");
        }
        else  {
            System.out.println(a+"? wtf? Ты кто?");
        }
    }
}
