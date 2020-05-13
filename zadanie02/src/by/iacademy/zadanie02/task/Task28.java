package by.iacademy.zadanie02.task;

public class Task28 {
    public static void task28(){
        int a = 4;
        int b = 2;
        int c = 3;
        int d = 4;

        if (a==d) {
            System.out.println(a +"; a=d");
        }
        else if (b==d) {
            System.out.println(b +"; b=d");
        }
        else if (c==d) {
            System.out.println(c +"; c=d");
        }
        else {
            a = d-a;
            b = d-b;
            c = d-c;
            System.out.println("a-d="+a+"; b-d="+b+"; c-d="+c);
        }

    }
}
