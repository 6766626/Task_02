package by.iacademy.zadanie02.task;

public class Task27 {
    public static void task27(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min1;
        int min2;

        if (a<b){
            min1 = a;
        }
        else {
            min1 = b;
        }
        if (c<d){
            min2 = c;
        }
        else {
            min2 = d;
        }
        if (min1>min2) {
            System.out.println(min1);
        }
        if (min2>min1) {
            System.out.println(min2);
        }
        else {
            System.out.println("Выбор сделать нельзя!");
        }


    }
}
