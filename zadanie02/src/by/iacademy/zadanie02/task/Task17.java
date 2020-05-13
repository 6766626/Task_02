package by.iacademy.zadanie02.task;

public class Task17 {
    public static void task17(){
        int m = -123;
        int n = 123;

        if (m==n){
            m = 0;
            n = 0;
        }
        else if (m>n) {
            m = m;
            n = m;
        }
        else if (n>m) {
            m = n;
            n = n;
        }

        System.out.println("m="+m+"; n ="+n);
    }
}
