package by.iacademy.zadanie02.task;

public class Task18 {
    public static void task18(){
        int a = 1;
        int b = -3;
        int c = -5;
        int rez = 0;

        if (a<0) {
            rez = rez+1;
        }
        if (b<0) {
            rez = rez+1;
        }
        if (c<0) {
            rez = rez+1;
        }
        System.out.println("всего "+rez+" отрицательных чисел");
    }
}
