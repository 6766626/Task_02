package by.iacademy.zadanie02.task;

public class Task13 {
    public static void task13(){
        int x1 = 1;
        int x2 = -1;
        int y1 = 2;
        int y2 = -2;
        double a,b;
        a = Math.sqrt(Math.pow((x1),2) + Math.pow((y1),2));
        b = Math.sqrt(Math.pow((x2),2) + Math.pow((y2),2));

        if (a<b){
            System.out.println("a ближе");
        }
        if (b<a){
            System.out.println("b ближе");
        }
        if (b==a){
            System.out.println("одинаково удалены");
        }



    }
}
