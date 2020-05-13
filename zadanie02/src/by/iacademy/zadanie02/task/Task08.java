package by.iacademy.zadanie02.task;

public class Task08 {
    public static void task08(){
        int a = 2;
        int b = 2;

        a = a*a;
        b = b*b;

        if (a<b){
            System.out.println("a меньше= "+a);
        }
        if (b<a){
            System.out.println("b меньше= "+b);
        }
        if (b==a) {
            System.out.println(a + "=" + b);
        }
    }
}
