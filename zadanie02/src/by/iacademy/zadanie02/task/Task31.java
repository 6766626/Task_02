package by.iacademy.zadanie02.task;

public class Task31 {
    public static void task31(){
        int A = 10;
        int B = 3;

        int x = 11;
        int y = 12;
        int z = 3;

        if ((x<=A&&y<=B)||(y<=A&&x<=B)||
                (x<=A&&z<=B)||(z<=A&&x<=B)||
                (z<=A&&y<=B)||(y<=A&&z<=B)){
            System.out.println("Проходит");
        }
        else {
            System.out.println("НЕ проходит");
        }
    }
}
