package by.iacademy.zadanie02.task;

public class Task30 {
    public static void task30(){
        double a = 3;
        double b = 2;
        double c = -1;

        if (a>b&&b>c){
            a = 2*a;
            b = 2*b;
            c = 2*c;
            System.out.println("a="+a+"; b="+b+"; c="+c);
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
            System.out.println("a="+a+"; b="+b+"; c="+c);
        }
    }
}
