package by.iacademy.zadanie02.task;

public class Task24 {
    public static void task24(){
        int n = 1;

        if (n==0||n<0) {
            System.out.println("Нет такой ромашки");
        }
        else if (n%2==0) {
            System.out.println("Не любит");
        }
        else if (n%2!=0) {
            System.out.println("Любит");
        }
    }
}
