package by.iacademy.zadanie02.task;

public class Task39 {
    public static void task39(){
        int x = 10;
        double y;

        if (x>=8){
            y= -x*x+x-9;
        }
        else {
            y = 1/(x*x*x*x-6);
        }
        System.out.println(y);
    }
}
