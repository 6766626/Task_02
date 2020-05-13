package by.iacademy.zadanie02.task;

public class Task12 {
    public static void task12() {
        double a = 2;
        double b = -14;
        double c = 45;

        if (a>0) {
            a = a*a;
        }
        else {
            a = Math.pow(a,4);
        }
        if (b>0) {
            b = b*b;
        }
        else {
            b = Math.pow(b,4);
        }
        if (c>0) {
            c = c*c;
        }
        else {
            c = Math.pow(c,4);
        }
        System.out.println("a="+a+"; b="+b+"; c="+c);
    }
}
