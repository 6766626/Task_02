package by.iacademy.zadanie02.task;

public class Task37 {
    public static void task37(){
        int x = 10;
        double y;

        if (x>=3){
            y= -x*x+3*x+9;
        }
        else {
            y = 1/(x*x*x-6);
        }
        System.out.println(y);

    }
}
