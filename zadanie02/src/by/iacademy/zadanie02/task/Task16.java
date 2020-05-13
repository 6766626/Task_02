package by.iacademy.zadanie02.task;

public class Task16 {
    public static void task16(){
        int x = -1;
        int y = 0;

        if(x==0&y==0) {
            System.out.println("В начале координат");
        }
        if (x ==0 && y!=0) {
            System.out.println("На оси Y");
        }
        if (y ==0 && x!=0) {
            System.out.println("На оси X");
        }
        if (x>0&&y>0) {
            System.out.println("I четверть");
        }
        if (x<0&&y>0) {
            System.out.println("II четверть");
        }
        if (x<0&&y<0) {
            System.out.println("III четверть");
        }
        if (x>0&&y<0) {
            System.out.println("IV четверть");
        }

    }
}
