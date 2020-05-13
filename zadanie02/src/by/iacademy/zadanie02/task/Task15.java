package by.iacademy.zadanie02.task;

public class Task15 {
    public static void task15(){

        double x = 1;
        double y = -2;
        double a,b;
        a = x;
        b = y;

        if (x<y) {
            a = (x+y)/2;
            b = x*y*2;
        }
        if (y<x) {
            b = (x+y)/2;
            a = x*y*2;
        }
        System.out.println(a+" и "+b);

    }
}
