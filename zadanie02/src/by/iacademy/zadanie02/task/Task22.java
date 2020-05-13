package by.iacademy.zadanie02.task;

public class Task22 {
    public static void task22(){
        int x = -1;
        int y = 5;
        int xx, yy;

        if (x<y) {
            xx = y;
            yy = x;
        }
        else {
            xx = x;
            yy = y;
        }

        x = xx;
        y = yy;

        System.out.println("x = "+x+" y = "+y);

    }
}
