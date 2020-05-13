package by.iacademy.zadanie02.task;

public class Task32 {
    public static void task32(){
        int a = 3;
        int b = -5;
        int c = -8;

        if ((a+b)>0) {
            System.out.print("a+b="+(a+b));
        }
        else if ((a+c)>0) {
            System.out.print("a+c="+(a+c));
        }
        else if ((b+c)>0) {
            System.out.print("b+c="+(b+c));
        }
        else {
            System.out.print("сумма любых 2ух чисел <=0");
        }
        System.out.println("");


    }
}
